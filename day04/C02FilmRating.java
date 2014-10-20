class Film {
	String title;
	int reviewer = 0;
	double totalStar = 0;

	void review(int stars) {
		reviewer++;
		totalStar += stars;
	}

	double getRating() {
		if (reviewer == 0) {
			return 0;
		} else {
			return totalStar / reviewer;
		}
	}
}

class C02FilmRating {
	public static void rate(Film f, int stars) {
		System.out.println("Viewer voting being processed...");
		f.review(stars);
		f = null;
		stars++;
		System.out.println("The value of star inside this method is: " + stars);
		// Point 1
	}

	public static Film helpMeChoose(Film f1, Film f2) {
		return f1.getRating() > f2.getRating() ? f1 : f2;
	}

	public static void main(String[] args) {
		Film film1 = new Film();
		film1.title = "Prometheus";
		Film film2 = new Film();
		film2.title = "Twilight";
		System.out.print(film1.reviewer + " reviewers have given "
				+ film1.title);
		System.out.println(" an average rating of " + film1.getRating()
				+ " stars.");
		System.out.print(film2.reviewer + " reviewers have given "
				+ film2.title);
		System.out.println(" an average rating of " + film2.getRating()
				+ " stars.");
		// Point 2
		int stars = 5;
		rate(film1, stars);
		System.out.println("The value of star here is now: " + stars);
		stars = 4;
		rate(film1, stars);
		System.out.println("The value of star here is now: " + stars);
		stars = 2;
		rate(film2, stars);
		System.out.println("The value of star here is now: " + stars);
		stars = 3;
		rate(film2, stars);
		System.out.println("The value of star here is now: " + stars);
		// Point 3
		System.out.print(film1.reviewer + " reviewers have given "
				+ film1.title);
		System.out.println(" an average rating of " + film1.getRating()
				+ " stars.");
		System.out.print(film2.reviewer + " reviewers have given "
				+ film2.title);
		System.out.println(" an average rating of " + film2.getRating()
				+ " stars.");
		Film finalChoice = helpMeChoose(film1, film2);
		System.out.println("And we officially recommend: " + finalChoice.title);
		// Point 4
	}
}
