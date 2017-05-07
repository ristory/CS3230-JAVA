package CS3230LAB3;

public abstract class Tile {
	public boolean matches(Tile other)
	{
		if(this.getClass() == other.getClass())
		return true;
		return false;
	}

}
