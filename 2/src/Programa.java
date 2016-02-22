import java.util.Scanner;

public class Programa {
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Carro carro1 = new Carro("Vermelho","Ferrari",0,200);
		
		System.out.println(carro1);
		
		carro1.ligar();

		System.out.print("Informe a velocidade a ser acelerada: ");
		carro1.acelerar(scan.nextInt());
		
		System.out.println(carro1);
	}
}
