package es.studium.Ejercicio6;

import java.awt.FileDialog;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.JFrame;

public class Ejercicio6 
{
	public Ejercicio6()
	{
		JFrame frame = new JFrame();
		frame.setLayout(new GridLayout(2,1,2,2));
		frame.setSize(500,650);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
			FileDialog fd = new FileDialog(frame, "Choose a file", FileDialog.LOAD);
			fd.setDirectory("C:\\");
			fd.setFile("*.xml");
			
			fd.setVisible(true);
			String filename = fd.getFile();
			if (filename == null)
			  System.out.println("You cancelled the choice");
			else
			  System.out.println("You chose " + filename);
	}
	public static void main(String[] args)
	{
		
		new Ejercicio6();
		

	}

}
