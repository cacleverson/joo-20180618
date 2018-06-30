package game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JogoDaVelha {

	private JFrame frame;
	private JTextField xPontos;
	private JTextField oPontos;
	private String lblBtn1;
	private String lblBtn2;
	private String lblBtn3;
	private String lblBtn4;
	private String lblBtn5;
	private String lblBtn6;
	private String lblBtn7;
	private String lblBtn8;
	private String lblBtn9;
	private String jogadorDaVez = "X";
	private int xCount;
	private int oCount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoDaVelha window = new JogoDaVelha();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JogoDaVelha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 5, 2, 2));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));

		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_1.add(btn1, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_2.add(btn2, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_3.add(btn3, BorderLayout.CENTER);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		JLabel lblX = new JLabel("JOGADOR 1");
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_4.add(lblX, BorderLayout.CENTER);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));

		xPontos = new JTextField();
		xPontos.setHorizontalAlignment(SwingConstants.CENTER);
		xPontos.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_5.add(xPontos, BorderLayout.CENTER);
		xPontos.setColumns(10);

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_7.add(btn4, BorderLayout.CENTER);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_6.add(btn5, BorderLayout.CENTER);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_8.add(btn6, BorderLayout.CENTER);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		JLabel lblO = new JLabel("O");
		lblO.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblO, BorderLayout.CENTER);

		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_10);
		panel_10.setLayout(new BorderLayout(0, 0));

		oPontos = new JTextField();
		oPontos.setHorizontalAlignment(SwingConstants.CENTER);
		oPontos.setFont(new Font("Dialog", Font.PLAIN, 40));
		oPontos.setText("");
		panel_10.add(oPontos, BorderLayout.CENTER);
		oPontos.setColumns(10);

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_11);
		panel_11.setLayout(new BorderLayout(0, 0));

		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_11.add(btn7, BorderLayout.CENTER);

		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_12);
		panel_12.setLayout(new BorderLayout(0, 0));

		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_12.add(btn8, BorderLayout.CENTER);

		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		JButton btn9 = new JButton("");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_13.add(btn9, BorderLayout.CENTER);

		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				// 1

				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);

				gameOver();

			}

		});
		btnReset.setForeground(Color.BLUE);
		btnReset.setFont(new Font("Vivaldi", Font.PLAIN, 40));
		panel_14.add(btnReset, BorderLayout.CENTER);

		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_15);
		panel_15.setLayout(new BorderLayout(0, 0));

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 2
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Quer sair mesmo?", "Jogo da Velha",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setForeground(Color.BLUE);
		btnExit.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 40));
		panel_15.add(btnExit, BorderLayout.CENTER);

	}

	protected void gameOver() {

		lblBtn1 = "";
		lblBtn2 = "";
		lblBtn3 = "";
		lblBtn4 = "";
		lblBtn5 = "";
		lblBtn6 = "";
		lblBtn7 = "";
		lblBtn8 = "";
		lblBtn9 = "";

	}

	private void marcarPontos() {
		xPontos.setText(String.valueOf(xCount));
		oPontos.setText(String.valueOf(oPontos));
	}

	private void escolherJogador() {
		if (jogadorDaVez.equalsIgnoreCase("X")) {
			jogadorDaVez = "0";
		} else {
			jogadorDaVez = "X";

		}
	}

	private void conferirJogo() {
		String b1 = lblBtn1;
		String b2 = lblBtn2;
		String b3 = lblBtn3;
		String b4 = lblBtn4;
		String b5 = lblBtn5;
		String b6 = lblBtn6;
		String b7 = lblBtn7;
		String b8 = lblBtn8;
		String b9 = lblBtn9;

		// Player1
		if (b1.equalsIgnoreCase("X") && b2.equalsIgnoreCase("X") && b3.equalsIgnoreCase("X")) {
			JOptionPane.showMessageDialog(frame, "Player 1 ganhou!", "Jogo da Velha", JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			marcarPontos();
			gameOver();
			;

		}
	}
}