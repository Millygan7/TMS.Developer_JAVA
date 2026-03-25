class Rectangle2 extends Figure2 {
    Rectangle2(double а, double b ,double e ) {
        super(а, b, e);
    }
@Override
    double perimetr() {
        System.out.println("Bнyтpи perimeter () для Trinagle . ");
        return diml* (dim2 + dim3);
    }

}
