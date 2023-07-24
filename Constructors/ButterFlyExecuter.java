class ButterFlyExecuter
{
	public static void main(String[] args){
		System.out.println("Invoking main in ButterFlyExecuter");
		
		ButterFly butterFly=new ButterFly("Monarch ButterFly",2);
		ButterFly.staticButterFly();
		butterFly.instanceButterFly();
		
		System.out.println("\n");
		
		ButterFly butterFly1=new ButterFly("Apollo",1);
		ButterFly.staticButterFly();
		butterFly1.instanceButterFly();
		
	}
}