public class StringBuffer3 {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("This method returns the reversed object on which it was called");
		System.out.println(buf);

		buf.reverse();
		System.out.println(buf);
	}

}
