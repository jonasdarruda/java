import java.util.Scanner;

public class Casa2b {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		double base , altura, area ;
		System.out.println("Insira o valor da Altura do seu Retangulo ");
		altura=teclado.nextDouble();
		
		System.out.println("Insira o valor da Base do seu Retangulo ");
		base=teclado.nextDouble();
		
		area= base*altura;
		System.out.println(" O valor da area do seu Retangulo  : " + area);
		
	}
	

}
