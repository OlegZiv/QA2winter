import org.junit.jupiter.api.Test;

public class AirLocationTest {
   @Test
    public void workingWithAir2() {
       AirLocation firstAirLocation = new AirLocation();

       firstAirLocation.setLocation("Jurmala");
       firstAirLocation.setDensity(800);
       firstAirLocation.setH20("water");

       AirLocation secondAirLocation = new AirLocation();
       secondAirLocation.setClear("White");
       secondAirLocation.setSaturation(200);
       secondAirLocation.setLocation("Riga");

       System.out.println("Good job");
       System.out.println("1st air2:");
       System.out.println(firstAirLocation.getLocation());

       System.out.println("2nd air2:");
       System.out.println(secondAirLocation.getSaturation());



    }
}
