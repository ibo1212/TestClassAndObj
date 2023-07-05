public class Circle {

    // Question and Exercises classes and Objects

    // Access Leve Modifiers private or public

    protected double Speed;
    private double radius;
    private String color;


    void setRadius(double r) {
        if (r > 0) {
            radius = r;
        } else {
            System.out.println(" Radius should positive");
        }
    }


    double getRadius() {
        return radius;

    }

}

