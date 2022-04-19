package Vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class SignIn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;



	/**
	 * Create the frame.
	 */
	public SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 699);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblSignUp.setBounds(174, 39, 98, 30);
		contentPane.add(lblSignUp);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblEmail.setBounds(39, 106, 98, 30);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblPassword.setBounds(39, 169, 98, 30);
		contentPane.add(lblPassword);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblNom.setBounds(39, 231, 98, 30);
		contentPane.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblPrenom.setBounds(39, 293, 98, 30);
		contentPane.add(lblPrenom);
		
		JLabel lblDateDeNaissance = new JLabel("D.naissance");
		lblDateDeNaissance.setVerticalAlignment(SwingConstants.TOP);
		lblDateDeNaissance.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblDateDeNaissance.setBounds(39, 358, 187, 30);
		contentPane.add(lblDateDeNaissance);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(148, 106, 194, 30);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(148, 169, 194, 30);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(147, 231, 194, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 293, 194, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(160, 363, 194, 30);
		contentPane.add(textField_4);
		
		JButton btnSignUp = new JButton("Sign up");
		btnSignUp.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnSignUp.setBounds(174, 443, 123, 44);
		contentPane.add(btnSignUp);
	}

}
