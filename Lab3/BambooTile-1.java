package CS3230LAB3;

public class BambooTile extends RankTile{
	public BambooTile(int rank)
	{
	super (rank);	
		if (rank > 1 && rank < 10)
		{
			System.out.println(toString());
		}
		
	}
	public String toString()
	{
		return "Bamboo" + rank;
	}

}
