public class Warrior extends CharacterMain {
    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, int run, int attack, int heal, int decHealth, int incStamina, int decStamina) {
        super(name, strength, health, stamina, speed, attackPower, run, attack, heal, decHealth, incStamina, decStamina);
    }

    @Override
    public void specialAttack() {
        System.out.println(this.getName()+ ", the Warrior stabbed you with a sword.");

    }
}
