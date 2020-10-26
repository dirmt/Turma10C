package variaveis;

import javax.swing.JOptionPane;

public class VendaProduto {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o Nome do Produto");
		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do Produto"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade"));
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor"));
		double percent = valor / (valor-0.5);
		System.out.println("Melancia: "+ nome );
		System.out.println("Valor..: "+ valor );
		System.out.println("Qtde....: "+ qtde );
		System.out.println("desconto....: " + (percent*0.9));
			

	}

}
