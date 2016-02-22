public class FabricaDeCarro {
	private static FabricaDeCarro Instance; 
	
	private FabricaDeCarro(){
	}

	public static synchronized FabricaDeCarro getInstance(){ 
		if (Instance == null) Instance = new FabricaDeCarro();
		return Instance;
	} 
}