package myfirstpackage;

class Rectangle
{
	int l;
	int b;
	
	Rectangle()
	{
		System.out.println("Non Parameterized Constructor of Parent called");
		l = 1;
		b = 1;
	}
	
	Rectangle(int l, int b)
	{
		System.out.println("Parameterized Constructor of Parent called");
		this.l = l;
		this.b = b;
	}
}

class RectangleWithWeight extends Rectangle
{
	int w;
	
	RectangleWithWeight()
	{
		System.out.println("Non Parameterized Constructor of Child called");
		w = 1;
	}
	
	RectangleWithWeight(int l, int b, int w)
	{
//		super(l,b);
		System.out.println("Non Parameterized Constructor of Parent called");
		this.w = w;
	}
	
	
}

public class UnderstandingInheritance {

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle();
//		System.out.println(R1.l + " " + R1.b);
//		
//		RectangleWithWeight RW1 = new RectangleWithWeight(2,3,4);
//		System.out.println(RW1.l + " " + RW1.b + " " + RW1.w);
		
		Rectangle R2 = new RectangleWithWeight(4,5,6);
		System.out.println(R2.l + " " + R2.b + " ");
		
		System.out.println(((RectangleWithWeight)R2).l);

	}

}
