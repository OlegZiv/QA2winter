import org.junit.jupiter.api.Test;

public class HomePracticeWorkDoor {
    @Test

    public void WorkingWithDoor() {

        Door Entry = new Door();

        Entry.setBrand("Reaton");
        Entry.setRed("Black");
        Entry.setWithGlass("WithGlass");
        Entry.setItemCount('3');
        Entry.setPrice(1.545);

        System.out.println("Door to Alex");
        System.out.println(Entry.getBrand());
        System.out.println(Entry.getColor());
        System.out.println(Entry.getWithGlass());
        System.out.println(Entry.getItemCount());
        System.out.println(Entry.getPrice());

    }
}
