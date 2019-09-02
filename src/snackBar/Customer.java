package snackBar;

public class Customer
{
	private static int maxId = 0;

	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash)
	{
		maxId++;

		id = maxId;

		this.name = name;
		this.cash = cash;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getCash()
	{
		return cash;
	}

	public void addCash(double newCash)
	{
		cash = cash + newCash;
	}

	public void buySnack(double totalCost)
	{
		cash = cash - totalCost;
	}
}