public class Stringbuilder2 {
	public static void main(String[] args) {
		StringBuilder buf = new StringBuilder("It is used to  at the specified index position");
		System.out.println(buf);

		buf.insert(14, "insert text");
		System.out.println(buf);
	}

}
