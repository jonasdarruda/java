import java.util.Scanner;

public class Casa2c {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int base, altura , area;
		
		System.out.println("Insira o valor da Base do seu Triangulo ");
		base=teclado.nextInt();
		
		System.out.println("Insira o valor da Altura do seu Triangulo ");
		altura=teclado.nextInt();
		
		area=base*altura/2;
		
				System.out.println("O valor do seu Triangulo : " + area);
		
		
	}

}
