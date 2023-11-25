package rmiService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.server.RemoteObject;

// La classe ConversionImpl implémente l'interface IConversion
public class ConversionImpl extends UnicastRemoteObject implements IConversion {

    // Constructeur de la classe ConversionImpl
    // Lève une RemoteException
    public ConversionImpl() throws RemoteException {
        super(); // Appel du constructeur de la classe UnicastRemoteObject
    }

    // Implémentation de la méthode convertirMontant de l'interface IConversion
    @Override
    public double convertirMontant(double mnt) throws RemoteException {
        // La méthode multiplie le montant passé en argument par 3.3 et le retourne
        return mnt * 3.3;
    }
}