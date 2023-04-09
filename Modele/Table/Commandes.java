package Modele.Table;

import java.sql.Date;

public class Commandes {
    private int id;
    private java.sql.Date date;
    private int idclient;
    private int total;
    private int payé;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setId_client(int idclient) {
        this.idclient = idclient;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPayé() {
        return payé;
    }

    public void setPayé(int payé) {
        this.payé = payé;
    }

    @Override
    public String toString() {
        return "Commandes{" +
                "id=" + id +
                ", date=" + date +
                ", id_client=" + idclient +
                ", total=" + total +
                ", payé=" + payé +
                '}';
    }
}
