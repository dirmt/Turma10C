package Repeticao;

import javax.swing.JOptionPane;

public class DeasafioWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		while (email.indexOf("@")==-1) {
			email = JOptionPane.showInputDialog("E-mail deve conter o @").toLowerCase();
		}
		System.out.println(email);
		
	
	}

}
