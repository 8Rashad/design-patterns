package factory;

import static factory.Army.*;

public class Main {
    public static void main(String[] args) {

        var characterFactory = createCharacterByAbility(WARRIOR);
        var character = characterFactory.createCharacter();
        character.useAbility();

    }

    private static CharacterFactory createCharacterByAbility(Army army){
        return switch (army){
            case WARRIOR -> new WarriorFactory();
            case MAGE -> new MageFactory();
            case ARCHER -> new ArcherFactory();
        };
    }
}
