package Calc;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyGUI {

	private JFrame frame;
	private JTextField text1;
 
	public enum Operation {
		Mult, Add, Sub, Div;
	}
 
	private Operation myOp;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGUI window = new MyGUI();
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
	public MyGUI() {
		initialize();
	}
 
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
 
		JButton Badd = new JButton("+");
		Badd.setForeground(Color.BLACK);
		Badd.setBackground(UIManager.getColor("Button.background"));
		Badd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 
				text1.setText(text1.getText() + "+");
				myOp = Operation.Add;
 
			}
		});
		Badd.setBounds(0, 0, 89, 23);
		frame.getContentPane().add(Badd);
 
		JButton Bsub = new JButton("-");
		Bsub.setForeground(Color.BLACK);
		Bsub.setBackground(UIManager.getColor("Button.background"));
		Bsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 
				text1.setText(text1.getText() + "-");
				myOp = Operation.Sub;
			}
		});
		Bsub.setBounds(87, 0, 89, 23);
		frame.getContentPane().add(Bsub);
 
		text1 = new JText	Field();
		text1.setForeground(Color.RED);
		text1.setBounds(17, 57, 241, 20);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
 
		JButton B1 = new JButton("1");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				text1.setText(text1.getText() + "1");
			}
		});
		B1.setBounds(17, 88, 72, 23);
		frame.getContentPane().add(B1);
 
		JButton B2 = new JButton("2");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(text1.getText() + "2");
			}
		});
		B2.setBounds(104, 88, 72, 23);
		frame.getContentPane().add(B2);
 
		JButton B5 = new JButton("5");
		B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(text1.getText() + "5");
			}
		});
		B5.setBounds(104, 122, 72, 23);
		frame.getContentPane().add(B5);
 
		JButton B8 = new JButton("8");
		B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(text1.getText() + "8");
			}
		});
		B8.setBounds(104, 159, 72, 23);
		frame.getContentPane().add(B8);
 
		JButton B3 = new JButton("3");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(text1.getText() + "3");
			}
		});
		B3.setBounds(186, 88, 72, 23);
		frame.getContentPane().add(B3);
 
		JButton B6 = new JButton("6");
		B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(text1.getText() + "6");
			}
		});
		B6.setBounds(186, 122, 72, 23);
		frame.getContentPane().add(B6);
 
		JButton B9 = new JButton("9");
		B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(text1.getText() + "9");
			}
		});
		B9.setBounds(186, 159, 72, 23);
		frame.getContentPane().add(B9);
 
		JButton B4 = new JButton("4");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(text1.getText() + "4");
			}
		});
		B4.setBounds(17, 122, 72, 23);
		frame.getContentPane().add(B4);
 
		JButton B7 = new JButton("7");
		B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(text1.getText() + "7");
			}
		});
		B7.setBounds(17, 159, 72, 23);
		frame.getContentPane().add(B7);
 
		JButton B0 = new JButton("0");
		B0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(text1.getText() + "0");
			}
		});
		B0.setBounds(270, 159, 72, 23);
		frame.getContentPane().add(B0);
 
		JButton Bmult = new JButton("*");
		Bmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 
				text1.setText(text1.getText() + "*");
				myOp = Operation.Mult;
 
			}
		});
		Bmult.setBounds(0, 23, 89, 23);
		frame.getContentPane().add(Bmult);
 
		JButton Bdiv = new JButton("/");
		Bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
 
				text1.setText(text1.getText() + "/");
				myOp = Operation.Div;
			}
		});
		Bdiv.setBounds(87, 23, 89, 23);
		frame.getContentPane().add(Bdiv);
 
		JButton Bequal = new JButton("=");
		Bequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String batman = text1.getText();
 
				if (myOp == Operation.Add) {
					String[] HOOLALA = batman.split("\\+");
					double mummy = Double.parseDouble(HOOLALA[1]);
					double nummy = Double.parseDouble(HOOLALA[0]);
					double answer = nummy + mummy;
					text1.setText("" + answer);
				} else if (myOp == Operation.Sub) {
					String[] HOOLALA = batman.split("-");
					double mummy = Double.parseDouble(HOOLALA[1]);
					double nummy = Double.parseDouble(HOOLALA[0]);
					double answer = nummy - mummy;
					text1.setText("" + answer);
				} else if (myOp == Operation.Mult) {
					String[] HOOLALA = batman.split("\\*");
					double mummy = Double.parseDouble(HOOLALA[1]);
					double nummy = Double.parseDouble(HOOLALA[0]);
					double answer = nummy * mummy;
					text1.setText("" + answer);
				} else if (myOp == Operation.Div) {
					String[] HOOLALA = batman.split("/");
					double mummy = Double.parseDouble(HOOLALA[1]);
					double nummy = Double.parseDouble(HOOLALA[0]);
					double answer = nummy / mummy;
					text1.setText("" + answer);
				}
 
			}
		});
		Bequal.setBounds(268, 88, 72, 23);
		frame.getContentPane().add(Bequal);
 
		JButton Bmusic = new JButton("Music");
		Bmusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showOpenDialog(null);
				File selectedFile = fileChooser.getSelectedFile();
 
				System.out.println("Selected file: " + selectedFile.getAbsolutePath());
 
				MP3 music = new MP3(selectedFile.getAbsolutePath());
 
				music.play();
 
			}
		});
		Bmusic.setBounds(174, 23, 89, 23);
		frame.getContentPane().add(Bmusic);
 
		JButton Bclear = new JButton("Clear");
		Bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
			}
		});
		Bclear.setBounds(174, 0, 89, 23);
		frame.getContentPane().add(Bclear);
		
		JButton Bdec = new JButton(".");
		Bdec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(text1.getText() + ".");
			}
		});
		Bdec.setBounds(270, 122, 72, 23);
		frame.getContentPane().add(Bdec);
	}
	
}
