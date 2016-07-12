package detetive.model.rmi;

import java.rmi.*;

/**
 * <p>Title: Othello</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2003</p>
 * <p>Company: Memorial University</p>
 * @author Theodore S. Norvell
 * @version 1.0
 */

public interface RemoteCountMonitorInterface extends Remote {
    void decrement() throws RemoteException ;
}