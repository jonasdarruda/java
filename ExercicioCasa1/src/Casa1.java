import java.util.Scanner;

public class Casa1 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero, novo, unidade, dezena, centena, resto;
		System.out.println("Digite um numero de 3 digitos ");
		numero=teclado.nextInt();
		centena=numero/100;
		resto=numero%100;
		dezena=resto/10;
		unidade=resto%10;
		novo=unidade*100+dezena*10+centena;
		System.out.println("O numero invetido vale: " + novo);
		
		
		
		
		
		
		
		
		
		
		

	}

}
