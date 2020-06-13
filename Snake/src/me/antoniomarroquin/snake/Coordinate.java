package me.antoniomarroquin.snake;

public class Coordinate 
{
	private int x;
	private int y;
	
	public static final int COORDINATESIZE = 32;
	public static final int MAXBOARDSIZESMALL = 24;
	public static final int MAXBOARDSIZE = COORDINATESIZE * MAXBOARDSIZESMALL;
	
	public Coordinate (int x, int y)
	{
		// x and y passed through are two coords from the board that must be converted
		this.setX(x / COORDINATESIZE);
		this.setY(y / COORDINATESIZE);
	}
	
	public Coordinate (Coordinate coord)
	{
		this.x = coord.getX();
		this.y = coord.getY();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if ((x >= 0) && (x <= MAXBOARDSIZESMALL))
			this.x = x;
		else
			System.err.println("Outside of board bounds.");
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if ((y >= 0) && (y <= MAXBOARDSIZESMALL))
			this.y = y;
		else
			System.err.println("Outside of board bounds.");
	}
	
	public void setCoordinate(int x, int y)
	{
		if ((x >= 0) && (x <= MAXBOARDSIZESMALL) && (y >= 0) && (y <= MAXBOARDSIZESMALL))
		{
			this.x = x;
			this.y = y;
		}
		else
			System.err.println("Outside of board bounds.");
	}
	
	public String toString()
	{
		return this.x + ", " + this.y;
	}
}
