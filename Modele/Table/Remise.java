package Modele.Table;

public class Remise {
    private int id;
    private int idarticle;
    private int quantitemin;
    private float reduction ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdarticle() {
        return idarticle;
    }

    public void setIdarticle(int idarticle) {
        this.idarticle = idarticle;
    }

    public int getQuantitemin() {
        return quantitemin;
    }

    public void setQuantitemin(int quantitemin) {
        this.quantitemin = quantitemin;
    }

    public float getReduction() {
        return reduction;
    }

    public void setReduction(float reduction) {
        this.reduction = reduction;
    }

    @Override
    public String toString() {
        return "Remise{" +
                "id=" + id +
                ", idarticle=" + idarticle +
                ", quantitemin=" + quantitemin +
                ", reduction=" + reduction +
                '}';
    }
}
