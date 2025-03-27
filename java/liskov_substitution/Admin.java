package liskov_substitution;

public class Admin extends User implements UserOperations,AdminOperations {

    Admin(String userId, String uesrname, String email) {
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
    
    @Override
    public void deleteProfile(String userId) {
        System.out.println("Deleting profile for user " + userId);
    }
    
    @Override
    public void updateProfile(String userId) {
        System.out.println("Updating profile for user " + userId);
    }
    
    @Override
    public void archiveProfile(String userId) {
        System.out.println("Archiving profile for user " + userId);
    }

    
    
    
}
