package Vue;

import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Component;

public class TestView extends JFrame{
	/**
	 déclaration et initialisation des variables 
	 */
	private static final long serialVersionUID = 1L;
	private String[] options = {"Marié","Célibataire"};
	private String ValeurOption ;
	

	private JLabel enfants = new JLabel("Nombre d'enfants");
	private JTextField enterUser = new JTextField(10);
	
	private JLabel additionLabel = new JLabel("Situation Matrimoniale");
	private JTextField nbre_Enfant = new JTextField(10);
	
	private JLabel revenuLabel = new JLabel("Vos Revenus");
	private JTextField  revenu = new JTextField(10);
	
	private JButton button = new JButton("Validé");
	
	private JLabel solution;   
	
	//Constriucteur de ma vue
	public TestView(){
		 JPanel quotientPanel = new JPanel();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setSize(400, 200);
		 JComboBox<String> jComboBox = new JComboBox<>(options);
	     jComboBox.setBounds(80, 50, 140, 20);
	     
	     //ajout des éléments à notre fenetre
	     quotientPanel.add(jComboBox);
	     
		 quotientPanel.add(enfants);
		 /*
		 quotientPanel.add(enterUser);
		 quotientPanel.add(additionLabel);
		 */
		 quotientPanel.add(nbre_Enfant);
		 quotientPanel.add(revenuLabel);
		 quotientPanel.add(revenu);
		 
		 quotientPanel.add(button,BorderLayout.EAST);  
		 this.add(quotientPanel);
		 
		 quotientPanel.setVisible(true);
		 
		 
		 //recupération de la valeur séléctionner
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

	
	public String getEnterUser() {
		return enterUser.getText();
	}


	public void setEnterUser(JTextField enterUser) {
		this.enterUser = enterUser;
	}


	public JLabel getAdditionLabel() {
		return additionLabel;
	}


	public void setAdditionLabel(JLabel additionLabel) {
		this.additionLabel = additionLabel;
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
	
	public JLabel getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		//Initialisation de la solution puis affichage du calcul sous forme de message IMPORTANT
		this.solution = new JLabel(solution);
		
		// j'ai pas encore trouvé comment afficher le résultat du quotient sur la meme fenetre
		JFrame frame = new JFrame("showMessageDialog");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JOptionPane.showMessageDialog(frame, solution, "Quotient Familiale", JOptionPane.INFORMATION_MESSAGE);
	}

	//fonction permettant de vérifier les entrées utilisateurs une fois que le bouton est actionner
	public void addQuotientListener(ActionListener listenForButton){
		        button.addActionListener(listenForButton);

		    }
	//Message d'erreur si les entrées sont non valides
	public void displayErrorMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
		
	}



}
