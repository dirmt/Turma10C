package variaveis;

import javax.swing.JOptionPane;

public class Notas {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o Nome do Aluno").toUpperCase();
		float notaa = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor da Nota A"));
		float notab = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor da Nota B"));
		float media = (notaa+notab)/2;
		if (media >=6) {
			System.out.println("Aprovado com a Media: "+ media );
		}
		
		
		

	}

}
