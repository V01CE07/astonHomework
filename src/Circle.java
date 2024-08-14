public class Circle implements figureShape {
    private double circleRadius;
    private String fillColor;
    private String borderColor;

    public Circle (double circleRadius, String fillColor, String borderColor){
        this.circleRadius = circleRadius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double area(){
        return Math.PI * circleRadius * circleRadius;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * circleRadius;
    }

    public String fillColor(){
        return fillColor;
    }

    public String borderColor(){
        return borderColor;
    }

}
