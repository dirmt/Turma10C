package Decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o Nome do Aluno");
		short tfaltas = Short.parseShort(JOptionPane.showInputDialog("Digite o numero de Faltas"));
		if (tfaltas>20) {
			System.out.println(tfaltas + "FALTAS! - Reprovado!: " );
		}else {
			String materia = JOptionPane.showInputDialog("Digite o Nome da Disciplina");
			float notaa = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor da Nota A"));
			float notab = Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor da Nota B"));
			float media = (notaa+notab)/2;
			System.out.println("Nome do Aluno: "+ nome );
			System.out.println("Disciplina..: "+ materia );
			System.out.println("M�dia da Nota....: "+ media);
			if (media>=6) {
				System.out.println("Aprovado com M�dia:" + media);
			}
			if (media<4) {
				System.out.println("Reprovado com Nota" + media);
			}
			if (media>=4 && media<6) {
				System.out.println("voce est� de exame");
			}

		}


	}
}



