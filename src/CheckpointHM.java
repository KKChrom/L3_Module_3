import java.util.HashMap;
public class CheckpointHM {
public static void main(String[] args) {
	HashMap<String,String> H = new HashMap<String,String>(); 
	H.put("Egg","Oeuf");
	H.put("Millk","Lait");
	H.put("Sugar","Sucre");
	H.put("Flour","Farine");
	H.put("Orange","Orange");
	for(String s:H.keySet())
	{
		System.out.println(s+" , "+H.get(s));
	}
	
}
}
