class Wood
{
	String typeOfWood;
	String color;
	String shape;
	int price;
	String brand;
	
	Wood()
	{
		System.out.println("Invoking no-arguments from wood");
		
	}
	Wood(String typeOfWood)
	{
		this.typeOfWood=typeOfWood;
		System.out.println("Invoking string argument from wood");
	}
	Wood(String typeOfWood,String color)
	{
		this(typeOfWood);
		this.color=color;
		System.out.println("Invoking string argument from wood");
	}
	Wood(String typeOfWood,String color,String shape)
	{
		this(typeOfWood,color);
		this.shape=shape;
		System.out.println("Invoking string argument from wood");
	}
	Wood(String typeOfWood,String color,String shape,int price)
	{
		this(typeOfWood,color,shape);
		this.price=price;
		System.out.println("Invoking string,int argument from wood");
	}
	Wood(String typeOfWood,String color,String shape,int price,String brand)
	{
		this(typeOfWood,color,shape,price);
		this.brand=brand;
		System.out.println("Invoking string,int argument from wood");
	}
}