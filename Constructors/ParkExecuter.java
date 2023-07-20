class ParkExecuter
{
	public static void main(String[] args)
	{
		System.out.println("Running main in ParkExecuter");
		
		Park park=new Park("Nirmit","Belgavi","Archana Naik");
		System.out.println("\n");
		
		Park park1=new Park("Nirmit","Belgavi","Archana Naik",15);
		System.out.println("\n");
		
		Park park2=new Park("Nirmit","Belgavi","Archana Naik",15,26);
		System.out.println("\n");
	}
}