public class Rectangle implements figureShape {

    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor){
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area(){
        return width * height;
    }

    @Override
    public double perimeter(){
        return 2 * (width + height);
    }

    @Override
    public String fillColor(){
        return fillColor;
    }

    @Override
    public String borderColor(){
        return borderColor;
    }
}
