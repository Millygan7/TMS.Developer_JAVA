










public class Main {
    public static void main(String[] args) {
        SystemUser systemUser = new SystemUser("Danny", 123455667, 925100232);
        SystemUser systemUser1 = new SystemUser("Danny", 123455667, 925100232);
        System.out.println("systemUser .equals(systemUser1)? " + systemUser.equals(systemUser1));
        System.out.println(systemUser1.hashCode() == systemUser.hashCode());
        System.out.println(systemUser);





        User user = new User("Danny", "derley63@yandex.ru", 9999241);
        User user1 = new User("Danny", "derley63@yandex.ru", 9999242);
        System.out.println("Данные до клонирования :" + user.getUsername() + "  " + user.getEmail() + " " + user.getID());
        User clone;
        try {
            User clonedUser = (User) user.clone();
            clone = user.setUsername("Milligan");
            clone = user.setID(12323);
            clone = user.setEmail("fcMU.com");
            System.out.println("Клон после изменения данные: " +
                    clone.getUsername() + " - " + clone.getID() + "ID");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}


