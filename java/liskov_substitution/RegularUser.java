package liskov_substitution;

public class RegularUser extends User implements UserOperations {

    RegularUser(String userId, String uesrname, String email) {
        super(userId, uesrname, email);
    }

    @Override
    public void viewMyProfile() {
        System.out.println("Viewing profile for user " + this.getUserId());
    }
    
    @Override
    public void updateMyProfile() {
        System.out.println("Updating profile for user " + this.getUserId());
    }
    
    @Override
    public void deleteMyProfile() {
        System.out.println("Deleting profile for user " + this.getUserId());
    }

    
    
    
}
