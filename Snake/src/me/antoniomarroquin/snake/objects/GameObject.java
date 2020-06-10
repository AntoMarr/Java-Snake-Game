package me.antoniomarroquin.snake.objects;

import me.antoniomarroquin.snake.Coordinate;

public abstract class GameObject
{

	private boolean alive;
	private Coordinate coord;
	
	/**
	 * Once a GameObject is created then it is set to alive.
	 * Set the objects coordinates to off the board.
	 */
	public GameObject()
	{
		alive = true;
		coord = new Coordinate(-1, -1);
	}
	
	/**
	 * Create a GameObject that is set to alive and given a specific coordinate.
	 * @param coord Starting coordinate for the GameObject.
	 */
	public GameObject(Coordinate coord)
	{
		alive = true;
		this.coord = coord;
	}
	
	/**
	 * Check if the game object is a live or dead
	 * @return the alive or dead state of the game object.
	 */
	public boolean isAlive()
	{
		return alive;
	}
	
	/**
	 * Kill the game object and set the alive or dead state to false for dead.
	 * If already dead, then print error stating so.
	 */
	public void kill()
	{
		if (alive)
			alive = false;
		else
			System.err.println("This game object is already dead.");
	}

	public Coordinate getCoord()
	{
		return coord;
	}
}
