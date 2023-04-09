package Modele.Table;

public class Article {

        private int id;
        private String nom;

        private String description;

        private float prixunitaire;
        private float prixgroupé ;
        private float quantitégroupé;


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

    public float getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(float prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public float getPrixgroupé() {
        return prixgroupé;
    }

    public void setPrixgroupé(float prixgroupé) {
        this.prixgroupé = prixgroupé;
    }

    public float getQuantitégroupé() {
        return quantitégroupé;
    }

    public void setQuantité_groupé(float quantitégroupé) {
        this.quantitégroupé = quantitégroupé;
    }


    public String toString() {
            return "Article{" + "id: " + id + " nom: " + nom + " description: "+ description+
                    " prix unitaire: " + prixunitaire+ " prix groupé: "+ prixgroupé +" quantité groupé: "+ quantitégroupé+ '\'' + '}';
        }
    }

