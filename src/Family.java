import java.util.Arrays;
import java.util.Objects;

public class Family extends Human {
    private Human mother;
    private Human father;
    private Human[] children = new Human[10];
    private Pet pet;
    int pointer = 0;



    public Family(){

    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;

    }



    public Human[] addChild(Human child) {
        if (this.mother != null && this.father != null) {
            children[pointer] = child;
            pointer++;
        }
        return children;
    }

    public int familyCount(){
        return 2+pointer;


    }


    public boolean removeChild(Human child) {
        for (int i = 0; i < pointer; i++) {
            if (child.equals(children[i])) {
                while (children[i] != null) {
                    children[i] = children[i + 1];
                    i++;
                }
                children[i] = null;
                pointer--;
                return true;
            }
        }
        return false;
    }

    public int countFamilies() {
        return 0;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
