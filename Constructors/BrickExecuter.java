class BrickExecuter
{
	public static void main(String[] args){
		System.out.println("Running main in BrickExecuter");
		
		Brick brick=new Brick(200,"black");
		Brick.staticBrick();
		brick.instanceBrick();
		
		System.out.println("\n");
		Brick brick1=new Brick(300,"brown");
		Brick.staticBrick();
		brick1.instanceBrick();
		
	}
}