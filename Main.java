public class Main {
    public static void main(String[] args) {
        // Создаем животных
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");

        // Проверяем бег и плавание
        dogBobik.run(150);
        dogBobik.swim(5);
        dogBobik.swim(20); // Превышение лимита
        catMurzik.run(100);
        catMurzik.run(250); // Превышение лимита
        catMurzik.swim(10); // Кот не умеет плавать

        // Подсчет созданных животных
        System.out.println("\nВсего животных: " + Animal.animalCount);
        System.out.println("Собак: " + Dog.dogCount);
        System.out.println("Котов: " + Cat.catCount);

        // Массив котов и миска
        Cat[] cats = {catMurzik, catBarsik, new Cat("Васька")};
        Bowl bowl = new Bowl(20); // В миске 20 еды

        System.out.println("\n--- Кормление котов ---");
        for (Cat cat : cats) {
            cat.eat(bowl, 10); // Каждый пытается съесть 10
            System.out.println(cat.name + " сыт? " + cat.isFull);
        }

        // Добавляем еду в миску
        System.out.println("\n--- Добавляем еду ---");
        bowl.addFood(30);

        // Проверяем, что коты могут есть снова
        for (Cat cat : cats) {
            if (!cat.isFull) {
                cat.eat(bowl, 10);
                System.out.println(cat.name + " сыт? " + cat.isFull);
            }
        }
    }
}