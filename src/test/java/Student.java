public class Student {
    //--------------------------ATTRIBUTES---------------------
    private String firsName;
    private String lastName;
    private String email;
    private String phone;


    //-------------------------CONSTRUCTORS--------------------
    public Student() {

    }

    public Student(String firsName, String lastName, String email, String phone) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }


    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    //---------------CUSTOM METHODS------------------------------------

    public String getFullName(){
        return firsName + " " + lastName;
    }
}
