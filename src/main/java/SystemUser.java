import java.util.Objects;


public  class SystemUser extends Object {
    private String username;
    private int ID;
    private int telephoneUser;

    public SystemUser(String username, int ID, int telephoneUser) {
        this.username = username;
        this.ID = ID;
        this.telephoneUser = telephoneUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTelephoneUser() {
        return telephoneUser;
    }

    public void setTelephoneUser(int telephoneUser) {
        this.telephoneUser = telephoneUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemUser systemUser = (SystemUser) o;
        if (getID() != systemUser.getID()) {
            return false;
        }
        if (getTelephoneUser() != systemUser.getTelephoneUser()) {
            return false;
        }

        return getUsername() != null
                ? getUsername().equals(systemUser.getUsername())
                : systemUser.getUsername() == null;

    }

    @Override
    public int hashCode() {

        return Objects.hash(username, telephoneUser, ID);
    }


    @Override
    public String toString() {
        return "SystemUser{"
                + "username='" + username + '\''
                + ", telehoneUser=" + telephoneUser
                + ", ID=" + ID
                + '}';


    }
}








