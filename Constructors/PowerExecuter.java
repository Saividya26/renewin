class PowerExecuter
{
	public static void main(String[] args){
		System.out.println("Running main in PowerExecuter");
		
		Power power=new Power("AC",230);
		Power.staticPower();
		power.instancePower();
		
		System.out.println("\n");
		
		Power power1=new Power("AC",225);
		Power.staticPower();
		power1.instancePower();
		
	}
}