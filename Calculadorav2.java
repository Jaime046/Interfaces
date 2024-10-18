package com.example.Ejercicios_basicos_java;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadorav2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	private int num1, num2, result; // Cambiar de double a int
	private String operator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadorav2 frame = new Calculadorav2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadorav2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 845, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(178, 20, 424, 99);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton mas = new JButton("+");
		mas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(textField.getText()); // Cambiar a Integer
				operator = "+";
				textField.setText("");
			}
		});
		mas.setBounds(30, 25, 85, 21);
		contentPane.add(mas);
		
		JButton menos = new JButton("-");
		menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(textField.getText()); // Cambiar a Integer
				operator = "-";
				textField.setText("");
			}
		});
		menos.setBounds(30, 84, 85, 21);
		contentPane.add(menos);
		
		JButton Multiplicacion = new JButton("X");
		Multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(textField.getText()); // Cambiar a Integer
				operator = "*";
				textField.setText("");
			}
		});
		Multiplicacion.setBounds(680, 25, 85, 21);
		contentPane.add(Multiplicacion);
		
		JButton Division = new JButton("/");
		Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(textField.getText()); // Cambiar a Integer
				operator = "/";
				textField.setText("");
			}
		});
		Division.setBounds(680, 84, 85, 21);
		contentPane.add(Division);
		
		JButton btnNewButton_4 = new JButton("=");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Integer.parseInt(textField.getText()); // Cambiar a Integer
				switch (operator) {
					case "+":
						result = num1 + num2;
						break;
					case "-":
						result = num1 - num2;
						break;
					case "*":
						result = num1 * num2;
						break;
					case "/":
						result = num1 / num2; // Divisiones entre enteros
						break;
				}
				textField.setText(String.valueOf(result)); // Mostrar el resultado entero
			}
		});
		btnNewButton_4.setBounds(416, 142, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JButton uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		uno.setBounds(30, 196, 123, 99);
		contentPane.add(uno);
		
		JButton dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		dos.setBounds(178, 196, 123, 99);
		contentPane.add(dos);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		tres.setBounds(335, 196, 123, 99);
		contentPane.add(tres);
		
		JButton cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		cuatro.setBounds(496, 196, 123, 99);
		contentPane.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		cinco.setBounds(662, 196, 123, 99);
		contentPane.add(cinco);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		seis.setBounds(30, 326, 123, 99);
		contentPane.add(seis);
		
		JButton siete = new JButton("7");
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		siete.setBounds(178, 326, 123, 99);
		contentPane.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		ocho.setBounds(339, 326, 123, 99);
		contentPane.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		nueve.setBounds(496, 326, 123, 99);
		contentPane.add(nueve);
		
		JButton cero = new JButton("0");
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		cero.setBounds(662, 326, 123, 99);
		contentPane.add(cero);
		
		JButton borrar = new JButton("borrar");
		borrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		borrar.setBounds(244, 142, 85, 21);
		contentPane.add(borrar);
	}
}

