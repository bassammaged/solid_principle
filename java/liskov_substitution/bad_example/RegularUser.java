package liskov_substitution.bad_example;

public class RegularUser implements User{
    private String userId;

    public RegularUser(String userId) {
        this.userId = userId;
    }

    @Override
    public void viewMyProfile() {
        System.out.println("Viewing profile for user " + this.userId);
    }   
    
    @Override
    public void updateMyProfile() {
        System.out.println("Updating profile for user " + this.userId);
    }
    
    @Override
    public void deleteMyProfile() {
        System.out.println("Deleting profile for user " + this.userId);
    }

    @Override
    public void deleteProfile(String UserId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateProfile(String UserId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void archiveProfile(String UserId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
