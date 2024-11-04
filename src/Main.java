import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human father =new Human();
        Human mother =new Human();
        Family family = new Family(father, mother);
        Human child1 = new Human("Ali", "Aliyev", 12);
        Human child2 = new Human("Rza", "Rzayev", 12);
              family.addChild(child1);
              family.addChild(child2);

            family.removeChild(child1);
        System.out.println(Arrays.toString(family.getChildren()));
        System.out.println(family.familyCount());
        System.out.println(Family.countFamilies);

        Pet pet1 = new Pet("mesi", "pisik",2,75,new String[]{"eating","Sleeping"});
        Pet pet2 = new Pet("mesi", "pisik",2,75,new String[]{"sjsjs", "eating"});
        System.out.println(pet1.hashCode()==pet2.hashCode());
        System.out.println(pet1.equals(pet2));
    }
}