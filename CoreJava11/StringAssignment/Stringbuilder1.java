public class Stringbuilder1 {
	public static void main(String[] args) {
	String s1="is a peer class of String ";
	String s2="that provides much of ";
	String s3="the functionality of strings";

	StringBuilder buf = new StringBuilder("StringBuffer ");
	
	buf.append(s1);
	buf.append(s2);
	buf.append(s3);

	System.out.println(buf);
}

}