class Circle{

	private double radius;

	Circle(){
		this(4.0); //chained parameterized constructor
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	double AreaofCircle(){
		return 3.14 * radius * radius;
	}

	public static void main(String[] args){
		Circle c1 = new Circle();
		Circle c2 = new Circle(6.0);
		
		System.out.println(c1.AreaofCircle());
		System.out.println(c2.AreaofCircle());
		
	}
}