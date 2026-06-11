package inheritence;

public class MultilevelChild extends MultilevelparentB{

	public static void main(String[] args) {
		MultilevelChild obj = new MultilevelChild();
		obj.display();
		obj.display1();
		obj.display2();
		
		// TODO Auto-generated method stub

	}
	public void display2()
	{
		System.out.println("this is the child");
	}

}
