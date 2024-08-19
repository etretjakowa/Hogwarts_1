public class Ravenclaw extends Hogwarts{

    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Ravenclaw(String name, int powerОfMagic, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, powerОfMagic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return " студент Когтеврана" +
                "ум на" + mind +
                ", мудрость на" + wisdom +
                ", остроумие на" + wit +
                ", творчество на" + creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void compareStudentsRavenclaw (Ravenclaw student){
        if (this.getMind() + this.getWisdom() + this.getWit() + this.getCreativity() >
                student.getMind() + student.getWisdom() + student.getWit() + student. getCreativity())
        {
            System.out.println("Когтевранец " + this.getName() + " силнее, чем " + student.getName());

        } else if (this.getMind() < student.getMind()){

            System.out.println("Когтевранец " + this.getName() + " умнее, чем " + student.getName());

        } else {
            System.out.println("студент " + this.getName() + " равносилен " + student.getName());
        }
    }
}
