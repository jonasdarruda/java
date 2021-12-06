import java.util.Scanner;

public class Casa3 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double salario, desconto, reais, unidade, consumo;
		
		System.out.println(" Quanto Vale o Salario Minimo ");
		salario=teclado.nextDouble();
		System.out.println(" Qual a Quantidade de KW consumido ");
				consumo=teclado.nextDouble();
				unidade=salario/700;
				reais=unidade*consumo;
				desconto=reais*0.9;
				System.out.println(" O valor da sua conta  :  " + reais);
				System.out.println("O valor da sua conta com desconto : " + desconto);
				
				
	}

}
