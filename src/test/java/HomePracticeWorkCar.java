import org.junit.jupiter.api.Test;

public class HomePracticeWorkCar {
    @Test
    public void workingWithCar() {
        Car VW = new Car();

        VW.setName("Golf");
        VW.setSlim(1600);
        VW.setWeight(1150);
        VW.setVw('V');
        VW.setItemCount(12345678f);

        Car VW2 = new Car();

        VW2.setSlim(1000);
        VW2.setVw('7');
        VW2.setItemCount(1f);

        System.out.println(VW.getVw());
        System.out.println(VW.getName());

        System.out.println(VW2.getItemCount());
        System.out.println(VW2.getVw());











    }
}
