
public class CompareInt implements java.util.Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		return p1.getID() - (p2.getID());
	}
}
