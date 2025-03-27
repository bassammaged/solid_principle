package single_resposibility;

public class EmailNotification {
    public void veritication(User user) {
        System.out.println("verificaiton email sent to " + user.getEmail());
    }
}
