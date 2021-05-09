package basic;

public class string {

	public static void main(String[] args) {
		String s1="Welcome to Software Solutions";
		String s2=" Company Private Limited.";
		String str="Welcome to Software Solutions";
		System.out.println((s1.equals(s2))+ " "+ (s1.equalsIgnoreCase(str)));
		System.out.println(s1.concat(s2));
		System.out.println("s1= " +(s1.charAt(5)) + ";"+ "s2=" + (s2.charAt(10)));
		System.out.println("Length of s1 is "+ (s1.length())+" and "+ "Length of s2 is "+(s2.length()));
		System.out.println("Lower case of s1 [ "+(s1.toLowerCase()) + " ]" + " , " +"Upper case of s1 is [ "+ (s1.toUpperCase())+" ]");
		System.out.println("Lower case of s2 [ "+(s2.toLowerCase()) + " ]" + " , " +"Upper case of s2 is [ "+ (s2.toUpperCase())+" ]");
		System.out.println("Index of the character 'l' is -> "+ s1.indexOf('l'));
		System.out.println("Index of the character 'l' is -> "+s1.indexOf('l',3));
		System.out.println("Index of the word Private is -> "+ s2.indexOf("Private"));
		System.out.println("Index of the word private is -> "+ s2.indexOf("Private", 3));
		int j=10;
		String s3=String.valueOf(j);
		System.out.println(s3);
		String s4="10";
		int i=Integer.parseInt(s4);
		System.out.println(i);
	}

}
