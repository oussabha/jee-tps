package pres;

import metier.MetierImpl;
import ext.DaoImpl2;

/* Injection des dépendances
par instanciation statique
 */

public class presentation {
    public static void main(String[] args){
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Resultat="+metier.calcul());
    }
}
