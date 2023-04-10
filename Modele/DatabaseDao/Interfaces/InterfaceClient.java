package Modele.DatabaseDao.Interfaces;

import Modele.Table.Client;

public interface InterfaceClient {
    public void saveClient(String nom, String prénom, String adresse, String ville, String pays, String mail);
}
