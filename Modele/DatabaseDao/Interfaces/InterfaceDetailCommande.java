package Modele.DatabaseDao.Interfaces;

import Modele.Table.Commande;
import Modele.Table.Detailcommande;

import java.util.List;

public interface InterfaceDetailCommande {
    List<Detailcommande> CommandeParArticle(int idarticle);
}
