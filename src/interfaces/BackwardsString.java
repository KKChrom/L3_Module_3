package interfaces;

public class BackwardsString extends SpecialString {
	

	public BackwardsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String str) {
		str.equals("This is a test");
		StringBuilder sb = new StringBuilder();
		sb.append(str);
sb = sb.reverse();
String returnVal = sb.toString();
System.out.println(returnVal);
		return returnVal;
	}
	}

