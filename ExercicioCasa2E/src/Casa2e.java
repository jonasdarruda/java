import java.util.Scanner;

public class Casa2e {
public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	
	double basemaior, basemenor, altura, area;
	
	System.out.println("Insira o Valor da Base Maior ");
	basemaior=teclado.nextDouble();
	
	System.out.println("Insira o Valor da Base Menor");
	basemenor=teclado.nextDouble();
	
	System.out.println("Insira o Valor da Altura");
	altura=teclado.nextDouble();
	
	
	area=basemaior+basemenor*altura /2.0;
	
			System.out.println("Valor da Area do seu Trapezio : " + area );
			
	
	
}
}
