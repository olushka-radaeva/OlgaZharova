public class MainShapes {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Белый");
        Shape triangle = new Triangle(3, 4, 5, "Зеленый", "Желтый");

        System.out.println("--- Круг ---");
        circle.printInfo();

        System.out.println("--- Прямоугольник ---");
        rectangle.printInfo();

        System.out.println("--- Треугольник ---");
        triangle.printInfo();
    }
}
