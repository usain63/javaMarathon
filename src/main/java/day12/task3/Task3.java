package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bandsAfter200 = new ArrayList<>();
        List<MusicBand> musicArr = Arrays.asList(new MusicBand("LALALAND", 2000), new MusicBand("ACDC", 1973),
            new MusicBand("GUNSNROSES", 1985), new MusicBand("ГУБЫ", 2010), new MusicBand("ALLO", 2005),
            new MusicBand("KORNI", 2002), new MusicBand("BLACK SABBATH", 1968), new MusicBand("JUSTABAND", 2003));
        
        System.out.println("Исходный список " + musicArr);
        System.out.println();
        
        Collections.shuffle(musicArr);
        System.out.println("Перемешали список " + musicArr);
        System.out.println();
        
        bandsAfter200 = groupsAfter2000(musicArr);
        System.out.println("Просеяли список " + bandsAfter200);
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> list){
        List<MusicBand> sortedList = new ArrayList<>();
        for (MusicBand band: list) {
            if (band.getYear() >= 2000)
                sortedList.add(band);
        }
        return sortedList;
    }
}
