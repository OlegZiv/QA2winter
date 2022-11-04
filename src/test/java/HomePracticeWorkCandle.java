import org.junit.jupiter.api.Test;

public class PracticeWork {
    @Test
    public void workingWithCandle() {
        Candle firstCandle = new Candle();

        firstCandle.setCircle(13);
        firstCandle.setBrand("oz1");
        firstCandle.setParaffin("black");
        firstCandle.setMass(20.20);
        firstCandle.setHeight(15);

        Candle secondCandle = new Candle();
        secondCandle.setCircle(11);
        secondCandle.setBrand("oz2");
        secondCandle.setParaffin("white");
        secondCandle.setMass(10.00);
        secondCandle.setHeight(7);

        System.out.println("Candle1");
        System.out.println(firstCandle.getBrand());
        System.out.println(firstCandle.getMass());

        System.out.println("Candle2");
        System.out.println(secondCandle.getBrand());
        System.out.println(secondCandle.getMass());


    }
}
