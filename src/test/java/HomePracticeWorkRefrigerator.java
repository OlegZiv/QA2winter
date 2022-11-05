import org.junit.jupiter.api.Test;

public class HomePracticeWorkRefrigerator {
    @Test

    public void workWithRefrigerator() {

        Refrigerator Mille = new Refrigerator();

        Mille.setTitle("Boch");
        Mille.setDepth(60);
        Mille.setWeight(40.50);
        Mille.setHeight(160);
        Mille.setItemCount(1);

        System.out.println(Mille.getTitle());
        System.out.println(Mille.getWeight());
        System.out.println(Mille.getItemCount());

    }
}
