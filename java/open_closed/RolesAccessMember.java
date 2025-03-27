package open_closed;

public class RolesAccessMember implements RoleAccess{
    @Override
    public boolean isAuthorized(User user) {
        return user.getRole().equals("MEMBER");
    }

}
