package cn.tedu.regex;

public class PatternExer1 {

	public static void main(String[] args) {

		String email = "";

		System.out.println(email.matches("[a-zA-Z0-9]{6,32}@[a-zA-Z0-9]+(\\.com)")
				|| email.matches("[a-zA-Z0-9]{6,32}@[a-zA-Z0-9]+(\\.com)?(\\.cn)"));

	}

}
