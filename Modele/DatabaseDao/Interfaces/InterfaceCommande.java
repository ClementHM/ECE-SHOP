package Modele.DatabaseDao.Interfaces;

import Modele.Table.Commande;

import java.util.Date;
import java.util.List;

public interface InterfaceCommande {
     List<Commande> CommandeClient(int idclient);
     public void saveCommande(java.sql.Timestamp timestamp, int idclient, int total, int payé);
}
