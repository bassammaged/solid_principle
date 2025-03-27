package open_closed;

public class FeatureAccess {
    public void accessFeature(User user, RoleAccess rule, String featureName) {
        if (rule.isAuthorized(user)) {
            System.out.println(featureName + " accessed successfully.");
        } else {
            System.out.println("Access denied for " + featureName + ".");
        }
    }
}
