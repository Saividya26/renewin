class Park
{
	String name;
	String location;
	String owner;
	int noOfDustbin;
	int noOfActivities;
	boolean foodAvailability;
	boolean safety;
	int rooms;
	int noOfVisitors;
	
	Park()
	{
		System.out.println("Invoking n0-arguments from Park");
	}
	Park(String name)
	{
		this.name=name;
		System.out.println("Invoking String,int argument from Park");
	}
	Park(String name,String location)
	{
		this(name);
		this.location=location;
		System.out.println("Invoking String,int argument from Park");
	}
	Park(String name,String location,String owner)
	{
		this(name,location);
		this.owner=owner;
		System.out.println("Invoking String,int argument from Park");
	}
	Park(String name,String location,String owner,int noOfDustbin)
	{
		this(name,location,owner);
		this.noOfDustbin=noOfDustbin;
		System.out.println("Invoking String,int argument from Park");
	}
	Park(String name,String location,String owner,int noOfDustbin,int noOfActivities)
	{
		this(name,location,owner,noOfDustbin);
		this.noOfActivities=noOfActivities;
		System.out.println("Invoking String,int argument from Park");
	}
	Park(String name,String location,String owner,int noOfDustbin,int noOfActivities,boolean foodAvailability)
	{
		this(name,location,owner,noOfDustbin,noOfActivities);
		this.foodAvailability=foodAvailability;
		System.out.println("Invoking String,int argument from Park");
	}
	Park(String name,String location,String owner,int noOfDustbin,int noOfActivities,boolean foodAvailability,boolean safety)
	{
		this(name,location,owner,noOfDustbin,noOfActivities,foodAvailability);
		this.safety=safety;
		System.out.println("Invoking String,int argument from Park");
	}
	Park(String name,String location,String owner,int noOfDustbin,int noOfActivities,boolean foodAvailability,boolean safety,int rooms)
	{
		this(name,location,owner,noOfDustbin,noOfActivities,foodAvailability,safety);
		this.rooms=rooms;
		System.out.println("Invoking String,int argument from Park");
	}
	Park(String name,String location,String owner,int noOfDustbin,int noOfActivities,boolean foodAvailability,boolean safety,int rooms,int noOfVisitors)
	{
		this(name,location,owner,noOfDustbin,noOfActivities,foodAvailability,safety,rooms);
		this.noOfVisitors=noOfVisitors;
		System.out.println("Invoking String,int argument from Park");
	}
	
}