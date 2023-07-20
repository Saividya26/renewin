class Mall
{
	String mallName;
	int stores;
	int startYear;
	String location;
	String owner;
	int visitors;
	int workers;
	
	
	Mall()
	{
		System.out.println("Invoking no-arguments from Mall");
	}
	Mall(String mallName)
	{
		this.mallName=mallName;
		System.out.println("Invoking String argument from Mall");
	}
	Mall(String mallName,int stores)
	{
		this(mallName);
		this.stores=stores;
		System.out.println("Invoking String,int argument from Mall");
	}
	Mall(String mallName,int stores,int startYear)
	{
		this(mallName,stores);
		this.startYear=startYear;
		System.out.println("Invoking String,int,int argument from Mall");
	}
	Mall(String mallName,int stores,int startYear,String location)
	{
		this(mallName,stores,startYear);
		this.location=location;
		System.out.println("Invoking String,int,int,String argument from Mall");
	}
	Mall(String mallName,int stores,int startYear,String location,String owner)
	{
		this(mallName,stores,startYear,location);
		this.owner=owner;
		System.out.println("Invoking String,int,String,String argument from Mall");
	}
	Mall(String mallName,int stores,int startYear,String location,String owner,int visitors)
	{
		this(mallName,stores,startYear,location,owner);
		this.visitors=visitors;
		System.out.println("Invoking String,int,int,String,String,int argument from Mall");
	}
	Mall(String mallName,int stores,int startYear,String location,String owner,int visitors,int workers)
	{
		this(mallName,stores,startYear,location,owner,visitors);
		this.workers=workers;
		System.out.println("Invoking String,int,int,String,String,int,int argument from Mall");
	}
}