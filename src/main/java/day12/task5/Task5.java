package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("MICHAEL JORDAN", 55));
        members1.add(new MusicArtist("Georger Michael", 36));
        members1.add(new MusicArtist("SASHA GUITARIST", 40));
        System.out.println("Команда артистов: " + members1);
        System.out.println("==========");
        
        MusicBand group1 = new MusicBand("Group1", 2002, members1);
        System.out.print("PrintMembers of Group1: ");
        group1.printMembers();
        System.out.println("Info about Group1: " + group1);
        System.out.println("===========");
        
        List<MusicArtist> members2 = new ArrayList<>();
        MusicBand group2 = new MusicBand("Group2", 1990, members2);
        group2.printMembers();
        MusicBand.transferMembers(group1, group2);
        group1.printMembers();
        group2.printMembers();
      
        
    }
}
