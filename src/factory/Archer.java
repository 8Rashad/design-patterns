package factory;

public class Archer implements Character{
    @Override
    public void useAbility() {
        System.out.println("Archer: Shoot arrows!");
    }
}
