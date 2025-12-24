package in.co.rays.exception.custom;

public class LoginException extends Exception { // custom exception, programmer define exception, user define exception

	public LoginException(String msg) {
		super(msg);
	}
}
