import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Por favor digite a nota 1 ");
		nota1=teclado.nextDouble();
		System.out.println(" Por favor digite a nota 2 ");
		nota2=teclado.nextDouble();
		media=(nota1+nota2)/2; 
		System.out.println("Sua media é " + media);
		if(media >= 6 ) {
			System.out.println("Voce foi aprovado ");
		
		
		}
		else {
			System.out.println("Voce foi RE-PRO-VA-DOOOOOOOO ");
			
		}
		
	}

}
