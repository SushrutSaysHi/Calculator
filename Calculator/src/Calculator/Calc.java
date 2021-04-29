package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	//launching the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//making the application 
	Calc() {
		initialize();
	}

	//creating the components
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 467, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 433, 94);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel labeldis = new JLabel("New label");
		labeldis.setFont(new Font("Tahoma", Font.BOLD, 18));
		labeldis.setBounds(394, 11, 49, 14);
		frame.getContentPane().add(labeldis);
		
		JButton button = new JButton("%");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(10, 116, 60, 56);
		frame.getContentPane().add(button);
		
		JButton buttoncancel = new JButton("C");
		buttoncancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttoncancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttoncancel.setBounds(58, 116, 60, 56);
		frame.getContentPane().add(buttoncancel);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labeldis.setText(textField.getText() + button1.getText());
				String number=textField.getText() + button1.getText();
				textField.setText(number);
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 18));
		button1.setBounds(10, 170, 159, 76);
		frame.getContentPane().add(button1);
		
		JButton buttondiv = new JButton("/");
		buttondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		buttondiv.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttondiv.setBounds(117, 116, 60, 56);
		frame.getContentPane().add(buttondiv);
		
		JButton button2 = new JButton("2");
		button2.setFont(new Font("Tahoma", Font.BOLD, 18));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + button2.getText();
				textField.setText(number);
			}
		});
		button2.setBounds(167, 170, 140, 76);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + button3.getText();
				textField.setText(number);
			}
		});
		button3.setBounds(303, 170, 140, 76);
		frame.getContentPane().add(button3);
		
		JButton buttonmultiply = new JButton("*");
		buttonmultiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		buttonmultiply.setBounds(174, 116, 60, 56);
		frame.getContentPane().add(buttonmultiply);
		
		JButton buttonadd = new JButton("+");
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		buttonadd.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonadd.setBounds(288, 116, 69, 56);
		frame.getContentPane().add(buttonadd);
		
		JButton buttonsub = new JButton("-");
		buttonsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		buttonsub.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonsub.setBounds(231, 116, 60, 56);
		frame.getContentPane().add(buttonsub);
		
		JButton button4 = new JButton("4");
		button4.setFont(new Font("Tahoma", Font.BOLD, 18));
		button4.setBounds(10, 243, 159, 76);
		frame.getContentPane().add(button4);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + button4.getText();
				textField.setText(number);
			}
		});

		
		
		JButton button5 = new JButton("5");
		button5.setFont(new Font("Tahoma", Font.BOLD, 18));
		button5.setBounds(167, 243, 140, 76);
		frame.getContentPane().add(button5);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + button5.getText();
				textField.setText(number);
			}
		});

		
		JButton button6 = new JButton("6");
		button6.setFont(new Font("Tahoma", Font.BOLD, 18));
		button6.setBounds(303, 243, 140, 76);
		frame.getContentPane().add(button6);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + button6.getText();
				textField.setText(number);
			}
		});

		
		JButton button7 = new JButton("7");
		button7.setFont(new Font("Tahoma", Font.BOLD, 18));
		button7.setBounds(10, 317, 159, 76);
		frame.getContentPane().add(button7);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + button7.getText();
				textField.setText(number);
			}
		});

		
		JButton button8 = new JButton("8");
		button8.setFont(new Font("Tahoma", Font.BOLD, 18));
		button8.setBounds(167, 317, 140, 76);
		frame.getContentPane().add(button8);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + button8.getText();
				textField.setText(number);
			}
		});

		
		JButton button9 = new JButton("9");
		button9.setFont(new Font("Tahoma", Font.BOLD, 18));
		button9.setBounds(303, 317, 140, 76);
		frame.getContentPane().add(button9);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + button9.getText();
				textField.setText(number);
			}
		});

		
		JButton button0 = new JButton("0");
		button0.setFont(new Font("Tahoma", Font.BOLD, 18));
		button0.setBounds(10, 388, 159, 76);
		frame.getContentPane().add(button0);
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + button0.getText();
				textField.setText(number);
			}
		});

		
		JButton buttondeci = new JButton(".");
		buttondeci.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttondeci.setBounds(167, 388, 140, 76);
		frame.getContentPane().add(buttondeci);
		
		JButton buttonDelete = new JButton("\u2190");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String BackSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder back=new StringBuilder(textField.getText());
					back.deleteCharAt(textField.getText().length()-1);
					BackSpace=back.toString();
					textField.setText(BackSpace);
				}
			}
		});
		buttonDelete.setFont(new Font("Century Gothic", Font.BOLD, 18));
		buttonDelete.setBounds(303, 387, 140, 76);
		frame.getContentPane().add(buttonDelete);
		
		JButton buttonequals = new JButton("=");
		buttonequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				
				if(operation=="+") {
				result=first+second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
					}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
					}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
					}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
					
					}
	
			}
		});
		buttonequals.setFont(new Font("Tahoma", Font.BOLD, 18));
		buttonequals.setBounds(354, 116, 89, 56);
		frame.getContentPane().add(buttonequals);
		
		buttondeci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText() + buttondeci.getText();
				textField.setText(number);
			}
		});

	}
}