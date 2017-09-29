import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator extends JFrame{

	private JTextField txtField;
	private JButton btn0 , btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 , btn9;
	private JButton btnDot , btnEql , btnClr , btnSum , btnSub , btnMul , btnDiv;
	
	private double firstNumber;
	private double secondNumber;
	private double result;
	private String operation;
	private String answer;
	
	public Calculator(){
		
		this.setSize(300 , 470);
		this.setTitle("Basic Standard Calculator");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		addComponentsToFrame();
		addMouseListenerToButtonAnnonymus();
	}
	
	public void addComponentsToFrame(){
		
		txtField = new JTextField();
		txtField.setBounds(10, 10, 275, 70);
		txtField.setFont(new Font("SansSerif" , Font.BOLD , 30));
		txtField.setHorizontalAlignment(JTextField.RIGHT);
		this.add(txtField);
		
		// row 1
		
		btn7 = new JButton("7");
		btn7.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btn7.setBounds(10 , 90 , 60 , 60);
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(new Color(220 , 120 , 125));
		this.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btn8.setBounds(80 , 90 , 60 , 60);
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(new Color(220 , 120 , 125));
		this.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btn9.setBounds(150 , 90 , 60 , 60);
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(new Color(220 , 120 , 125));
		this.add(btn9);
		
		btnDiv = new JButton("/");
		btnDiv.setFont(new Font("SansSerif" , Font.BOLD , 30));
		btnDiv.setBounds(220 , 90 , 60 , 60);
		btnDiv.setForeground(Color.WHITE);
		btnDiv.setBackground(new Color(104 , 130 , 190));
		this.add(btnDiv);
		
		// row 2
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btn4.setBounds(10 , 160 , 60 , 60);
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(new Color(220 , 120 , 125));
		this.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btn5.setBounds(80 , 160 , 60 , 60);
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(new Color(220 , 120 , 125));
		this.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btn6.setBounds(150 , 160 , 60 , 60);
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(new Color(220 , 120 , 125));
		this.add(btn6);
		
		btnMul = new JButton("*");
		btnMul.setFont(new Font("SansSerif" , Font.BOLD , 30));
		btnMul.setBounds(220 , 160 , 60 , 60);
		btnMul.setForeground(Color.WHITE);
		btnMul.setBackground(new Color(104 , 130 , 190));
		this.add(btnMul);
		
		// row 3
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btn1.setBounds(10 , 230 , 60 , 60);
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(new Color(220 , 120 , 125));
		this.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btn2.setBounds(80 , 230 , 60 , 60);
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(new Color(220 , 120 , 125));
		this.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btn3.setBounds(150 , 230 , 60 , 60);
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(new Color(220 , 120 , 125));
		this.add(btn3);
		
		btnSub = new JButton("-");
		btnSub.setFont(new Font("SansSerif" , Font.BOLD , 30));
		btnSub.setBounds(220 , 230 , 60 , 60);
		btnSub.setForeground(Color.WHITE);
		btnSub.setBackground(new Color(104 , 130 , 190));
		this.add(btnSub);
		
		// row 4
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btn0.setBounds(10 , 300 , 130 , 60);
		btn0.setForeground(Color.WHITE);
		btn0.setBackground(new Color(220 , 120 , 125));
		this.add(btn0);
		
		btnDot = new JButton(".");
		btnDot.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btnDot.setBounds(150 , 300 , 60 , 60);
		btnDot.setForeground(Color.WHITE);
		btnDot.setBackground(new Color(220 , 120 , 125));
		this.add(btnDot);
		
		btnSum = new JButton("+");
		btnSum.setFont(new Font("SansSerif" , Font.BOLD , 30));
		btnSum.setBounds(220 , 300 , 60 , 60);
		btnSum.setForeground(Color.WHITE);
		btnSum.setBackground(new Color(104 , 130 , 190));
		this.add(btnSum);
		
		// row 5
		
		btnClr = new JButton("Clear");
		btnClr.setFont(new Font("SansSerif" , Font.BOLD , 20));
		btnClr.setBounds(10 , 370 , 130 , 60);
		btnClr.setForeground(Color.WHITE);
		btnClr.setBackground(new Color(115 , 190 , 145));
		this.add(btnClr);
		
		btnEql = new JButton("=");
		btnEql.setFont(new Font("SansSerif" , Font.BOLD , 30));
		btnEql.setBounds(150 , 370 , 130 , 60);
		btnEql.setForeground(Color.WHITE);
		btnEql.setBackground(new Color(115 , 190 , 145));
		this.add(btnEql);
	}
	
	public void addMouseListenerToButtonAnnonymus(){
		
		this.btn0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btn0.getText();
				txtField.setText(number);
			}
		});
		
		this.btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btn1.getText();
				txtField.setText(number);
			}
		});
		
		this.btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btn2.getText();
				txtField.setText(number);
			}
		});
		
		this.btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btn3.getText();
				txtField.setText(number);
			}
		});
		
		this.btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btn4.getText();
				txtField.setText(number);
			}
		});
		
		this.btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btn5.getText();
				txtField.setText(number);
			}
		});
		
		this.btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btn6.getText();
				txtField.setText(number);
			}
		});
		
		this.btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btn7.getText();
				txtField.setText(number);
			}
		});
		
		this.btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btn8.getText();
				txtField.setText(number);
			}
		});
		
		this.btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btn9.getText();
				txtField.setText(number);
			}
		});
		
		this.btnDot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String number = txtField.getText() + btnDot.getText();
				txtField.setText(number);
			}
		});
		
		this.btnSum.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operation = "+";
			}
		});
		
		this.btnSub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operation = "-";
			}
		});
		
		this.btnMul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operation = "*";
			}
		});
		
		this.btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				firstNumber = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operation = "/";
			}
		});
		
		this.btnClr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtField.setText(null);
			}
		});
		
		this.btnEql.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				secondNumber = Double.parseDouble(txtField.getText());
				
				if( operation == "+" ){
					
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					txtField.setText(answer);
				}else if( operation == "-" ){
					
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					txtField.setText(answer);
				}else if( operation == "*" ){
					
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					txtField.setText(answer);
				}else if( operation == "/" ){
					
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					txtField.setText(answer);
				}
			}
		});
	}
}
