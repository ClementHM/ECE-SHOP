package Modele.DatabaseDao;


import Modele.Table.Employé;

import java.util.List;

public interface Interfaceemployé {
    public Employé getEmployeById(int id);
    List<Employé> lister();


}
