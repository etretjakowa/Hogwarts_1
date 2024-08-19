public class Hogwarts {

    private final String name;
    private final int powerОfMagic;
    private final int transgression;


    public Hogwarts(String name, int powerОfMagic, int transgression ) {
        this.name = name;
        this.powerОfMagic = powerОfMagic;
        this.transgression = transgression;

    }

    @Override
    public String toString() {
        return "Студент " + name +
                "обладает силой магии " + powerОfMagic +
                "трансгрессирует на расстояние " + transgression;
    }

    public String getName() {
        return name;
    }

    public int getPowerОfMagic() {
        return powerОfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void compareStudents(Hogwarts student){
        if (this.getPowerОfMagic()+this.getTransgression()>student.getPowerОfMagic()+student.getTransgression()){

            System.out.println("студент " + this.getName() + "обладает большей силой, чем " + student.getName());
        }
        else if (this.getPowerОfMagic()+this.getTransgression() == student.getPowerОfMagic()+student.getTransgression()){

            System.out.println("Сила студента " + this.getName() + "равна силе " + student.getName());

        } else {
            System.out.println("студент " + this.getName() + "обладает меньшей силой" + student.getName());
        }
    }
}
