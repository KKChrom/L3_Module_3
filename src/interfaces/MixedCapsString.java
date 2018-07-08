package interfaces;



public class MixedCapsString extends SpecialString{
	public MixedCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public String funkifyText(String str) {
		String mixName = "";
		String portion= "";
		for(int i =0; str.length()>i;i++)
		{
			if(i % 2 == 1)
			{
				portion = str.substring(i, i+1);
				portion = portion.toUpperCase();
				
			}
			else
			{
				portion = str.substring(i, i+1);
				portion = portion.toLowerCase();				
			}
				mixName += portion;
		}
		System.out.println(mixName);
		return mixName;

	}
		

	}

