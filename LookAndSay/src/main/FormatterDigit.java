package main;

public class FormatterDigit implements Formatter {

	@Override
	public String format(char digit, int digitCount) {
		return String.valueOf(digitCount) + digit;
	}
}
