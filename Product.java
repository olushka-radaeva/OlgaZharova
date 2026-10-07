// Задание 1. Класс Товар
public class Product {
    // Поля класса (характеристики товара)
    String name;          // Название
    String productionDate; // Дата производства
    String manufacturer;   // Производитель
    String country;        // Страна происхождения
    double price;          // Цена
    boolean isBooked;      // Состояние бронирования покупателем

    // Конструктор — метод, который создает объект и заполняет поля
    public Product(String name, String productionDate, String manufacturer, String country, double price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isBooked = isBooked;
    }

    // Метод, который выводит информацию об объекте в консоль
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна: " + country);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + (isBooked ? "Да" : "Нет"));
        System.out.println("-------------------------");
    }
}