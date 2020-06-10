package me.antoniomarroquin.snake.objects;

import me.antoniomarroquin.snake.Coordinate;
import me.antoniomarroquin.snake.objects.Body.Facing;

// This class will act as a LinkedList
public class Snake extends GameObject
{
	private Body startingBody;
	
	public Snake()
	{
		super(new Coordinate(Coordinate.MAXBOARDSIZE / 2, Coordinate.MAXBOARDSIZE / 2));
		startingBody = new Body(new Coordinate(this.getCoord()), Facing.WEST);
	}
	
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
	}
	
}
