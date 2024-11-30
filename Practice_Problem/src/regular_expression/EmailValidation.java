package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+(?:[._-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$");
		Matcher m = p.matcher("eshwarrsa@gmail.com");
		System.out.println(m.matches());
	}
}
