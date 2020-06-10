package me.antoniomarroquin.snake.objects;

import me.antoniomarroquin.snake.Coordinate;

public class Body extends GameObject
{
	public Body next;
	public Body previous;
	private Facing facing;
	
	public enum Facing
	{
		NORTH,
		SOUTH,
		EAST,
		WEST
	}
	
	public Body (Coordinate coord, Facing facing)
	{
		super(coord);
		// check the facing and place the new body accordingly
		if (facing.equals(Facing.NORTH))
			coord.setY(coord.getY() - 1);
		if (facing.equals(Facing.SOUTH))
			coord.setY(coord.getY() + 1);
		if (facing.equals(Facing.EAST))
			coord.setX(coord.getX() - 1);
		if (facing.equals(Facing.WEST))
			coord.setX(coord.getX() + 1);
	}

	public Facing getFacing() {
		return facing;
	}

	public void setFacing(Facing facing) {
		this.facing = facing;
	}
}
