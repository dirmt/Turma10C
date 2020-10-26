package br.com.excecoes.implementacao;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("10");
			System.out.println("Resultado = " + (numero *10));
			
			String email="";
			System.out.println("Usuario = " + email.substring(0, email.indexOf("@")));
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Coordenada Invalida");
		
		}catch(Exception e) {
			System.out.println("Deu ruim");
			
		}finally {
			System.out.println("Até Logo");
		}

	}

}
