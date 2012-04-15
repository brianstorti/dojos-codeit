package main;

public enum Numbers {
	UM(1, "um"),
	DOIS(2, "dois"),
	TRESS(3, "três"),
	QUATRO(4, "quatro"),
	CINCO(5, "cinco"),
	SEIS(6, "seis"),
	SETE(7, "sete"),
	OITO(8, "oito"),
	NOVE(9, "nove");
	
	private int number;
	private String text;
	
	Numbers(int number, String text) {
		this.number = number;
		this.text = text;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getText() {
		return this.text;
	}
	
	public static String inFull(int number) {
		for (Numbers n: Numbers.values()) {
			if (n.getNumber() == number) {
				return n.getText();
			}
		}
		
		return "";
	}
	
}
