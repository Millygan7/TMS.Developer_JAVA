/**
@author
Pleshakov Vladimir
 *@date 31.03.2026
        *@description Method class Object
 */

public class User implements Cloneable {
    private String username;
    private String email;
    private long ID;

    public User(String username, String email, long ID) {
        this.username = username;
        this.ID = ID;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return null;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return null;
    }

    public long getID() {
        return ID;
    }

    public User setID(long ID) {
        this.ID = ID;
        return null;
    }

@Override
    public User clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }
}