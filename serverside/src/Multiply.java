import java.rmi.*;

public interface Multiply extends Remote {
	public int Multiply(int x, int y) throws RemoteException;
}
