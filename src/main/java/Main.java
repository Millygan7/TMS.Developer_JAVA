public class Main {
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Animal rabbit = new Rabbit("трава", " мясо");
    Animal dog = new Dog("Бобрик","ss");
    Animal tiger =  new Tiger("ss","ss");
    System.out.println("=== Звуки животных ===");
   dog.voice();
    tiger.voice();
    rabbit.voice();

    System.out.println("\n=== Питание ===");

    // Собака
    dog.eat("Grass");
    dog.eat("Meat");
    dog.eat("Cheese");

    System.out.println();

    // Тигр
    tiger.eat("Grass");
    tiger.eat("Meat");
    tiger.eat("Fish");

    System.out.println();

    // Кролик
    rabbit.eat("Grass");
    rabbit.eat("Meat");
    rabbit.eat("Carrot");
}

