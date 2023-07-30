class Sai
{
static void format()
{
System.out.println("running format in resume");
}
static void format(String type)
{
System.out.println("running format(string) in the resume");
System.out.println("type:"+type);
}
static void format(String type,int pages)
{
System.out.println("running format(string,int) in the resume");
System.out.println("type:"+type);
System.out.println("no of pages:"+pages);
}
}