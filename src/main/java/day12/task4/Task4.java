package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> bandACrew = new ArrayList<>();
        bandACrew.add("MICHAEL JORDAN");
        bandACrew.add("PELE");
        MusicBand bandA = new MusicBand("Band A", 2003, bandACrew);
        
        List<String> bandBCrew = new ArrayList<>();
        bandBCrew.add("MISHA PAVLOV");
        MusicBand bandB = new MusicBand("BAND B", 2010, bandBCrew);
        
        bandA.printMembers();
        System.out.println(bandA);
        System.out.println(bandA.getMembers());
        System.out.println();
        bandB.printMembers();
        System.out.println(bandB);
        System.out.println(bandB.getMembers());
        System.out.println();
        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers();
        bandB.printMembers();

    }
}
