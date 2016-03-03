package projectTwo;

public class Payroll {

	private int[] _employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
	private int[] _hours = new int[7];
	private double[] _payRate = new double[7];
	private double[] _wages = new double[7];
	
	
	
	
	
	
	
	
	public int[] get_employeeId() {
		return _employeeId;
	}
	public void set_employeeId(int[] _employeeId) {
		this._employeeId = _employeeId;
	}
	public int[] get_hours() {
		return _hours;
	}
	public void set_hours(double _hours, int i) {
		this._hours[i] = (int) _hours;
	}
	public double[] get_payRate() {
		return _payRate;
	}
	public void set_payRate(double _payRate, int i) {
		this._payRate[i] = _payRate;
	}
	public double[] get_wages() {
		
		return _wages;
	}
	public void set_wages(int i) {
		_wages[i] = get_hours()[i] * get_payRate()[i];
		this._wages = _wages;
	}
	
	public String toString(int i){
		String str;
		
		str = "Employee "+(i+1)+" ID: "+_employeeId[i]+" Wages "+_wages[i];
		
		return str;
	}
	
}
