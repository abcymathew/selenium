package MultipleInheritance;

public class Sales extends Employee {
	int id2=2;
	public void print()
	{
		System.out.println(id2);
		System.out.println("second child class");
	}
	public static void main(String args[])
	{
	Sales s=new Sales();
	s.print();
	s.hi();
	
	}

}
