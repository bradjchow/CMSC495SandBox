
public class HelloGroup {

	public static void main(String[] args) {
		
		Hello helloClass = new Hello();
		
		helloClass.sayHello("Sally");
		
		helloClass.sayHello("Joseph");
		
		helloClass.sayHello("Bradley");
		
		helloClass.sayHello("Hector");

	}	

}



class Hello
{
	
	Hello()
	{		
	}
	
	void sayHello(String person)
	{
		System.out.print("\nHello " + person);
	}
	
}
