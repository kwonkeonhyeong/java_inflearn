package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

/*    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
    }*/

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof UserV2 userV2)) {
            return false;
        }
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
