package snackBar;

public class Main 
{

	public static void workWithData()
	{
		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		VendingMachine food = new VendingMachine("Food");
		VendingMachine drink = new VendingMachine("Drink");
		VendingMachine office = new VendingMachine("Office");

		Snack chips = new Snack("Chips", 36, 1.75, food.getId());
		Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
		Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
		Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
		Snack water = new Snack("Water", 20, 2.75, drink.getId());

		jane.buySnack(soda.getTotal(3));
		soda.buySnack(3);
		System.out.println("Jane cash: $" + jane.getCash());
		System.out.println("Soda qty: " + soda.getQuantity());

		jane.buySnack(pretzel.getTotal(1));
		pretzel.buySnack(1);
		System.out.println("Jane cash: $" + jane.getCash());
		System.out.println("Pretzel qty: " + pretzel.getQuantity());

		bob.buySnack(soda.getTotal(2));
		soda.buySnack(2);
		System.out.println("Bob cash: $" + bob.getCash());
		System.out.println("Soda qty: " + soda.getQuantity());

		jane.addCash(10.00);
		System.out.println("Jane cash: $" + jane.getCash());

		jane.buySnack(chocolateBar.getTotal(1));
		chocolateBar.buySnack(1);
		System.out.println("Jane cash: $" + jane.getCash());
		System.out.println("Chocolate Bar qty: " + chocolateBar.getQuantity());

		pretzel.addQuantity(12);
		System.out.println("Pretzel qty: " + pretzel.getQuantity());

		bob.buySnack(pretzel.getTotal(3));
		pretzel.buySnack(3);
		System.out.println("Bob cash: $" + bob.getCash());
		System.out.println("Pretzel qty: " + pretzel.getQuantity());
}
	

	public static void main(String[] args)
	{
		workWithData();
	}
}