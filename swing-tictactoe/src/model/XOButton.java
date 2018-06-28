package model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class XOButton extends JButton implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ImageIcon X, O;

	// 0 = nada; 1 = X; 2=0;
	int value = 0;

	public XOButton() {
		X = new ImageIcon(this.getClass().getResource("X.jpg"));
		O = new ImageIcon(this.getClass().getResource("O.jpg"));
		this.addActionListener(this);
	}

	public void actionPerformed(ActionEvent arg0) {
		value++;
		value %= 3;

		switch (value) {
		case 0:
			setIcon(null);
			break;
		case 1:
			setIcon(X);
			break;
		case 2:
			setIcon(O);
			break;
		default:
			break;

		}
	}
}