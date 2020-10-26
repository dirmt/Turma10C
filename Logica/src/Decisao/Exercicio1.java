package Decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		short vdiaria = 80;
		byte ndiaria = Byte.parseByte(JOptionPane.showInputDialog("Digite o Numero de Diarias"));
		if (ndiaria>15) {
			System.out.println("Valor da Diaria é:" +( ndiaria * 5.50 + vdiaria));
		}else if (ndiaria==15) {
			System.out.println("Valor da Diaria é:" + (ndiaria * 6.00 + vdiaria));
		
		}else if (ndiaria<15) {
			System.out.println("Valor da Diaria é:" + (ndiaria * 8.0 + vdiaria));
		}else {
			System.out.println("Valor da Diaria é:" + (vdiaria+ndiaria));
		}

	}

}	
