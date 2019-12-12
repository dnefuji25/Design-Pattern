public class WifiHotspot implements InternetOptions {
    
    private static MobileDataInternet mdi;
    
    @Override
    public void connect() {
        if (mdi == null) {
            mdi = new MobileDataInternet();
        }
        mdi.connect();
    }
}