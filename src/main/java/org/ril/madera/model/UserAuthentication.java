package org.ril.madera.model;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

/**
 * Created by Gamer on 09/03/2017.
 */
public class UserAuthentication implements Authentication {

    private final Users user;
    private boolean authenticated = true;

    public UserAuthentication(Users user) {
        this.user = user;
    }

    @Override
    public String getName() {
        return String.valueOf(user.getLast_name());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getAuthorities();
    }

    @Override
    public Object getCredentials() {
        return user.getToken();
    }

    @Override
    public Users getDetails() {
        return user;
    }

    @Override
    public Object getPrincipal() {
        return user.getLast_name();
    }

    @Override
    public boolean isAuthenticated() {
        return authenticated;
    }

    @Override
    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }
}
