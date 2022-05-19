

public class Officer extends Personnel{
	public static final int basesalary = 2600;
	public Officer(String name, String registernumber, String position, int startyear) {
		super(name, registernumber, position, startyear);
		}
	public double calculatessbenefit() {
		return basesalary*65/100;
	}

	private double ssbenefit = this.calculatessbenefit();
	private double sevpay=super.calculatesevpay();
	public double calculatesalary(String[] a) {
		double salary=0;
		int[] b = {Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4])};
		for(int i : b) {
			if((i-40)>=10) {
				salary+=10*20;
			}
			else {
				salary+=(i-40)*20;
			}
		}
		return salary+ssbenefit+sevpay+this.basesalary;
	}
}
