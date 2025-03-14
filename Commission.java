package dsaAssignmentTwo;
import java.util.*;
public class Commission {
  private double sales;
	public Commission(double sales) {
	this.sales = sales;
	}
	public double getCommission() {
	if (sales < 0) {
	return -1;
	} else if (sales < 100) {
	return sales * 0.02;
	} else if (sales <= 5000) {
	return sales * 0.05;
	} else {
	return sales * 0.08;
	}
	}
	}
	class Demo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter sales: ");
	double sales = sc.nextDouble();
	if (sales < 0) {
	System.out.println("Invalid Input");
	} else {
	Commission commission = new Commission(sales);
	System.out.println("Commission: " + commission.getCommission());
	}
	sc.close();
	}

}
