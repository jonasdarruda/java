import java.util.Scanner;

public class Casa2h {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	
	double raio, pi, altura, volume;
	pi=3.14;
	
	System.out.println("Insira o valor de raio ");
	raio=teclado.nextDouble();
	
	System.out.println("Insira o valor da altura ");
	altura=teclado.nextDouble();
	
				volume= pi*raio*raio*altura;
	System.out.println("O Volume do seu cilindro: " + volume);
	
}
}
