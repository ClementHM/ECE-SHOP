package Modele.DatabaseDao.Interfaces;

import Modele.Table.Client;

import java.awt.event.ActionEvent;

public interface InterfaceClient {
    public void saveClient(String nom, String prénom, String adresse, String ville, String pays, String mail);
    public Client creationcompte(ActionEvent event, String nom, String prénom, String adresse, String email, String password);
}
