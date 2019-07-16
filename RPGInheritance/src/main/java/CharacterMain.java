public abstract class CharacterMain {


    //properties
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;

    //abilities
    private int run;
    private int attack;
    private int heal;
    private int decHealth;
    private int incStamina;
    private int decStamina;


    public CharacterMain(String name, int strength, int health, int stamina, int speed, int attackPower, int run, int attack, int heal, int decHealth, int incStamina, int decStamina){
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.run = run;
        this.attack = attack;
        this.heal = heal;
        this.decHealth = decHealth;
        this.incStamina = incStamina;
        this.decStamina = decStamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getDecHealth() {
        return decHealth;
    }

    public void setDecHealth(int decHealth) {
        this.decHealth = decHealth;
    }

    public int getIncStamina() {
        return incStamina;
    }

    public void setIncStamina(int incStamina) {
        this.incStamina = incStamina;
    }

    public int getDecStamina() {
        return decStamina;
    }

    public void setDecStamina(int decStamina) {
        this.decStamina = decStamina;
    }

    public abstract void specialAttack();
}