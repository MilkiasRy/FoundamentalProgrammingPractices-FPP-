package lab12_2.employeeinfo;

public class OverdrawnAccountException extends Exception {
	public OverdrawnAccountException () {
		super();
	}
	public OverdrawnAccountException (String msg) {
		super(msg);
	}

}
