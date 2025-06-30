package myfirstpackage;

class Shapes
{
	void area()
	{
		System.out.println("Area of Shapes");
	}
}

class Circle extends Shapes
{
	void area()
	{
		System.out.println("Area of Circle");
	}
}

class Square extends Shapes
{
	void area()
	{
		System.out.println("Area of Square");
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		Square Sq = new Square();
		Sq.area();
		
		Circle C = new Circle();
		C.area();
		
		Shapes SP = new Shapes();
		SP.area();
		

	}

}
