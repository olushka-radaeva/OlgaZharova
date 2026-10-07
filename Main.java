public class Main {
    public static void main(String[] args) {
        // Задание 2. Создать массив из 5 товаров
        Product[] productsArray = new Product[5];

        // Заполняем массив объектами
        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599.0, true);
        productsArray[1] = new Product("iPhone 15 Pro", "10.09.2024", "Apple Inc.", "USA", 1299.0, false);
        productsArray[2] = new Product("Xiaomi 14", "15.11.2024", "Xiaomi", "China", 899.0, true);
        productsArray[3] = new Product("Google Pixel 8", "01.10.2024", "Google", "USA", 799.0, false);
        productsArray[4] = new Product("OnePlus 12", "20.01.2025", "OnePlus", "China", 699.0, true);

        // Выводим информацию о каждом товаре
        for (Product product : productsArray) {
            product.printInfo();
        }
    }
}