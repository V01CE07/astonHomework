public class Main {
    public static void main(String[] args) {

        figureShape circle = new Circle(10, "Черный", "Белый");
        figureShape rectangle = new Rectangle(2, 8, "Синий", "Белый");
        figureShape triangle = new Triangle(6, 8, 10, "Желтый", "Белый");

        figureInfo(circle);
        figureInfo(rectangle);
        figureInfo(triangle);
    }

    private static void figureInfo(figureShape figureShape){
        System.out.println("Фигура: " + figureShape.getClass().getSimpleName()); //берем название класса вместо конкретного наименования
        System.out.println("Периметр: " + figureShape.calculatePerimeter());
        System.out.println("Площадь: " + figureShape.area());
        System.out.println("Цвет заливки: " + figureShape.fillColor());
        System.out.println("Цвет границ: " + figureShape.borderColor());
        System.out.println();

    }
}