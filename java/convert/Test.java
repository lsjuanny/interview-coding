public class Test {
	static public void main(String[] args) {
		String str = "123";
		int num = 0;
		for (int i = 0; i < str.toCharArray().length; i++) {
			char c = str.toCharArray()[i];
			if (c >= '0' && c <= '9') {
				num = num * 10 + (c - '0');
			} else {
				System.out.println("There are non-number character");
				return;
			}
		}

		System.out.println(num);
	}
}