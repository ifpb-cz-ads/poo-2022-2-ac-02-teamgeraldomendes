
import java.util.Scanner;

public class AtividadePratica4 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe a largura da piscina: ");
	int larg = entrada.nextInt();
	
	System.out.print("Informe o comprimento da piscina: ");
	int comp = entrada.nextInt();
	
	System.out.print("Informe a profundidade da piscina: ");
	int prof = entrada.nextInt();
	
	int volume = larg * comp * prof;
	
	entrada.close();
	
	System.out.printf("O volume da piscina é: %d m³\n", volume);
	System.out.println("O preço do metro cúbico construído da piscina é R$ 100,00");
	
	int valorm3 = 100;
	
	int orca = volume * valorm3;
	
	System.out.printf("Logo, o orçamento do valor total para a construção da piscina é: R$ %d,00", orca);
	
	}
	
}
