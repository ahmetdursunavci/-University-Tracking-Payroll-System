

public class Chief extends FullTime {
	public Chief(String name, String registernumber, String position, int startyear) {
		super(name, registernumber, position, startyear);
	}
	private double sevpay = super.calculatesevpay();
	public double calculatesalary(String[] a) {
		double salary=0;
		int[] b = {Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4])};
		for(int i : b) {
			if((i-40)>=8) {
				salary+=15*8;
			}
			else {
				salary+=(i-40)*15;
			}
		}
		return sevpay+FullTime.calismagunu*4*125+salary;
}

}
