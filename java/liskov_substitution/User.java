package liskov_substitution;

abstract class User {
    private String userId; 
    private String username;
    private String email;

    User(String userId, String uesrname, String email) {
        this.userId = userId;
        this.username = uesrname;
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

}
