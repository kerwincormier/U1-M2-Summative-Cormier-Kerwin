public class Main {
    public static void main(String[] args) {
        CharacterMain hankTheFarmer = new Farmer("Hank", 75, 100, 75, 10, 1, 10, 15, 11, 5, 7, 10);
        hankTheFarmer.specialAttack();
        CharacterMain barneyTheConstable = new Constable("Barney", 60, 100, 60, 20, 5, 12, 20, 11, 8, 7, 8);
        barneyTheConstable.specialAttack();
        CharacterMain chuckTheWarrior = new Warrior("Chuck", 75, 100, 100, 50, 10, 15, 20, 20, 10, 10, 5);
        chuckTheWarrior.specialAttack();


    }
}
