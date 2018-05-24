//pacote
package primeiroprojeto;

//biblioteca da hora do sistema
import java.util.Date;

//classe
public class HoraDoSistema{
	
	//static(metodos ou variavel pertencem a classe 	
	public static void main(String[] args){
	
//objeto do tipo string com nome relogio e instanciamos um novo objeto do tipo date e de nome relogio	
		Date relogio = new Date();
		
//saida do meu codigo que serve pra qualquer programa		
		System.out.println("A hora do sistema ?:");
		
//saida do minha data e a envia pra uma string		
		System.out.println(relogio.toString());
		
	}
	
	
}
