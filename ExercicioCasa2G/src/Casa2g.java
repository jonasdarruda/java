import java.util.Scanner;

public class Casa2g {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	double lado, volume;
	
	System.out.println("Insira valor lado ");
	lado=teclado.nextDouble();
	
	volume=lado*lado*lado;
	System.out.println("O volume do seu cubo : " + volume);
	
	
			
	
	
}
}
