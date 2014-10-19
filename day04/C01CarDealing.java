class Car {
	String Model;
	double price;
}

class C01CarDealing {
	public static void trade(Car newCar, Car oldCar, int myFund) {
		if (newCar.price <= oldCar.price + myFund) {
			System.out.println("we have a deal");
		} else {
			System.out.println("forget about it...");
		}
		System.out.println(" now we try to be naughty");
		Car temp = new Car();
		temp = newCar;
		newCar = oldCar;
		oldCar = temp;
		// Point 1
	}

	public static void main(String[] args) {
		Car myOldFord = new Car();
		myOldFord.Model = "Ka";
		myOldFord.price = 2000;
		Car fancyRacer = new Car();
		fancyRacer.Model = "911";
		fancyRacer.price = 300000;
		int myBudget = 10000;
		// Point 2
		System.out.println("Lets exchange cars! Deal?");
		trade(fancyRacer, myOldFord, myBudget);
		// Point 3
		System.out.println("The new car has become " + fancyRacer.Model);
		System.out.println("And the old car has become " + myOldFord.Model);
		System.out.println("The deal has failed");
	}
}
