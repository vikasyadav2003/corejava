package superkeyword;

public class supere2 extends sperex {
public void display() 
{
	System.out.println("in method2");
	super.method1();
}
public static void main(String[] args) {
	supere2 obj=new supere2 ();
	obj.display();
}
}