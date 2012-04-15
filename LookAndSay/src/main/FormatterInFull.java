package main;

public class FormatterInFull implements Formatter {

	@Override
	public String format(char digit, int digitCount) {
		return Numbers.inFull(digitCount) + " " + digit + " ";
	}
}
