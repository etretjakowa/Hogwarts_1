public class Slytherin extends Hogwarts{
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;

    public Slytherin(String name, int powerОfMagic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerОfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "студент Слизерина," +
                "хитрость на " + cunning +
                ", решительность на " + determination +
                ", амбициозность на " + ambition +
                ", находчивость на " + resourcefulness +
                ", жажда власти на " + lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void compareStudentsSlytherin(Slytherin student){
        if (this.getCunning() + this.getDetermination() +this.getAmbition() + this.getResourcefulness() + this.getLustForPower() >
                student.getCunning() + student.getDetermination() + student. getAmbition()+ student.getResourcefulness() + student.getLustForPower())
        {
            System.out.println("Слизеринец " + this.getName() + " силнее, чем " + student.getName());

        } else if (this.getCunning() + this.getDetermination() +this.getAmbition() + this.getResourcefulness() + this.getLustForPower()<
                student.getCunning() + student.getDetermination() + student. getAmbition()+ student.getResourcefulness() + student.getLustForPower()){

            System.out.println("Слизеринец " + this.getName() + " силнее, чем " + student.getName());

        } else {
            System.out.println("студент " + this.getName() + " равносилен " + student.getName());
        }
    }
}
