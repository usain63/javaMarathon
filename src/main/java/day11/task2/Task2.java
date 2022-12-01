package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Paladin paladin = new Paladin();
        Magician mag = new Magician();
        Shaman shaman = new Shaman();
        
        warrior.physicalAttack(paladin);
        System.out.println(paladin);
        paladin.physicalAttack(mag);
        System.out.println(mag);
        shaman.healTeammate(mag);
        System.out.println(mag);
        mag.magicalAttack(paladin);
        System.out.println(paladin);
        shaman.physicalAttack(warrior);
        System.out.println(warrior);
        paladin.healHimself();
        System.out.println(paladin);
        System.out.println();
        for (int i = 0; i < 5; i++){
            warrior.physicalAttack(mag);
            System.out.println(mag);
        }
            
        
    }
}
