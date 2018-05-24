//pacote
package primeiroprojeto;


//biblioteca de localidade
import java.util.Locale;

public class Idioma {
	
	public static void main (String []args) {
		

//default da localidade do java		
		Locale locale = Locale.getDefault();

// Imprime a linguagem do sistema operacional, "Português"        
		System.out.println("o idioma do java e : " + locale.getDisplayLanguage());
		
		
//outra forma de fazer - mostra a saida e usa o nome do objeto criado acima 	
//		System.out.println(locale.getDisplayLanguage()); 
    }
	

}
