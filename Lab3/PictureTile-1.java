package CS3230LAB3;

public abstract class PictureTile extends Tile{
	private String name;
	public PictureTile(String name)
		{
		this.name = name;
	
	}
	public String toString()
	{
		return name;
	}

}