package demo;

public class ModifyStringDemo {

	public static void main(String[] args) {
		System.out.println(perform("iLoveMyIndia"));
		//System.out.println(perform("this_is_a_string"));
	}

	public static String perform(String str) {
		char[] arr = str.toCharArray();
		StringBuilder ss = new StringBuilder();
		if (str.contains("_")) {
			boolean flag = false;
			for (char ch : arr) {
				if (ch == '_') {
					flag = true;
					continue;
				}
				if (flag) {
					ss.append(String.valueOf(ch).toUpperCase());
					flag = false;
				} else {
					ss.append(ch);
				}
			}
		} else {
			boolean flag = false;
			for (char ch : arr) {
				if (Character.isUpperCase(ch)) {
					flag = true;
				}

				if (flag) {
					ss.append("_").append(String.valueOf(ch).toLowerCase());
					flag = false;
				} else {
					ss.append(ch);
				}

			}
		}

		return ss.toString();
	}
}
