package Modele.DatabaseDao.Interfaces;

import Modele.Table.Commande;

import java.sql.Date;
import java.util.List;

public interface InterfaceCommande {
     List<Commande> CommandeClient(int idclient);
     public void Ajout();
}
