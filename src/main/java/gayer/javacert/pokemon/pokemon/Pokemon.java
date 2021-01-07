package gayer.javacert.pokemon.pokemon;

public class Pokemon extends Move {

    private int HP;
    private int level;
    private int power;
    private Enum Type1;
    private Enum Type2;
    private int Attack;
    private int Defense;
    //move 1
    //move 2
    //move 3
    //move 4

    private String gender;

    public Pokemon(int HP, int level, Enum Type1, Enum Type2, String gender, int power) {
        this.setHP(HP);
        this.setLevel(level);
        this.setType1(Type1);
        this.setType2(Type2);
        this.setGender(gender);
        this.setPower(power);


    }

    public String getType() {
        //if type1 = type2, return type1 for single word
        return "GET TYPE WIP";
    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public Enum getType1() {
        return Type1;
    }

    public void setType1(Enum type1) {
        Type1 = type1;
    }

    public Enum getType2() {
        return Type2;
    }

    public void setType2(Enum type2) {
        Type2 = type2;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
