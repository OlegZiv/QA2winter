import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student valera = new Student();
        valera.setFirsName("Valera");
        valera.setLastName("The Valera");
        valera.setEmail("valera@fff.com");
        valera.setPhone(" +3714657389899");

        Student liga = new Student("Liga", "Ivanova", "Liga@test.lv", "-5633445");
        Student dinko = new Student("Dinko", "Skatinsh", "Oma@)test.lv", "=33uu");
        Student artis = new Student("Artis", "Greates", "art@test.lv", "-56377");

        List<Student> students = new ArrayList<>();
        students.add(valera);
        students.add(liga);
        students.add(dinko);
        students.add(artis);


        //---------------------FOR-----------------------
        for (int i = 0; i < students.size(); i++) { // i = i + 1 ->> i++
            System.out.println(students.get(i).getFirsName());
        }
        //-----------------FOREACH-------------------
        for (Student s : students) {
            System.out.println(s.getFirsName() + " " + s.getLastName());
        }
        //--------------------FOREACH with IF-------------------
        System.out.println("Printing students with phone nr starting with +371");
        for (Student s : students){
            if (s.getPhone().startsWith("+371")){
                System.out.println(s.getFullName());

            }
        }
    }
}
