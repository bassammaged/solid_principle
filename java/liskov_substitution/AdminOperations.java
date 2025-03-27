package liskov_substitution;

interface AdminOperations {
    void deleteProfile(String userId);
    void updateProfile(String userId);
    void archiveProfile(String userId);
}
