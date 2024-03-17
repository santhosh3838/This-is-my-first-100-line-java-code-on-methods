// WAP for static method with parameter bw classes
class circle
{    // method with parameter
	 static double x=43.0;
	public static void area(double pi,int r,int a,int b)
	{
		//final double pi=3.142;
		//int r=5;
		double result=pi*r*r*b*a;
		System.out.println("area of circle is_"+result);
		x=23.0;
	}
	
}
class trapezoid
{    // wap to calculate area of trapezoid using method without parametersand with return type?
	static double trapezoid()
	{	final double c=3.142;
		int a=878;
		int b=233;
		int h=787;
		double res = c*(a+b)*h;
		System.out.println(res);
		return res;
	}
	
}
class triangle
{	//Wap to calculate area of triangle with parameters and return type bw classs?
	static double triangle(double a,int b, int h)//parameters
	{
		//area of triangle=1/2b*h
		double res = a*b*h;
		System.out.println(res);
		return res;//return type 
		
	}
}
class rectangle
{  //Assigning values using blobal variables to different parameters inside method rectangle
	static int a=3324;
     static int b=2334;
	public static int rectangle (int w,int h)
		  {
			//area of rectangle=w*h
			int res = w*h;
			System.out.println(res);
			//System.out.println(y);

			return res;
		  }
}

class ellipse
{ 
 //method without parameter creating variables in global variable and reusing it :
 static double pi=3.142;
 static int a=2323;
 static int b=3456;
 public static void ellipse()
	{
	  double res=pi*a*b;
	  System.out.println(res);
	  b=b+a;
	  System.out.println(b);
	  System.out.println(res);
		return;
	}
 
}
class square
{
	static int square(int a)
	{
	
		 int res= a*a;
		
		System.out.println("-----------maIN STARTS-------");

	     System.out.println("____________"+ res+"______________");
			
		System.out.println("---------main ends---------");
	
		return res;
	}
}
class sector
{	static double m=9.2333;
    static int r=2344;
	static int t=32343;
	static double sector(double a, int n,int p)
	{
		double res=a*r*r*t;
		double result=a/r/r/t;
		System.out.println(a);
		System.out.println("area of sector is _"+res);
		int a=a+r;
		System.out.println("area of sector when divided is _"+result);
		return res;
	}
}
class parallelogram
{
	static int parall()
	{
		// area of parallelogram b*H
		int b=131;
		int h=56;
		int res =b*h;
		System.out.println(res);
		return res;
	}
}
class mainclass
{
	public static void main(String[]sfdgf)
	{
		System.out.println(circle.x);
		circle.area(3.142,344,345,5656);//parameter values 
		System.out.println(circle.x);//reinitialised value of x
		ellipse.ellipse();
		trapezoid.trapezoid();
		triangle.triangle(1/2.0,456,7665);
		//y=rectangle.rectangle(a,b);
		square.square(233);
		//sector.sector(m,r,t);
		parallelogram.parall();

	}
}