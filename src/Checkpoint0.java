import javax.swing.JOptionPane;

public class Checkpoint0 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int total = 0;
		String ttal = "";
		for(int i =0;arr.length>i;i++)
		{
			ttal.equals(  JOptionPane.showInputDialog("Input an integer"));
			total+= Integer.valueOf(ttal);
			
		}
		System.out.println(total);
	}
}
