class AtmCard
{
	String type;
	String holderName;
	int pinNumber;
	
	AtmCard()//no arguments
	{
		System.out.println("Invoking no-arguments from AtmCard");
		
		System.out.println("AtmCard type in constructor:"+this.type);
		System.out.println("AtmCard holderName in constructor:"+this.holderName);
		System.out.println("AtmCard pinNumber in constructor:"+this.pinNumber);
		
		this.type="Visa card";
		this.holderName="Sai";
		this.pinNumber=77606;
		
	}
	
	AtmCard(String type,String holderName,int pinNumber)
	{
		System.out.println("ivoking arguments from AtmCard");
		this.type=type;
		this.holderName=holderName;
		this.pinNumber=pinNumber;
	}
}