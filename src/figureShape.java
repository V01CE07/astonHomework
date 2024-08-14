public interface figureShape {
    double area();
    double perimeter();

    default double calculatePerimeter(){
        return perimeter();
    }

    String fillColor();
    String borderColor();
}
