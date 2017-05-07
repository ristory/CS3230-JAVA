

public class Person implements Comparable<Person> {
	private int id;
	private String name;
	private String street;
	private String city;
	private String state;
	private String phoneNumber;
	
	public Person(int num, String n, String s, String c,
			String st, String p)
	{
		this.id =num;
		this.name =n;
		this.street = s;
		this.city =c;
		this.state =st;
		this.phoneNumber = p;
	}
	public Person(String n)
	{
		this.name = n;
		this.id = 0;
		this.street = null;
		this.city = null;
		this.state = null;
		this.phoneNumber = null;
		
	}
	public Person(int n)
	{
		this.id = n;
		this.street = null;
		this.city = null;
		this.state = null;
		this.phoneNumber = null;
		this.name = null;
	}
	public String toString()
	{
		return id + " " + name + " " + phoneNumber  + " " + street + " " +city + " " +state ;
	}
	public int getID()
	{
		return id;
	}
	public int compareTo(Person person)
	{
			return this.name.compareTo(person.name);
	}
}
