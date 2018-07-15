import java.util.ArrayList;
import java.util.Random;

public class CheckpointAL {
	public static void main(String[] args) {
		ArrayList<Cow> al = new ArrayList<Cow>();
		Random r = new Random();
		int random = r.nextInt(50);
		for(int i =0;random>i;i++)
		{
			
			al.add(new Cow());
		}
	}
}
class Cow {
    public void feed(){}
  }

