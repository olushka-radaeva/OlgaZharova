public class Park {

    // Внутренний класс Аттракцион
    public class Attraction {
        String name;         // Название аттракциона
        String workingHours; // Время работы
        double price;        // Стоимость

        // Конструктор внутреннего класса
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации об аттракционе
        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println("-------------------------");
        }
    }

    // Точка входа — для демонстрации
    public static void main(String[] args) {
        // Создаем объект внешнего класса
        Park park = new Park();

        // Создаем объекты внутреннего класса через внешний
        Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 500);
        Attraction attraction2 = park.new Attraction("Американские горки", "11:00 - 21:00", 800);
        Attraction attraction3 = park.new Attraction("Комната страха", "12:00 - 20:00", 400);

        // Выводим информацию
        attraction1.printInfo();
        attraction2.printInfo();
        attraction3.printInfo();
    }
}