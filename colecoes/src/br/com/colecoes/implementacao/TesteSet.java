package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set <String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("DEV");
		lista.add("INFRA");
		lista.add("DBA");
		lista.add("ANALISTA");	
		lista.add("SUPORTE");
		lista.add("ESTAGIARIO");
		System.out.println(lista);
		//Set nao exist indice

	}

}
