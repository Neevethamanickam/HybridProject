public class string3method {

	public static void main(String[] args) {
		String s1 = new String();
		String s2 = new String("abc");
		char [] ch = {'a','b','c'};
		String s3 = new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.equals(s3));
		String s11 = "java";
		String s12 = "java";
		String s13 = new String("java");
		String s14 = new String("java");
		//== used to compare address
		System.out.println(s11==s12);
		System.out.println(s13==s14);
		//equals() method used to compare content
		System.out.println(s11.equals(s12));
		System.out.println(s13.equals(s14));
	}

}
