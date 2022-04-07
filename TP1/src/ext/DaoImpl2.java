package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {

    // Exemple de connection à la base de donnée
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double data=Math.random()*30;
        return data;
    }
}
