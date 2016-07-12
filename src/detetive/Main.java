//Source file: C:\\DOCUMENTS AND SETTINGS\\ESTIVADOR\\DESKTOP\\Rose\\detetive\\Main.java

package detetive;

import java.rmi.RemoteException;

import detetive.controler.CGUI;

/**
 * @author Estivador
 */
public class Main {
	public static void main(String[] args) {
			try {
				new CGUI();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
