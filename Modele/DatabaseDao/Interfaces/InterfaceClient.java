package Modele.DatabaseDao.Interfaces;

import Modele.Table.Client;

import java.util.List;

public interface InterfaceClient {

   // public Client creationcompte(ActionEvent event, String nom, String prénom, String adresse, String email, String password);

    List<Client> Connexion();

    void saveClient(String nom, String prénom, String adresse, String email, String password);
}
