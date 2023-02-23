package Stattic;// Java program to demonstrate use of static blocks

class Static04
{
	// static variable
	static int a = 10;
	static int b;
	
	// static block
	static {
		System.out.println("Static block basladi.");
		b = a * 4;
	}

	public static void main(String[] args)
	{
	System.out.println("Main mwthod");
	System.out.println("a nin dwgeri : "+a);
	System.out.println("b nin  dwgeri : "+b);
	}
}
