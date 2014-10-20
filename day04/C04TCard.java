class Travelcard {
	String type;
	int zone;
}

class OysterCard {
	boolean autotopup;
	boolean registered;
	double amount;
	Travelcard travelcardAttached;
}

class C04TCard {
	public static boolean yellowReader(OysterCard card, int zone) {
		double fare = getFare(zone);
		double cost = 0.0;
		if (card.travelcardAttached != null) {
			if (card.travelcardAttached.zone >= zone) {
				return true;
			}
		}
		if (card.amount > fare) {
			card.amount -= fare;
			return true;
		}
		return false;
	}

	public static double getFare(int zone) {
		double fare = 0.0;
		if (zone <= 2) {
			fare = 2.3;
		} else if (zone <= 4) {
			fare = 4.6;
		} else {
			fare = 6.2;
		}
		return fare;
	}

	public static void main(String[] args) {
		OysterCard card1 = new OysterCard();
		card1.autotopup = true;
		card1.registered = false;
		card1.amount = 50.0;
		card1.travelcardAttached = null;
		// Point 1
		Travelcard tcard = new Travelcard();
		tcard.type = "week";
		tcard.zone = 2;
		// Point 2
		OysterCard card2 = new OysterCard();
		card2.autotopup = false;
		card2.registered = true;
		card2.amount = 6.3;
		card2.travelcardAttached = tcard;
		// Point 3
		System.out.println(yellowReader(card1, 2) ? "pass"
				: "problem with card");
		System.out.println(yellowReader(card1, 6) ? "pass"
				: "problem with card");
		System.out.println(yellowReader(card2, 4) ? "pass"
				: "problem with card");
		System.out.println(yellowReader(card2, 5) ? "pass"
				: "problem with card");
		// Point 4
	}
}
