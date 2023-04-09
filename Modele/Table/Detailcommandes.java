package Modele.Table;

public class Detailcommandes {
    private int id;
    private int idcommande;
    private int idarticle;
    private int quantité;
    private float prixunitaire;
    private float prixtotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdcommande() {
        return idcommande;
    }

    public void setIdcommande(int idcommande) {
        this.idcommande = idcommande;
    }

    public int getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(int idarticle) {
        this.idarticle = idarticle;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public float getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(float prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public float getPrixtotal() {
        return prixtotal;
    }

    public void setPrixtotal(float prixtotal) {
        this.prixtotal = prixtotal;
    }

    @Override
    public String toString() {
        return "Detailcommandes{" +
                "id=" + id +
                ", idcommande=" + idcommande +
                ", idarticle=" + idarticle +
                ", quantité=" + quantité +
                ", prixunitaire=" + prixunitaire +
                ", prixtotal=" + prixtotal +
                '}';
    }
}
