import java.util.Scanner;

public class Programa {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Fatura fatura1 = new Fatura("001","Fatura 1",0,0.00);

		System.out.println("Valor da fatura atual: "+fatura1.getValorFatura());

		System.out.print("Informe a quantidade de itens: ");
		fatura1.setQuantidadeItem(scan.nextInt());

		System.out.print("Informe o valor por item: ");
		fatura1.setValorItem(scan.nextDouble());

		System.out.println("Valor da fatura atual: "+fatura1.getValorFatura());
		
		System.out.println("Estrutura atual do objeto: "+fatura1);
	}
}