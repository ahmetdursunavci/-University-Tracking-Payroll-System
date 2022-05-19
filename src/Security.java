

public class Security extends Personnel{
	public Security(String name, String registernumber, String position, int startyear) {
		super(name, registernumber, position, startyear);
		
	}
	private double sevpay=super.calculatesevpay();
	private int foodwaymoney=15*6*4;
	public double calculatesalary(String[] a) {
		double salary=0;
		int[] b = {Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4])};
		for(int i : b) {
			salary+=i*10;
		}
		return salary+sevpay+foodwaymoney;
	}
}
