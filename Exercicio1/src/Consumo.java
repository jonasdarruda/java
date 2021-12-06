import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

	double km, litros, media;
	System.out.println("DIGITE A KILOMETRAGEM PERCORRIDA ");
	km=teclado.nextDouble();
	System.out.println("DIGITE A QUANTIDADE DE LITROS ");
	litros=teclado.nextDouble();
	media=km/litros;
	System.out.println("SUA MEDIA DE CONSUMO É : " + media);
	
	
	
	}

}
