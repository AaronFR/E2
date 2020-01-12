package buildings;

public class Farm implements Building  {

	public static String type = "";
	public static float[] invetory;
	public float[] production;
	public float[] consumption;


	@Override
	public void calculateProduction() {
		// Make this a dictionary the building only has to worry about its intakes
		// in this case just Food and Minerals
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
}
