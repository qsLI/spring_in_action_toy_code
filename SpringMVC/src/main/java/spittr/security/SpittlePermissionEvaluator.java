package spittr.security;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import spittr.Spittle;

import java.io.Serializable;

/**
 * Created by KL on 2016/5/27.
 */
public class SpittlePermissionEvaluator implements PermissionEvaluator {
    private static final GrantedAuthority ADMIN_AUTHORITY = new GrantedAuthorityImpl("ROLE_ADMIN");
    @Override
    public boolean hasPermission(Authentication authentication, Object target, Object permission) {

        if (target instanceof Spittle) {
            Spittle spittle = (Spittle) target;
            String username = spittle.getSpitter().getUsername();
            if ("delete".equals(permission)) {
                return isAdmin(authentication) || username.equals(authentication.getName());
            }
        }

        throw new UnsupportedOperationException(
                "hasPermission not supported for object <" + target
                        + "> and permission <" + permission + ">");
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable serializable, String s, Object o) {
        return false;
    }

    private boolean isAdmin(Authentication authentication) {
        return authentication.getAuthorities().contains(ADMIN_AUTHORITY);
    }
}
