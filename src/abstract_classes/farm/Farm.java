package abstract_classes.farm;

import java.util.ArrayList;




public class Farm {
	public static void main(String[] args)
	{
		ArrayList<Animals> farm = new ArrayList<Animals>();
		Animals Pig = new Pig();
		Animals Cow = new Cow();
		Animals Chicken = new Chicken();
		Animals Fish = new Fish();
		Animals Hen = new Hen();
		Animals Turkey = new Turkey();

		farm.add(Pig);
		farm.add(Cow);
		farm.add(Chicken);
		farm.add(Fish);
		farm.add(Hen);
		farm.add(Turkey);
		for(int i =0; i<farm.size();i++)
		{
			farm.get(i).makesNoise();
			farm.get(i).eats();
		}
	}
}
