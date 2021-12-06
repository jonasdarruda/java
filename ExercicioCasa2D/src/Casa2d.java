import java.util.Scanner;

public class Casa2d {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int diagonal1, diagonal2, area;
	
	System.out.println("Insira o Valor da diagonal 1 ");
	diagonal1=teclado.nextInt();
	
	System.out.println("Insira o Valor da diagonal 2 ");
	diagonal2=teclado.nextInt();
	
	area=diagonal1*diagonal2;
	
	System.out.println("O Valor da area do seu Losango : "  + area);
	
	
	
}
}
