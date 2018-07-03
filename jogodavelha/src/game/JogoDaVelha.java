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
	private String lblBtn1 = "";
	private String lblBtn2 = "";
	private String lblBtn3 = "";
	private String lblBtn4 = "";
	private String lblBtn5 = "";
	private String lblBtn6 = "";
	private String lblBtn7 = "";
	private String lblBtn8 = "";
	private String lblBtn9 = "";
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
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			    btn1.setText(jogadorDaVez);
			    if (jogadorDaVez.equalsIgnoreCase("X")) {
			    	btn1.setForeground(Color.RED);
			    } else {
					btn1.setForeground(Color.BLUE);
				}	
		        
			    escolherJogador();
			    lblBtn1 = btn1.getText();
			    conferirJogo();
			
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_1.add(btn1, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));

		JButton btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				btn2.setText(jogadorDaVez);
			    if (jogadorDaVez.equalsIgnoreCase("X")) {
			    	btn2.setForeground(Color.RED);
			    } else {
					btn2.setForeground(Color.BLUE);
				}	
		        
			    escolherJogador();
			    lblBtn2 = btn2.getText();
			    conferirJogo();
			
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_2.add(btn2, BorderLayout.CENTER);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));

		JButton btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				btn3.setText(jogadorDaVez);
			    if (jogadorDaVez.equalsIgnoreCase("X")) {
			    	btn3.setForeground(Color.RED);
			    } else {
					btn3.setForeground(Color.BLUE);
				}	
		        
			    escolherJogador();
			    lblBtn3 = btn3.getText();
			    conferirJogo();
			
			}
		});
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
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(jogadorDaVez);
			    if (jogadorDaVez.equalsIgnoreCase("X")) {
			    	btn4.setForeground(Color.RED);
			    } else {
					btn4.setForeground(Color.BLUE);
				}	
		        
			    escolherJogador();
			    lblBtn4 = btn4.getText();
			    conferirJogo();
			
			
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_7.add(btn4, BorderLayout.CENTER);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));

		JButton btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(jogadorDaVez);
			    if (jogadorDaVez.equalsIgnoreCase("X")) {
			    	btn5.setForeground(Color.RED);
			    } else {
					btn5.setForeground(Color.BLUE);
				}	
		        
			    escolherJogador();
			    lblBtn5 = btn5.getText();
			    conferirJogo();
			
			
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_6.add(btn5, BorderLayout.CENTER);

		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));

		JButton btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(jogadorDaVez);
			    if (jogadorDaVez.equalsIgnoreCase("X")) {
			    	btn6.setForeground(Color.RED);
			    } else {
					btn6.setForeground(Color.BLUE);
				}	
		        
			    escolherJogador();
			    lblBtn6 = btn6.getText();
			    conferirJogo();
			
			
			
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 40));
		panel_8.add(btn6, BorderLayout.CENTER);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));

		JLabel lblO = new JLabel("JOGADOR 2");
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
				btn7.setText(jogadorDaVez);
			    if (jogadorDaVez.equalsIgnoreCase("X")) {
			    	btn7.setForeground(Color.RED);
			    } else {
					btn7.setForeground(Color.BLUE);
				}	
		        
			    escolherJogador();
			    lblBtn7 = btn7.getText();
			    conferirJogo();
			
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
				btn8.setText(jogadorDaVez);
			    if (jogadorDaVez.equalsIgnoreCase("X")) {
			    	btn8.setForeground(Color.RED);
			    } else {
					btn8.setForeground(Color.BLUE);
				}	
		        
			    escolherJogador();
			    lblBtn8 = btn8.getText();
			    conferirJogo();
			
			
			
			}
		});
		panel_12.add(btn8, BorderLayout.CENTER);

		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(panel_13);
		panel_13.setLayout(new BorderLayout(0, 0));

		JButton btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(jogadorDaVez);
			    if (jogadorDaVez.equalsIgnoreCase("X")) {
			    	btn9.setForeground(Color.RED);
			    } else {
					btn9.setForeground(Color.BLUE);
				}	
		        
			    escolherJogador();
			    lblBtn9 = btn9.getText();
			    conferirJogo();
			
			
			}
		});
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
			public void actionPerformed(ActionEvent arg0) {
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
		oPontos.setText(String.valueOf(oCount));
	}

	private void escolherJogador() {
		if (jogadorDaVez.equalsIgnoreCase("X")) {
			jogadorDaVez = "O";
		} else {
			jogadorDaVez = "X";

		}
	}

	private void conferirJogo() {
		String b1 = lblBtn1 == null? "" : lblBtn1;
		String b2 = lblBtn2 == null? "" : lblBtn2;
		String b3 = lblBtn3 == null? "" : lblBtn3;
		String b4 = lblBtn4 == null? "" : lblBtn4;
		String b5 = lblBtn5 == null? "" : lblBtn5;
		String b6 = lblBtn6 == null? "" : lblBtn6;
		String b7 = lblBtn7 == null? "" : lblBtn7;
		String b8 = lblBtn8 == null? "" : lblBtn8;
		String b9 = lblBtn9 == null? "" : lblBtn9;

		// Player1
		if ((b1.equalsIgnoreCase("X") && b2.equalsIgnoreCase("X") && b3.equalsIgnoreCase("X")) ||
		(b4.equalsIgnoreCase("X") && b5.equalsIgnoreCase("X") && b6.equalsIgnoreCase("X")) ||
		(b7.equalsIgnoreCase("X") && b8.equalsIgnoreCase("X") && b9.equalsIgnoreCase("X")) ||
		(b1.equalsIgnoreCase("X") && b5.equalsIgnoreCase("X") && b9.equalsIgnoreCase("X")) ||
		(b7.equalsIgnoreCase("X") && b5.equalsIgnoreCase("X") && b3.equalsIgnoreCase("X")) ||
		(b1.equalsIgnoreCase("X") && b4.equalsIgnoreCase("X") && b7.equalsIgnoreCase("X")) ||
		(b2.equalsIgnoreCase("X") && b5.equalsIgnoreCase("X") && b8.equalsIgnoreCase("X")) ||
		(b3.equalsIgnoreCase("X") && b6.equalsIgnoreCase("X") && b9.equalsIgnoreCase("X")))
		{
			JOptionPane.showMessageDialog(
					frame, 
					"Player 1 ganhou!", 
					"Jogo da Velha", 
					JOptionPane.INFORMATION_MESSAGE);
			
			xCount++;
			marcarPontos();
			gameOver();
			;

		}
	
		// Player2
		if ((b1.equalsIgnoreCase("O") && b2.equalsIgnoreCase("O") && b3.equalsIgnoreCase("O")) ||
		(b4.equalsIgnoreCase("O") && b5.equalsIgnoreCase("O") && b6.equalsIgnoreCase("O")) ||
		(b7.equalsIgnoreCase("O") && b8.equalsIgnoreCase("O") && b9.equalsIgnoreCase("O")) ||
		(b1.equalsIgnoreCase("O") && b5.equalsIgnoreCase("O") && b9.equalsIgnoreCase("O")) ||
		(b7.equalsIgnoreCase("O") && b5.equalsIgnoreCase("O") && b3.equalsIgnoreCase("O")) ||
		(b1.equalsIgnoreCase("O") && b4.equalsIgnoreCase("O") && b7.equalsIgnoreCase("O")) ||
		(b2.equalsIgnoreCase("O") && b5.equalsIgnoreCase("O") && b8.equalsIgnoreCase("O")) ||
		(b3.equalsIgnoreCase("O") && b6.equalsIgnoreCase("O") && b9.equalsIgnoreCase("O")))
		{
			JOptionPane.showMessageDialog(
					frame, 
					"Player 2 ganhou!", 
					"Jogo da Velha", 
					JOptionPane.INFORMATION_MESSAGE);
			
			oCount++;
			marcarPontos();
			gameOver();
			;

		}
	
	
	
	}
}