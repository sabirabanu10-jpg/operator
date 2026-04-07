class Logihw
{
	public static void main (String[]args)
	{
		int a=10,b=5;
		boolean res =!((a>b && b<a)||(a>b ||b>a));
		System.out.println(res);
	}
}