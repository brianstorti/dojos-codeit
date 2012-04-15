package main;

public class LookAndSay {
	
	private final Formatter formatter;
	
	public LookAndSay() {
		this(new FormatterDigit()); 
	}
	
	public LookAndSay(Formatter formatter) {
		this.formatter = formatter; 
	}
	
	public String evaluate(String number) {
		String output = "";
		char[] digits = number.toCharArray();
		
		char currentDigit = digits[0]; 
		int digitCount = 0;
		for (char c : digits) {
			if (currentDigit != c) {
				output += formatter.format(currentDigit, digitCount);
				currentDigit = c;
				digitCount = 0;
			}
			digitCount++;
		}
		
		return output += formatter.format(currentDigit, digitCount).trim();
	}

	public Long sum(String number) {
		char[] digits = number.toCharArray();
		Long result = 0L;
		
		for (char c : digits) {
			result += Long.parseLong(String.valueOf(c));
		}
		
		return result;
	}

	public Long sumFortySequence(String number) {
		for (int i = 0; i < 40; i++) {
			number = evaluate(number);
		}
		return sum(number);
	}
}