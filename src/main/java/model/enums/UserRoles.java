package model.enums;

/**
 * Role names for scheme roles
 */
public enum UserRoles {
    ROLE_ADMIN("ROLE_ADMIN"), ROLE_USER("ROLE_USER");

    public final String value;

    UserRoles(final String value) {
        this.value = value;
    }

}
