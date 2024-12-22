public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "самец";
        wolf.name = "Ауф";
        wolf.weight = 54.4f;
        wolf.age = 6;
        wolf.color = "серый";

        System.out.println("Пол = " + wolf.sex);
        System.out.println("Кличка = " + wolf.name);
        System.out.println("Вес = " + wolf.weight + " кг");
        System.out.println("Возраст = " + wolf.age + " лет");
        System.out.println("Окрас = " + wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
