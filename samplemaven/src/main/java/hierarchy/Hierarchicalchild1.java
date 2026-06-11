package hierarchy;

public class Hierarchicalchild1 extends Hierarchicalparent{

	public static void main(String[] args) {
		Hierarchicalchild1 obj = new Hierarchicalchild1();
		obj.display();
		obj.display1();
		// TODO Auto-generated method stub

	}
	public void display1()
	{
		System.out.println("this is the child1");
	}

}
