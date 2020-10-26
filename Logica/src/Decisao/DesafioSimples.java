package Decisao;

import javax.swing.JOptionPane;

public class DesafioSimples {

	public static void main(String[] args) {
		String veiculo = JOptionPane.showInputDialog("Veiculo").toUpperCase();
		byte capacidade = Byte.parseByte(JOptionPane.showInputDialog("Capacidade"));
		if (capacidade==2) {
			System.out.println(veiculo + "Categoraia A");
		}else if(capacidade>7) {
			System.out.println(veiculo + "Categoria C");
		}else if (capacidade<=4) {
			System.out.println(veiculo + "Categoria B");
			
		}else {
			System.out.println(veiculo + "Categoria Desconhecida");	
		}

	}


}

