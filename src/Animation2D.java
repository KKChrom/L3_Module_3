
public class Animation2D extends Animation implements Drawable{
	public static void main(String[] args) {
		Animation2D twodee = new Animation2D();
		twodee.draw();
		System.out.println(twodee.getFramerate());
	}
	@Override
	
	public void draw() {
		System.out.println("drawing");
		
	}

	@Override
	public int getFramerate() {
		
		return 24;
	}

}
