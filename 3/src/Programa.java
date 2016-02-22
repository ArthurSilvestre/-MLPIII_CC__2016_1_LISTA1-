public class Programa {
	public static void main(String[] args) {
		
		FabricaDeCarro fabricaDeCarro1 = FabricaDeCarro.getInstance();
		FabricaDeCarro fabricaDeCarro2 = FabricaDeCarro.getInstance();
		
		System.out.println(fabricaDeCarro1);
		System.out.println(fabricaDeCarro2);
	
	}
}
