package liskov_substitution.bad_example;

class AdminUser implements User {
    private String userId;

    public AdminUser(String userId) {
        this.userId = userId;
    }

    @Override
    public void viewMyProfile() {
        System.out.println("Viewing admin profile for user: " + userId);
    }

    @Override
    public void updateMyProfile() {
        System.out.println("Updating admin profile for user: " + userId);
    }

    @Override
    public void deleteMyProfile() {
        System.out.println("Deleting admin profile for user: " + userId);
    }

    @Override
    public void deleteProfile(String UserId) {
        System.out.println("Admin deleting profile for user: " + UserId);
    }

    @Override
    public void updateProfile(String UserId) {
        System.out.println("Admin updating profile for user: " + UserId);
    }

    @Override
    public void archiveProfile(String UserId) {
        System.out.println("Admin archiving profile for user: " + UserId);
    }


}