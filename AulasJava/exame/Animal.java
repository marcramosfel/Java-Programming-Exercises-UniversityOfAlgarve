package exame;

public abstract class Animal  {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public Animal(String name){
        this.name = name;
    }
    public abstract void speak();
}
