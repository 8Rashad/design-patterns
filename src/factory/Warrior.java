package factory;

public class Warrior implements Character{
    @Override
    public void useAbility() {
        System.out.println("Warrior: Attack with a sword!");
    }
}
