package single_resposibility;


public class UserDto {
    public void save(User user) {
        System.out.println("User" + user.getFirstname() + " " + user.getLastname() + " saved to database");
    }
}
