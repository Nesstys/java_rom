public class Gas_Mileage {

        double tmile;
        double tgal;

        public double gettrav(int mile,int gal)
        {
            tmile += mile;
            tgal += gal;

            return mile / (double)gal;
        }
        public double gettotmile()
        {
            return tmile;
        }
        public double gettotgal()
        {
            return tgal;
        }
        public double gettottrav()
        {
            return tmile / tgal;
        }
    }

