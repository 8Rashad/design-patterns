package factory;

public class MageFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Mage();
    }
}
