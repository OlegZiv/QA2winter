import org.junit.jupiter.api.Test;

public class Air2 {
   @Test
    public void workingWithAir2() {
       Air firstAir = new Air();

       firstAir.setLocation("Jurmala");
       firstAir.setDensity(800);
       firstAir.setH20("water");

       Air secondAir = new Air();
       secondAir.setClear("White");
       secondAir.setSaturation(200);
       secondAir.setLocation("Riga");

       System.out.println("Good job");
       System.out.println("1st air2:");
       System.out.println(firstAir.getLocation());

       System.out.println("2nd air2:");
       System.out.println(secondAir.getSaturation());



    }
}
