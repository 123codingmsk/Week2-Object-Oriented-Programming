class Person{
	protected String name;
	protected int id;
	
	Person(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	void display(){
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
	}
}

interface Worker{
	void performDuties();
}

class Chef extends Person implements Worker{
	Chef(String name, int id){
		super(name, id);
	}
	
	@Override
	public void performDuties(){
		super.display();
		System.out.println(name+" is a Chef");
	}
}

class Waiter extends Person implements Worker{
	Waiter(String name, int id){
		super(name, id);
	}
	
	@Override
	public void performDuties(){
		super.display();
		System.out.println(name+" is a Waiter");
	}
}

public class Restaurant{
	public static void main(String[] a){
		Chef chef = new Chef("Manoj", 40);
		Waiter waiter = new Waiter("Raju", 50);
		
		chef.performDuties();
		waiter.performDuties();
	}
}





