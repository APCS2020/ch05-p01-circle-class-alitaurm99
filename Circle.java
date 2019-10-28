public class Circle{
    private double radius;
    private String color;
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r, String color){
        radius = r;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double r){
        radius = r;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
