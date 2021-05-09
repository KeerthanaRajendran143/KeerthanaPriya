package OOPS;

public class polymorphismMOL {
 void add(int a, int b) {
	 System.out.println("a+b="+(a+b));
 }
 void sub(int a,int b) {
	 System.out.println("a-b="+(a-b));
 }
 public void datatypechange(String h, char i) {
	 System.out.println("String : "+ h +" , "+ "character : "+ i);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphismMOL l=new polymorphismMOL();
		l.add(20, 30);
		l.sub(50, 10);
		l.datatypechange("Hello", 'L');
	}

}
