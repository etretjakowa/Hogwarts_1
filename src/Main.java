public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 89, 7, 85, 41, 54);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона ", 91, 15, 1, 10, 5);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 26, 45, 12, 9, 84);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 45, 44, 5, 8, 2);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 45, 14, 5, 8, 2);
        Hufflepuff justinFinchFletchley  = new Hufflepuff("Джастин Финч-Флетчли", 95, 44, 5, 8, 2);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 55, 32, 8, 6, 8, 47);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 78, 18, 78, 6, 8, 47);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби ", 22, 9, 8, 6, 8, 47);


        Slytherin dracoMalfoy = new Slytherin("Драко Малфой",10,1,0,9,5,46,99);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю",11,2,57,9,5,46,99);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл",10,1,58,9,5,46,99);

        hermioneGranger.compareStudents(ronWeasley);

        System.out.println("Рон Уизли - " + ronWeasley);
        dracoMalfoy.compareStudentsSlytherin(grahamMontague);
        System.out.println();
        harryPotter.compareStudents(gregoryGoyle);
        System.out.println("gregoryGoyle = " + gregoryGoyle);
        padmaPatil.compareStudentsRavenclaw(zhouChang);

    }
}