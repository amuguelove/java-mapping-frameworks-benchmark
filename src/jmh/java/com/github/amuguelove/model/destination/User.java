package com.github.amuguelove.model.destination;

import com.google.common.base.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String username;
    private String email;
    private AccountStatus userAccountStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o.getClass() == com.github.amuguelove.model.source.User.class) {
            com.github.amuguelove.model.source.User user =
              (com.github.amuguelove.model.source.User) o;
            return Objects.equal(username, user.getUsername()) &&
                    Objects.equal(email, user.getEmail()) &&
                    userAccountStatus.ordinal() == user.getUserAccountStatus().ordinal();
        }
        if (o.getClass() != getClass()) return false;
        User user = (User) o;
        return Objects.equal(username, user.username) &&
          Objects.equal(email, user.email) &&
          userAccountStatus == user.userAccountStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username, email, userAccountStatus);
    }

}
