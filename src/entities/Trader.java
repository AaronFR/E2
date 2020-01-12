package entities;

import buildings.Building;

public class Trader {

	public String name;
	public float[] position;
	public float[] invetory;
	public float wallet;
	public String[] properties;  // unimplemented
	public Building[] holdings;  // make sure the reference is shared between towns not copied.
	
	
}
