public class Triangle implements figureShape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;

    }
    @Override
    public double area(){
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    public double perimeter(){
        return sideA + sideB + sideC;
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
