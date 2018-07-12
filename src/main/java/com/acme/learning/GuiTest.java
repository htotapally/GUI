package com.acme.learning;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GuiTest extends Frame implements WindowListener {

	public GuiTest() {
		setSize(600, 500);
		
		setBackground(Color.CYAN);
		this.setTitle("This is my first GUI");
		
		setVisible(true);
		
		// this is a frame
		
		// this is also a window listener
		
		// we can add a windowlistener to a frame
		addWindowListener(this);
		
		// Let us set the layout to a GridLayout with 4 rows, and 2 columns
		int nRows = 4;
		int nCols = 2;
		GridLayout layout = new GridLayout(nRows, nCols);
		
		setLayout(layout);
		
		final Label labelName = new Label("First Name");
		labelName.setAlignment(Label.RIGHT);
		this.add(labelName);
		
		final TextField tfFirstName = new TextField();
		this.add(tfFirstName);
		
		Label labelGender = new Label("Gender");
		labelGender.setAlignment(Label.RIGHT);
		this.add(labelGender);

		final TextField tfGender = new TextField();
		this.add(tfGender);


		Label labelAge = new Label("Age");
		labelAge.setAlignment(Label.RIGHT);
		this.add(labelAge);

		final TextField tfAge = new TextField();
		this.add(tfAge);

		Label labelBlank = new Label("");
		this.add(labelBlank);

		
		Button button = new Button("Save");
		this.add(button);
		
		// You are adding an Ananymous Listener
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Handle AtionEvent");
				System.out.println(tfFirstName.getText() + "|" + tfGender.getText() + "|" + tfAge.getText());
				
				// Modify the program so that pipe delimited information is appended to a file
				
			}
			
		});
		
	}
	
	public static void main(String[] args) {
		
		Frame f = new GuiTest();
		// f.addWindowListener(f);
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Executing window activated Event");		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Executing windowClosed Event");
		System.exit(1);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Executing windowClosing Event");
		
		int statusCode = 1;
		System.exit(statusCode);
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Executing window deactivated Event");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Window Deiconified event is fired");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Window Iconified Event is fired");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("WindowOpened Event is fired");
		
	}
}
