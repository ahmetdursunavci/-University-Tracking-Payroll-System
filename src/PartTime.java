
public class PartTime extends Employee {

	public PartTime(String name, String registernumber, String position, int startyear) {
		super(name, registernumber, position, startyear);
	}
	private double sevpay=super.calculatesevpay();
	public double calculatesalary(String[] a ) {
		double salary=0;
		int[] b = {Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4])};
		for(int i : b) {
			if(i>=20) {
				salary+=20*18;
			}
			else if(i>=10) {
				salary+=i*18;
			}
				
			}
		return salary+sevpay;
		}
	}


