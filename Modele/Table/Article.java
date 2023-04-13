package Modele.Table;

public class Article {

        private int id;
        private String nom;

        private String description;

        private float prix;

        private float quantité;

        private String catégorie;

        private int stock;



    public String getCatégorie() {
        return catégorie;
    }

    public void setCatégorie(String catégorie) {
        this.catégorie = catégorie;
    }



    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getQuantité() {
        return quantité;
    }

    public void setQuantité(float quantité) {
        this.quantité = quantité;
    }

    public String toString() {
            return "Article{" + "Id: " + id + " Nom: " + nom + " Description: "+ description+
                    " Prix: " + prix+  " Quantité: "+ quantité+ " Catégorie: "+ catégorie+" Stock: "+stock+ '\'' + '}';
        }
    }

