class HelmetExecuter
{
	public static void main(String[] args){
		System.out.println("Running main in HelmetExecuter");
		
		Helmet helmet=new Helmet(1300,'L');
		Helmet.staticHelmet();
		helmet.instanceHelmet();
		
		System.out.println("\n");
		
		Helmet helmet1=new Helmet(900,'XL');
		Helmet.staticHelmet();
		helmet1.instanceHelmet();
		
	}
}