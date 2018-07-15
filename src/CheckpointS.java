import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class CheckpointS {
public static void main(String[] args) {
	int total = 0;
	Stack<Integer> S = new Stack<Integer>();
	for(int i =0;10>i;i++)
	{
		Random r = new Random();
		int j = r.nextInt();
		S.push(j);
	}
	for(int j =0;10>j;j++)
	{
		total += S.pop();
	}
	JOptionPane.showMessageDialog(null, "The total is "+total);
}
}

