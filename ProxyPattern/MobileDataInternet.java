public class MobileDataInternet implements InternetOptions {
 
    public MobileDataInternet() {
        IntialConnection();
    }
    
    @Override
    public void connect() {
        System.out.println("Connected to Internet");
    }
    private void IntialConnection() {
         System.out.println("Searching for Internet connection");
    }
     
}