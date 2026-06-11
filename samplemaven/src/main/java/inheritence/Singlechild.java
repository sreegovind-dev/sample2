package inheritence;

public class Singlechild extends Singleparent{

	public static void main(String[] args) {
		Singlechild obj = new Singlechild();
		obj.display();
		obj.display1();
		// TODO Auto-generated method stub

	}
	public void display1()
	{
		System.out.println("this is the child class");
	}

}
