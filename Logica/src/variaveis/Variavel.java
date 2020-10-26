package variaveis;

import javax.swing.JOptionPane;

public class Variavel {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite Seu Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso"));
		double imc = peso / (altura*altura);
		System.out.println("Usuario: "+ nome );
		System.out.println("Idade..: "+ idade );		System.out.printf("PMC....: %.2f ", imc );
		
	}

}
