package open_closed;

public class RoleAccessAdmin implements RoleAccess {
    @Override
    public boolean isAuthorized(User user) {
        return user.getRole().equals("ADMIN");
    }
}
