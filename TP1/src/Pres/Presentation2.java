package Pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String []args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //Ici l'instanciation est dynamique
        Scanner sc = new Scanner(new File("config.txt"));
        String className = sc.nextLine();
        Class cdao = Class.forName(className);
        IDao dao = (IDao) cdao.newInstance();

        className =sc.nextLine();
        Class cmetier= Class.forName(className);
        IMetier metier= (IMetier)cmetier.newInstance();
        Method method=cmetier.getMethod("setDao",IDao.class);

        // metier.setDao(dao)
        method.invoke(metier,dao);

        // Résultat de l'exécution
        System.out.println("Résultat --> "+metier.calcul());
    }
}
