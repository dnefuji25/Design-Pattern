public class Main
{
	public static void main(String[] args) {
		TourFactory tf= new TourFactory();
	    Tour tour1=tf.getPackage("Summer");
		tour1.packageDetails();
		Tour tour2=tf.getPackage("Autumn");
		tour2.packageDetails();
		Tour tour3=tf.getPackage("Winter");
		tour3.packageDetails();
	}
}
