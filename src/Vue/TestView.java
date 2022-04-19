package Vue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class TestView extends JFrame{
	/**
	 declaration et initialisation des variables 
	 */
	private static final long serialVersionUID = 1L;
	private String[] options = {"Marié","Célibataire"};
	private String ValeurOption ;


	private JLabel enfants = new JLabel("Nombre d'enfants");

	private JTextField nbre_Enfant = new JTextField(10);

	private JLabel revenuLabel = new JLabel("Vos Revenus");
	private JTextField  revenu = new JTextField(10);

	private JButton button = new JButton("Validé");
	private JButton connexion = new JButton("Connexion");

	private JLabel solution;   

	//Constructeur de ma vue
	public TestView(String n){
		//initialisation et définitiopn de ma vue
		this.setTitle(n);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 524);
		JPanel quotientPanel = new JPanel();

		quotientPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		quotientPanel.setForeground(Color.DARK_GRAY);
		quotientPanel.setLayout(null);


		//this.setSize(400, 300);
		JComboBox<String> jComboBox = new JComboBox<>(options);
		jComboBox.setBounds(174, 39, 98, 30);

		/*
	     JLabel top = new JLabel("Quotient Familiale");
		 top.setBounds(174, 39, 98, 30);
		 top.setFont(new Font("Yu Gothic UI", Font.BOLD, 30));
		 quotientPanel.add(top);
		 */

		//Positionnement et ajout des elements a notre fenetre
		quotientPanel.add(jComboBox);

		enfants.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		enfants.setBounds(129, 36, 200, 150);
		quotientPanel.add(enfants);

		nbre_Enfant.setBounds( 159,126,194, 30);
		quotientPanel.add(nbre_Enfant);
		nbre_Enfant.setColumns(10);


		revenuLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 22));
		revenuLabel.setBounds(129, 143, 150, 100);
		quotientPanel.add(revenuLabel);

		revenu.setColumns(10);
		revenu.setBounds(159, 213, 194, 30);
		quotientPanel.add(revenu);

		button.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		button.setBounds(159, 283, 123, 44);
		quotientPanel.add(button);

		connexion.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 20));
		connexion.setBounds(159, 353, 150, 44);
		quotientPanel.add(connexion);

		this.add(quotientPanel);



		//recuperation de la valeur selectionner
		jComboBox.addActionListener(new ActionListener() {     
			@Override
			public void actionPerformed(ActionEvent e) {
				ValeurOption = (String) jComboBox.getSelectedItem();      
			}
		});


	}

	//Getter et Setter de chaque Variable
	public String[] getOptions() {
		return options;
	}
	public  String getValeurOption() {
		return ValeurOption;
	}

	public String getNbre_Enfant() {
		return nbre_Enfant.getText();
	}


	public String getRevenu() {
		return revenu.getText();
	}


	public JButton getButton() {
		return button;
	}

	public JButton getConnexion() {
		return connexion;
	}

	public JLabel getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		//Initialisation de la solution puis affichage du calcul sous forme de message IMPORTANT
		this.solution = new JLabel(solution);

		// j'ai pas encore trouv� comment afficher le r�sultat du quotient sur la meme fenetre
		JFrame frame = new JFrame("showMessageDialog");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JOptionPane.showMessageDialog(frame, solution, "Quotient Familiale", JOptionPane.INFORMATION_MESSAGE);
	}

	//fonction permettant de verifier les entrees utilisateurs une fois que le bouton est actionner
	public void addQuotientListener(ActionListener listenForButton){
		button.addActionListener(listenForButton);

	}
	//fonction pour transmettre la vue connexion
	public void buttonListener(ActionListener listenForButton){
		connexion.addActionListener(listenForButton);

	}
	//Message d'erreur si les entrees sont non valides
	public void displayErrorMessage(String message) {
		JOptionPane.showMessageDialog(this, message);

	}




}