package me.antoniomarroquin.snake.objects;

import me.antoniomarroquin.snake.Coordinate;
import me.antoniomarroquin.snake.objects.Body.Facing;

// This class will act as a LinkedList
public class Snake extends GameObject
{
	private Body startingBody;
	private Body endingBody;
	
	public Snake()
	{
		super(new Coordinate(Coordinate.MAXBOARDSIZE / 2, Coordinate.MAXBOARDSIZE / 2));
		startingBody = new Body(new Coordinate(this.getCoord()), Facing.WEST);
		endingBody = startingBody; 
	}
	
	/*
	 * NEEDS WORK!
	 * VVV
	 */
	
	/**
	 * Loop through the linked bodies until we come to the last one and then add a new body.
	 */
	public void addBody()
	{
		Body temp = startingBody;
		while (true)
			if (temp.next == null)
				break;
			else
				temp = temp.next;
		// create the new body object
		Body newBody = new Body(temp.getCoord(), temp.getFacing());
		// link up the next body
		temp.next = newBody;
		
		endingBody = newBody;
	}

	public Body getEndingBody()
	{
		return endingBody;
	}
	
	/**
	 * Update the position of the snake and any attached body parts
	 * @param upDownLeftRight Up = 0, down = 1, right = 2, left = 3.
	 */
	public void updatePosition(int upDownLeftRight)
	{
		Body temp = endingBody;
		while (true)
		{
			if (temp.previous == null)
				break;
			else
				temp.setCoord(temp.previous.getCoord());
			
			temp = temp.previous;
		}
		startingBody.setCoord(this.getCoord());
		
		switch (upDownLeftRight) {
		case 0:
			this.setCoord(this.getCoord().getX(), this.getCoord().getY() + 1);
			break;
		case 1:
			this.setCoord(this.getCoord().getX(), this.getCoord().getY() - 1);
			break;
		case 2:
			this.setCoord(this.getCoord().getX() + 1, this.getCoord().getY());
			break;
		case 3:
			this.setCoord(this.getCoord().getX() - 1, this.getCoord().getY());
			break;
		}
	}
	
}
