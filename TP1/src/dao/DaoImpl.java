package dao;

public class DaoImpl implements IDao{

    // Exemple de connection à la base de donnée
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double data=Math.random()*20;
        return data;
    }
}
