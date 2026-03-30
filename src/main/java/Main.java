/**
@author
Pleshakov Vladimir
 *@date 23.03.2026
        *@description TwoArrayMassives
 */

//public class Main {
//}
//Задача№1
//Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с помощью метода,
//который печатает название должности и реализует этот метод в созданных
//классы.
//Accountant accountant = new Accountant("Анна Иванова");
//Director director = new Director("Пётр Сидоров");
//Employee employee = new Employee("Иван Петров");
//


//void main() {
//
//    accountant.print();
//    director.print();
//    employee.print();
//}
//
//
//Задача№2
//Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//функция подсчета площади для фигур каждого типа и подсчета периметра (использование
//                                                                              абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран статистики
//периметр всех фигур в массиве.
//public static void main(String[] args) {
//
//    Figure f = new Figure(10, 10);
//    Rectangle r = new Rectangle(9, 5);
//    Triangle t = new Triangle ( 1,9) ;
//    Circle c = new Circle (2,2);
//    Figure figref;
//
//    figref = r;
//    System.out . println ( "Плoщaдь равна " + figref. area () );
//    figref = t;
//    System.out . println ( " Плoщaдь равна " + figref. area () );
//    figref = f;
//    System.out . println ("Плoщaдь равна " + figref . area () );
//    figref = c;
//    System.out . println ("Плoщaдь равна " + figref . area () );

//    }

//    public static void main(String[] args) {
//
//        Figure2 f = new Figure2(10, 10, 1);
//        Rectangle2 r = new Rectangle2(9, 5, 3);
//        Triangle2 t = new Triangle2(1, 4, 6);
//        Circle2 c = new Circle2(2, 2, 5);
//        Figure2 figref2;
//
//
//        figref2 = r;
//        System.out.println("Периметр равен " + figref2.perimetr());
//        figref2 = t;
//        System.out.println(" Перриметр  равен " + figref2.perimetr());
//        figref2 = f;
//        System.out.println("Периметр равен " + figref2.perimetr());
//        figref2 = c;
//        System.out.println("Периметр равен " + figref2.perimetr());
//
//        System.out.println("");
//
//        double sumPerimetr = 0;
//        Figure2[] figures = new Figure2[5];
//
//        figures[0] = new Circle2(3, 5, 8);
//        figures[1] = new Triangle2(3, 4, 9);
//        figures[2] = new Triangle2(3, 4, 9);
//        figures[3] = new Figure2(5, 7, 7);
//        figures[4] = new Rectangle2(22, 77, 9);
//
//
//        for (Figure2 figure2 : figures) {
//            sumPerimetr += figure2.sumPerimetr();
//            System.out.println("Сумма параметров всех фигур равна:  " + sumPerimetr);
//
//        }
//    }
//}







