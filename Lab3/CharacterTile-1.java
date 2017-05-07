package CS3230LAB3;

public class CharacterTile extends Tile{
	protected char symbol;
	public CharacterTile(char symbol)
	{
		this.symbol =symbol;
		
		 for (char c = 1; c <10; c++)
			if (symbol == c)
		System.out.println(toString());/*
		 char[] symbolArray = new char[] {'N','E','W','S','C','F'};
		 
			 if (symbolArray.equals(symbol)) */		 
				
	}
				
	public boolean matches (Tile other)
	{
		if(super.matches(other) == true && this.symbol == ((CharacterTile)other).symbol)
			return true;
			return false;
	}
	
	public String toString()
	{
		
		
		 if ( symbol == 'N')
			 return  "North Wind";
			 else if( symbol == 'E')
			 return   "East Wind";
			else if ( symbol == 'W')
			return   "West Wind";
			else if ( symbol == 'S')
			return   "South Wind";
			else if ( symbol == 'C')
			return   "Red Dragon";
			else if ( symbol == 'F')
			return   "Green Dragon";
		 		
			return   "Character" + symbol;
		
		
}
	}
