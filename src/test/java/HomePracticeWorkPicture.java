import org.junit.jupiter.api.Test;

public class HomePracticeWorkPicture {
    @Test
    public void workingWithPicture() {
        Picture Mone = new Picture();

        Mone.setName("Madam");
        Mone.setCount(1L);
        Mone.setPictureNumber('3');
        Mone.setSize(140);
        Mone.setQuantity(22);

        System.out.println("Picture Mone");
        System.out.println(Mone.getName());
        System.out.println(Mone.getQuantity());

    }
}
