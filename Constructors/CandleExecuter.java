class CandleExecuter
{
	public static void main(String[] args)
	{
		System.out.println("Running main in CandleExecuter");
		
		Candle candle=new Candle(150,"Hammer");
		Candle.staticCandle();
		candle.instanceCandle();
		
		System.out.println("\n");
		Candle candle1=new Candle(300,"Doji");
		Candle.staticCandle();
		candle1.instanceCandle();
		
	}
}