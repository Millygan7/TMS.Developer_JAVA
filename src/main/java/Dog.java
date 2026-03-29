public class Dog extends Animal {

    public Dog(String grass, String meat) {
        super(grass, meat);


    }

    @Override
    public void voice() {
        System.out.println("Gav-Gav");
    }

    @Override
   void eat(String food) {
        if ("Grass".equals(food)) {
            System.out.println(  "Собака  недовольна: не люблю траву!");
        } else if ("Meat".equals(food)) {
            System.out.println( " Собака довольна: обожаю мясо!");
        } else {
            System.out.println( " Собака не хочет есть " + food);
        }

    }
}







