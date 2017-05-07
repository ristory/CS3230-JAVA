package CS3230LAB3;

public class CircleTile extends RankTile{
	public CircleTile(int rank)
	{
		super(rank);
		if (rank > 0 && rank < 10)
		{
			System.out.println(toString());
		}
		
	}
	public String toString()
	{
		return "Circle" + rank;
	}

}
