package factory;

public class WarriorFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}
