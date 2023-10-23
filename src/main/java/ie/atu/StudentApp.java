package ie.atu;

public class StudentApp {

    private String Name;
    private String Email;
    private String cousre;

    public StudentApp(String name, String email, String cousre) {
        Name = name;
        Email = email;
        this.cousre = cousre;
    }
    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getCousre() {
        return cousre;
    }


}

