class BureauExecuter
{
	public static void main(String[] args){
		System.out.println("Running main in BureauExecuter");
		
		Bureau bureau=new Bureau(60000,true);
		Bureau.staticBureau();
		bureau.instanceBureau();
		
		System.out.println("\n");
		
		Bureau bureau1=new Bureau(30000,false);
		Bureau.staticBureau();
		bureau1.instanceBureau();
		
	}
}