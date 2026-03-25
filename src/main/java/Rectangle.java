class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
@Override
   double area() {
        System.out.println("Bнyтpи area () для Rectangle . ");
        return diml * dim2;
    }
}
