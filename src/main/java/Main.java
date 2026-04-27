/**
 * @author Pleshakov Vladimir
 * @date 25.03.2026
 * @description Methods class Object
 */
                                   //Задача№1
//Создать класс для описания системы пользователя. Переопределить в классных методах
//toString, хэш-код и равно. Создайте несколько экземпляров класса с одним и тем же.
//значение полей и сравнение с помощью метода Equals.
//public class Main {
//   public static void main(String[] args) {
//        SystemUser systemUser = new SystemUser("Danny", 123455667, 925100232);
//        SystemUser systemUser1 = new SystemUser("Danny", 123455667, 925100232);
//        System.out.println("systemUser .equals(systemUser1)? " + systemUser.equals(systemUser1));
//        System.out.println(systemUser1.hashCode() == systemUser.hashCode());
//        System.out.println(systemUser1);
//
//    }
//                                    Задача *:
//Создать программу для создания поверхностного и глубокого клонирования объектов
//класса Пользователь. Пусть при входе в программу будет задействован тип операции клонирования
//        (поверхностное клонирование или глубокое), а также id юзера для клонирования
public static void main(String[] args) {
    User user = new User("Danny", "derley63@yandex.ru", 9999241);
    System.out.println("Данные до клонирования :" + user.getUsername() + "  " + user.getEmail() + " " + user.getID() );
    User clone;
    try{
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