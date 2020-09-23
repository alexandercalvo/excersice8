package com.learning.window;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.learning.add.PrimeNumbers;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class RewriteNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber;
	private JTextArea txtOutcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RewriteNumber frame = new RewriteNumber();
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
	public RewriteNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 367, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 366, 309);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRescribirNumeros = new JLabel("Rescribir Numeros");
		lblRescribirNumeros.setForeground(Color.BLUE);
		lblRescribirNumeros.setHorizontalAlignment(SwingConstants.CENTER);
		lblRescribirNumeros.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 18));
		lblRescribirNumeros.setBounds(0, 12, 438, 15);
		panel.add(lblRescribirNumeros);
		
		JLabel lblIngreseUnNumero = new JLabel("<html>Ingrese un numero par<br>" +" mayor que 2</html>");
		lblIngreseUnNumero.setBounds(12, 89, 261, 52);
		panel.add(lblIngreseUnNumero);
		
		txtNumber = new JTextField();
		txtNumber.setBounds(202, 106, 121, 29);
		panel.add(txtNumber);
		txtNumber.setColumns(10);
		
		JButton btnCalculate = new JButton("Calcular");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number = Integer.parseInt(txtNumber.getText());
				ArrayList<String> numbers =PrimeNumbers.addNumber(number);
				
				for(String a: numbers) {
					txtOutcome.append(a+"\n");
				}
			}
		});
		btnCalculate.setBounds(0, 272, 117, 25);
		panel.add(btnCalculate);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 153, 342, 107);
		panel.add(scrollPane);
		
		 txtOutcome = new JTextArea();
		scrollPane.setViewportView(txtOutcome);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumber.setText("");
				txtOutcome.setText("");
			}
		});
		btnLimpiar.setBounds(126, 272, 117, 25);
		panel.add(btnLimpiar);
		
		
	}
}
