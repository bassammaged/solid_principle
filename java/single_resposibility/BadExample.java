package single_resposibility;

public class BadExample {
    private String firstname;
    private String lastname;
    private String email;

    public BadExample(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getFirstname(){
        return this.firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public String getEmail(){
        return this.email;
    }

    public void save(User user) {
        System.out.println("User" + user.getFirstname() + " " + user.getLastname() + " saved to database");
    }

    public void veritication(User user) {
        System.out.println("verificaiton email sent to " + user.getEmail());
    }


}
