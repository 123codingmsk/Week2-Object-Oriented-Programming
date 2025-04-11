class Circle{

	double radius;
	
	void Area(){
		radius = 3.14 * radius * radius;
		System.out.println("Area of Circle: "+radius);
	}
	public static void main(String[] args){
		Circle c1 = new Circle();
		
		c1.radius = 4.0;
		c1.Area();
	}
}