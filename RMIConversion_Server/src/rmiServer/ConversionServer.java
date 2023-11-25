package rmiServer;
import rmiService.ConversionImpl;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ConversionServer {
    public static void main(String[] args) throws RemoteException {

        try {
            // Création de l'objet distant ConversionImpl
            //SKELETON
            ConversionImpl od = new ConversionImpl();
            // Création d'un registre RMI sur le port 1099
            LocateRegistry.createRegistry(1099);
            // Affichage de l'objet distant ConversionImpl
            System.out.println(od.toString());
            // Liaison de l'objet distant à l'URL rmi://localhost:1099/objetdistant
            Naming.rebind("rmi://localhost:1099/objetdistant", od);
        } catch (Exception e) {
            // Gestion des exceptions : affichage de la trace de l'exception en cas d'erreur
            e.printStackTrace();
        }
    }
}