package day31_methodOverriding.animal_methodOverriding;

public class Lion extends Animal {

    private boolean isAfricanLion;


    public Lion(String name, String breed, String size, String color, char gender, int age, boolean isAfricanLion) {
        super(name, breed, size, color, gender, age);
        setAfricanLion(isAfricanLion);
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    public void roar() {
        System.out.println(getName() + " is  roaring");
    }

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    @Override
    public String toString() {// we have other way for this also
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", african lion=" + isAfricanLion +
                '}';
    }
}
