package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Cliente;
import br.com.unixyz.beans.Produto;
import br.com.unixyz.beans.Venda;
import br.com.unixyz.util.Magica;

public class ImplementarVenda {

		public static void main(String[] args) {
			Venda venda = new Venda (
					Magica.i("nota Fiscal"),
					Magica.f("Total"),
					Magica.f("Desconto"),
					Magica.s("data"),
					new Cliente (),
					new Produto()	
					);

	}

}

