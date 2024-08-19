public class Gryffindor extends Hogwarts{
    private final int nobility;
    private final int honor;
    private final int bravery;

    public Gryffindor(String name, int powerОfMagic, int transgression, int nobility, int honor, int bravery) {
        super(name, powerОfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "студент Гриффиндора, " +
                "благороден на " + nobility +
                ", честь на  " + honor +
                ", храбрость на " + bravery;
    }

    public void compareStudentsGryffindor(Gryffindor student){
        if (this.getNobility() + this.getHonor() + this.getBravery() >
                student.getNobility() + student.getHonor() + student. getBravery())
        {
            System.out.println("Гриффендорец " + this.getName() + "силнее, чем " + student.getName());

        } else if (this.getNobility() + this.getHonor() + this.getBravery() <
                student.getNobility() + student.getHonor() + student. getBravery()){

            System.out.println("Гриффендорец " + this.getName() + " силнее, чем " + student.getName());

        } else {
            System.out.println("студент " + this.getName() + " равносилен " + student.getName());
        }
    }

}
