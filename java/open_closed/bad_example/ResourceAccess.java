package open_closed.bad_example;

public class ResourceAccess {
    public void accessFeatureA(User user) {
        if (user.getRole().equals("ADMIN")) {
            System.out.println("Feature A accessed successfully.");
        } else {
            System.out.println("Access denied.");
        }
    }

    public void accessFeatureB(User user) {
        if (user.getRole().equals("EDITOR")) {
            System.out.println("Feature B accessed successfully.");
        } else {
            System.out.println("Access denied.");
        }
    }
}