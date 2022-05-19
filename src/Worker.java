

public class Worker extends FullTime {

	public Worker(String name, String registernumber, String position, int startyear) {
		super(name, registernumber, position, startyear);
	}
	private double sevpay = super.calculatesevpay();
	public double calculatesalary(String[] a) {
		double salary=0;
		int[] b = {Integer.parseInt(a[1]),Integer.parseInt(a[2]),Integer.parseInt(a[3]),Integer.parseInt(a[4])};
		for(int i : b) {
			if((i-40)>=10) {
				salary+=11*10;
			}
			else {
				salary+=(i-40)*11;
			}
		}
		return sevpay+FullTime.calismagunu*4*105+salary;
}
}