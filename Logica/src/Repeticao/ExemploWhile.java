package Repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Dia").toLowerCase();
		while (dia.length()<1 && dia.length()>31) {
			dia = JOptionPane.showInputDialog("digite o dia");
		}
		System.out.println(dia);
		
		String nome = JOptionPane.showInputDialog("nome").toUpperCase();
		while (nome.length()<5 || (nome.length()>20)) {
			nome = JOptionPane.showInputDialog("O Nome deve ter entre 5 a 20 caract").toUpperCase();
		}
	System.out.println(nome);

}
}