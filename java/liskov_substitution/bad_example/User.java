package liskov_substitution.bad_example;

interface User {
    void viewMyProfile();
    void updateMyProfile();
    void deleteMyProfile();
    void deleteProfile(String UserId);
    void updateProfile(String UserId);
    void archiveProfile(String UserId);
}
