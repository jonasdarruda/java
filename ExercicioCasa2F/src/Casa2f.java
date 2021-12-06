import java.util.Scanner;

public class Casa2f {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	
	int altura, largura, profundidade, Volume;
	
	System.out.println("Insira Valor Altura ");
	altura=teclado.nextInt();
	
	System.out.println("Insira Valor Largura ");
	largura=teclado.nextInt();
	
	System.out.println("Insira Valor Profundidade");
	profundidade=teclado.nextInt();
	
	Volume= altura*largura*profundidade;
	System.out.println("A Volume do seu paralelepipedo : " + Volume);
	
	
	
}
}
