  class Circle extends Figure {
    Circle(double а, double b) {
        super(а, b);
    }
@Override
     double area() {
        System.out.println("Bнyтpи area () для Circle . ");
        return diml * dim2 * dim2;
    }
}
