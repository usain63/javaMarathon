package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Integer> dushiWords = new HashMap<>();

        File file = new File("/Users/18882337/IdeaProjects/JavaMarathon2021/src/main/resources/dushi.txt");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("[.,:;()?!\"\\s–]+");
        
        while (scanner.hasNext()) {
            String word = scanner.next();
            
            if (dushiWords.containsKey(word))
                dushiWords.put(word, dushiWords.get(word) + 1);
            else 
                dushiWords.put(word, 1);
        }
        scanner.close();
        System.out.println("Количество Чичиковых в книге: " + dushiWords.get("Чичиков"));
        
        Map<String, Integer> mostFrequent = new HashMap<>();
        
        for (int i = 0; i < 100; i++){
            int maxValue = Collections.max(dushiWords.values());
            for (Iterator<Map.Entry<String, Integer>> entryIterator = dushiWords.entrySet().iterator(); entryIterator.hasNext();) {
                Map.Entry<String, Integer> entry = entryIterator.next();
                if (entry.getValue() == maxValue){
                    mostFrequent.put(entry.getKey(), entry.getValue());
                    entryIterator.remove();
                }
            }
        }
        System.out.println("100 наиболее частых слов: ");
        for (Map.Entry<String, Integer> entry:mostFrequent.entrySet()) {
            System.out.print(entry.getKey() + ", ");
        }
    }
}
