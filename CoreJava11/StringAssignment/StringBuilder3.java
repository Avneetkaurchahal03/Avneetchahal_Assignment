public class Stringbuilder3 {

		public static void main(String[] args) {
			StringBuilder buf = new StringBuilder("This method returns the reversed object on which it was called");
			System.out.println(buf);

			buf.reverse();
			System.out.println(buf);
		}

	}