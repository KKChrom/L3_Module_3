package abstract_classes.farm;

import java.util.ArrayList;




public class Farm {
	public static void main()
	{
		ArrayList<Animals> farm = new ArrayList<Animals>();
		Animals Pig = new Pig();
		Animals Cow = new Cow();
		Animals Chicken = new Chicken();
		Animals Fish = new Fish();
		Animals Hen = new Hen();
		Animals Turkey = new Turkey();
		Pig.makesNoise();
		Pig.eats();
		Cow.makesNoise();
		Cow.eats();
		Chicken.makesNoise();
		Chicken.eats();
		Fish.makesNoise();
		Fish.eats();
		Hen.makesNoise();
		Hen.eats();
		Turkey.makesNoise();
		Turkey.eats();
	}
}
