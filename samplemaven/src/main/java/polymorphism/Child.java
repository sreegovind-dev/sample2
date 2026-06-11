package polymorphism;

public class Child extends parent{

	public static void main(String[] args) {
		Child obj = new Child();
		obj.display(37, 45);
		// TODO Auto-generated method stub

	}
	public void display(int a, int b)
	{
		super.display(12, 10);
		int c = a - b;
		System.out.println(c);
	}
}
