public interface Shape {
    double getPerimeter();   // Периметр
    double getArea();        // Площадь
    String getFillColor();   // Цвет заливки
    String getBorderColor(); // Цвет границы

    // Дефолтный метод — общий для всех фигур
    default void printInfo() {
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("-------------------------");
    }
}