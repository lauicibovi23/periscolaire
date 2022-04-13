package Vue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class LogIn extends JFrame {
	private static final long serialVersionUID = 2L;
	private JPanel contentPane;

	private JTextField textField;
	private JTextField textField_1;

	private JLabel top = new JLabel("Login");
	private JLabel lblEmail = new JLabel("Email");

	private JButton btnNewButton = new JButton("Login");
	private JButton btnSignUp = new JButton("Sign up");


	/**
	 * Create the frame.
	 */
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 524);
		contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		top.setBounds(233, 40, 98, 30);
		top.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		contentPane.add(top);


		lblEmail.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblEmail.setBounds(76, 96, 74, 30);
		contentPane.add(lblEmail);

		textField = new JTextField();
		textField.setBounds(186, 96, 194, 30);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		lblPassword.setBounds(52, 153, 98, 30);
		contentPane.add(lblPassword);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(186, 153, 194, 30);
		contentPane.add(textField_1);

		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnNewButton.setBounds(208, 221, 123, 44);
		contentPane.add(btnNewButton);

		JLabel lblPasDeCompte = new JLabel("pas de compte,Cliquez sur SignUp");
		lblPasDeCompte.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		lblPasDeCompte.setBounds(141, 288, 298, 37);
		contentPane.add(lblPasDeCompte);

		btnSignUp.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		btnSignUp.setBounds(208, 369, 123, 44);
		contentPane.add(btnSignUp);
	}
	public String getmail() {
		return textField.getText();
	}
	public String getMdpasse() {
		return textField_1.getSelectedText();
	}
	public JButton getBtnNewButton() {
		return btnNewButton;
	}
	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}
	public JButton getBtnSignUp() {
		return btnSignUp;
	}
	public void setBtnSignUp(JButton btnSignUp) {
		this.btnSignUp = btnSignUp;
	}
	//fonction permettant de verifier les entrees utilisateurs une fois que le bouton est actionner
	public void otherListener(ActionListener listenbouton){
		btnNewButton.addActionListener(listenbouton);

	}
	public void signUpListen(ActionListener listenbouton){
		btnSignUp.addActionListener(listenbouton);

	}
	//message d'erreur 
	public void displayErrorMessage(String string) {
		JOptionPane.showMessageDialog(this, string);

	}

}
