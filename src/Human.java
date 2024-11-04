import java.util.Arrays;
import java.util.Objects;

public class Human{
    private String name;
    private String surname;
    private int age;
    private int iQ;
    private String[][] schedule;

    public Human(){

    }
    public Human(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getiQ() {
        return iQ;
    }

    public void setiQ(int iQ) {
        this.iQ = iQ;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
    @Override
    public String toString() {
        return "Human{" +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +
                ", iQ=" + getiQ() +
                ", schedule=" + Arrays.toString(getSchedule()) +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && iQ == human.iQ &&
                Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.deepEquals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, iQ, Arrays.deepHashCode(schedule));
    }
}
