package CS3230LAB3;

public abstract class RankTile extends Tile{
	protected  int rank;
	public RankTile(int rank)
	{
		this.rank = rank;
	}
	
	public boolean matches(Tile other)
	{
		if(super.matches(other) == true && this.rank == ((RankTile)other).rank)
			return true;
			return false;
	}

}
