package dsaAssignmentTwo;
            public class Distance {
			int meters;
			int centimeters;
			public Distance(int meters, int centimeters) {
			this.meters = meters;
			this.centimeters = centimeters;
			}
			public void display() {
			System.out.println("Distance: " + meters + " meters, " + centimeters + 
			" centimeters.");
			}
			public static Distance sum(Distance d1, Distance d2) {
			int totalMeters = d1.meters + d2.meters;
			int totalCentimeters = d1.centimeters + d2.centimeters;
			if (totalCentimeters >= 100) {
			totalMeters += totalCentimeters / 100;
			totalCentimeters %= 100;
			}
			return new Distance(totalMeters, totalCentimeters);
			}
			public static void main(String[] args) {
			Distance d1 = new Distance(5, 80);
			Distance d2 = new Distance(2, 30);
			Distance sum = Distance.sum(d1, d2);
			d1.display();
			d2.display();
			sum.display();
	}

}
