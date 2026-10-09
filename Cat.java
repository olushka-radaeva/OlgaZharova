public class Cat extends Animal {
    static int catCount = 0;   // Счетчик котов
    boolean isFull = false;    // Сытость (по умолчанию голоден)

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. (макс. 200 м.)");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }

    // Метод, чтобы кот покушал из миски
    public void eat(Bowl bowl, int amount) {
        if (bowl.getFood() >= amount) {
            bowl.decreaseFood(amount);
            isFull = true;
            System.out.println(name + " поел " + amount + " еды и насытился.");
        } else {
            System.out.println(name + " не стал есть — в миске недостаточно еды (нужно " + amount + ", есть " + bowl.getFood() + ").");
        }
    }
}