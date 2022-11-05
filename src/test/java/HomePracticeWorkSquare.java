import org.junit.jupiter.api.Test;

public class HomePracticeWorkSquare {
    @Test
    public void workWithSquare() {

        Square Black = new Square();

        Black.setName("Black");
        Black.setResultInWords("Free Wave");
        Black.setResult(222.22);
        Black.setItemCount(11);
        Black.setSide(77);

        System.out.println(Black.getName());
        System.out.println(Black.getResult());
        System.out.println(Black.getSide());

    }
}
