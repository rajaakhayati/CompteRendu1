package Pres;

import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Presentation1 {
    public static void main(String []args) {
     // L'injection des dépendances

        //Ici l'instanciation est statique

        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());


    }
}
