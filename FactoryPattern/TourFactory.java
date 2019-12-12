public class TourFactory {
    
    public Tour getPackage(String p) {
        if(p.equals("Summer")) {
            return new SummerPackage();
        }
        else if(p.equals("Autumn")) {
            return new AutumnPackage();
        }
        else if(p.equals("Winter")) {
            return new WinterPackage();
        }
        else {
            return null;
        }
    }
}