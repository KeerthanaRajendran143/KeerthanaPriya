package keywords;
class id{
	int id=20;
}
public class superkeyword extends id{
	void display() {
	System.out.print(super.id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		superkeyword i= new superkeyword();
		i.display();
	}

}
