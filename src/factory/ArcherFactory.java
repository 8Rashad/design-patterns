package factory;

public class ArcherFactory implements CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Mage();
    }
}
