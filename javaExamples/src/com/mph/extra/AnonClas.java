package com.mph.extra;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonClas {

	private Frame f;

	public AnonClas() {
		f = new Frame("Welcome to Mphasis");
	}

	public void launchFrame() {
		f.setSize(500, 700);
		f.setBackground(Color.BLUE);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		AnonClas ac = new AnonClas();
		ac.launchFrame();

	}

}