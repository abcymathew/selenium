package MultipleInheritance;

public class Accountant extends Employee{
int id1=1;
public void display()
{
	System.out.println(id1);
	System.out.println("one child class");
}
public static void main(String args[])
{
	
	Accountant a=new Accountant();
	a.display();
	a.hi();
}
}
