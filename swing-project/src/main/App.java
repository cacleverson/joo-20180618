package main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame frame = new JFrame("Casa do Swing");
                frame.setLayout(new BorderLayout());	
			
                JTextArea textArea = new JTextArea();
                
                JButton button = new JButton("Diga oi");
                
                Container container = frame.getContentPane();
                container.add(textArea, BorderLayout.CENTER);
                container.add(button, BorderLayout.SOUTH);
			
                frame.setSize(500, 400);
                
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                frame.setVisible(true);
                
                button.addActionListener(new ActionListener() {
                
                public void actionPerformed(ActionEvent e) {
                	textArea.append("Oi!\n");
                }
                	
			});
			
			} 
		});
		
	}

}
