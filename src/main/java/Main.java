/**
 * @author Pleshakov Vladimir
 * @date 15.04.2026
 * @description Collections and generics
 */

//Задача 1:
//        Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
//        4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
//        При решении использовать коллекции.
//        Задача 2:
//        Создать класс, который будет хранить в себе коллекцию с названиями животных.
//        Реализовать методы удаления и добавления животных по следующим правилам:
//        добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//        объекта этого класса в main методе другого класса.
//        Задача 3:
//        Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//        оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//        Написать метод, который удаляет студентов со средним баллом <3. Если средний
//        балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//        printStudents(List<Student> students, int course), который получает список студентов и
//        номер курса. А также печатает на консоль имена тех студентов из списка, которые
//        обучаются на данном курсе.

//Задача № 1
//        Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
//        4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
//        При решении использовать коллекции.
public static void main(String[] args) {
    ArrayList<String> numbers = new ArrayList<>(5);
    Scanner numbscanner = new Scanner(System.in);
    System.out.println("Введите значения :");
    numbers.add(numbscanner.nextLine());
    for (int i = 0; i < numbers.size(); i++) {
        String current = numbers.get(i);
        for (int j = i + 1; j < numbers.size(); j++) {
            numbers.remove(i);
        }


        System.out.println("Список без дубликатов: " + numbers);
        numbscanner.close();
    }
//        Задача 2:
//        Создать класс, который будет хранить в себе коллекцию с названиями животных.
//        Реализовать методы удаления и добавления животных по следующим правилам:
//        добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//        объекта этого класса в main методе другого класса.

        LinkedList<Animal> list = new LinkedList<>();
        Animal animal1 = new Animal("Tosha");
        Animal animal2 = new Animal("Barsik");
        Animal animal3 = new Animal("Murka");
        Animal animal4 = new Animal("Ryszhik");
        Animal animal5 = new Animal("Gosha");
        Animal animal6 = new Animal("Tom");
        Animal animal7 = new Animal("Musya");
        list.add(animal1);
        list.add(animal2);
        list.add(animal3);
        list.add(animal4);
        list.add(animal5);
        list.add(animal6);
        list.add(animal7);
remove(list);
add(list);
        System.out.println(list);
    }
private static void add(List<Animal> animal) {
    for (int i = 0; i < animal.size(); i++)
        animal.add(1, new Animal("Gora"));

    System.out.println("Добавлен" + animal);
}


private static void remove(List<Animal> animal) {
    int elementsToRemove = Math.min(1, animal.size());
    for (int i = 0; i < elementsToRemove; i++) {
        Animal removed = animal.remove(animal.size() - 1);
        System.out.println("Удален: " + removed);

    }


    List<Students> students = new ArrayList<>();
    Students students1 = new Students("wfwaf", "dsad", 3, 3);
    students.add(new Students("Aleksey", "Full", 3, 3.4));
    students.add(new Students("Vladimir", "Correspondence", 2, 4.7));
    students.add(new Students("Ivan", "Remote", 4, 5.3));
    students.add(new Students("Semen", "Full-time and part-time", 4, 3.3));
    students.add(new Students("Ekaterina", "Full", 3, 4.7));
    students.add(new Students("Anna", "Correspondence", 2, 4.3));
    students.add(new Students("Liza", "Remote", 3, 3.3));
    students.add(new Students("Masha", "Full-time and part-time", 4, 3.3));
    System.out.println("До удаления: " + students);
    System.out.println("После удаления: " + students);

}







































