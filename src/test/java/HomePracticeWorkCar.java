import org.junit.jupiter.api.Test;

public class HomePracticeWorkCar {
    @Test
    public void workingWithCar() {
        Car vw = new Car();

        vw.setName("Golf");
        vw.setSlim(1600);
        vw.setWeight(1150);
        vw.setVw('V');
        vw.setItemCount(12345678f);

        Car vw2 = new Car();

        vw2.setSlim(1000);
        vw2.setVw('7');
        vw2.setItemCount(1f);

        System.out.println(vw.getVw());
        System.out.println(vw.getName());

        System.out.println(vw2.getItemCount());
        System.out.println(vw2.getVw());











    }
}
