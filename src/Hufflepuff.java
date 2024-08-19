public class Hufflepuff extends Hogwarts{
    private final int hardworking;
    private final int loyalty;
    private final int honesty;

    public Hufflepuff(String name, int powerОfMagic, int transgression, int hardworking, int loyalty, int honesty) {
        super(name, powerОfMagic, transgression);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "студент Пуффендуя, " +
                "трудолюбив на " + hardworking +
                ", верен на " + loyalty +
                ", честны на" + honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void compareStudentsHufflepuff(Hufflepuff student){
        if (this.getHardworking() + this.getLoyalty() + this.getHonesty() >
                student.getHardworking() + student.getLoyalty() + student. getHonesty())
        {
            System.out.println("Пуффендуец " + this.getName() + " силнее, чем " + student.getName());

        } else if (this.getHardworking() < student.getHardworking()){

            System.out.println("Пуффендуец " + this.getName() + " трудолюбивее, чем " + student.getName());

        } else {
            System.out.println("студент " + this.getName() + " равносилен " + student.getName());
        }
    }

}
