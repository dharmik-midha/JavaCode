import java.rmi.*;

public class RMIClient {
	public static void main(String args[]) {
		try {
			Multiply stub = (Multiply) Naming.lookup("rmi://localhost/Dharmik");
			System.out.println(stub.Multiply(15, 5));
		} catch (Exception e) {
		}
	}
}
