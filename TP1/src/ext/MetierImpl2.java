package ext;

import dao.IDao;
import metier.IMetier;

public class MetierImpl2 implements IMetier {
        // Couplage faible
        public IDao dao;

        @Override
        public double calcul() {
            double d=dao.getData();
            double res=d*30;
            return res;
        }

        public void setDao(IDao dao){
            this.dao=dao;
        }
}
