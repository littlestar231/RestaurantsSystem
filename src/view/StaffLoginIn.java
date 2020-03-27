package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class StaffLoginIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StaffLoginIn frame = new StaffLoginIn();
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
	public StaffLoginIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(102, 74, 283, 33);
		textField.setDropMode(DropMode.ON);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(171, 220, 100, 33);
		contentPane.add(btnNewButton);
		
		JTextArea txtrUserName = new JTextArea();
		txtrUserName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrUserName.setBackground(SystemColor.inactiveCaptionBorder);
		txtrUserName.setForeground(SystemColor.desktop);
		txtrUserName.setText("User Name");
		txtrUserName.setBounds(10, 78, 82, 24);
		contentPane.add(txtrUserName);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrPassword.setText("Password");
		txtrPassword.setForeground(Color.BLACK);
		txtrPassword.setBackground(SystemColor.inactiveCaptionBorder);
		txtrPassword.setBounds(10, 147, 82, 24);
		contentPane.add(txtrPassword);
		
		textField_1 = new JTextField();
		textField_1.setDropMode(DropMode.ON);
		textField_1.setColumns(10);
		textField_1.setBounds(102, 149, 283, 33);
		contentPane.add(textField_1);
	}
}
