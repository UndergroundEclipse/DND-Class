public class Character {
    private int Strength, Dexterity, Constituion, Intelligence, Wisdom, Charisma;
    private int hitPoints;
    private int AC;
    private String characterName;
    private Race Race;

    public Character(int strength, int dexterity, int constituion,
                     int intelligence, int wisdom, int charisma, int hitPoints, int AC, String characterName) {
        Strength = strength;
        Dexterity = dexterity;
        Constituion = constituion;
        Intelligence = intelligence;
        Wisdom = wisdom;
        Charisma = charisma;
        this.hitPoints = hitPoints;
        this.AC = AC;
        this.characterName = characterName;
    }



    public int getHitPoints() {
        return hitPoints;
    }

    public int getAC() {
        return AC;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getStrength() {
        return Strength;
    }

    public int getDexterity() {
        return Dexterity;
    }

    public int getConstituion() {
        return Constituion;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public int getCharisma() {
        return Charisma;
    }
}





