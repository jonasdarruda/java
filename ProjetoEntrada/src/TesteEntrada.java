import java.util.Scanner;

public class TesteEntrada {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int valor;
	System.out.println("Digite um valor inteiro ");
	valor=teclado.nextInt();
	System.out.println("Voce digitou: " + valor);
	
}
}
