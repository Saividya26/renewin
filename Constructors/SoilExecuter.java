class SoilExecuter
{
	public static void main(String[] args)
	{
		System.out.println("Running main in SoilExecuter");
		
		Soil soil=new Soil("Clay","black");
		Soil.staticSoil();
		soil.instanceSoil();
		
		System.out.println("\n");
		Soil soil1=new Soil("Clay","Brown");
		Soil.staticSoil();
		soil1.instanceSoil();
		
	}
}