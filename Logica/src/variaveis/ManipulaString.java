package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		String email = "reGina@gAma.aCaDemy";
		System.out.println("Original: "+ email );
		System.out.println("Minuscula: "+ email.toLowerCase() );
		System.out.println("Maiuscula: "+ email.toUpperCase());
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Posição do @: " + email.indexOf("@"));
		System.out.println("Exibir caracter do 1 ao 4: " + email.substring(0,4));
		System.out.println("Exibir caracter do 1 ao @: " + email.substring(0,email.indexOf("@")));
		System.out.println("Exibir caracter do 1 ao @: " + email.substring(email.indexOf("@")+1));
		
		
	}

}
