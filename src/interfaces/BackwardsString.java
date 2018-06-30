package interfaces;

public class BackwardsString implements TextFunkifier {
	

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

