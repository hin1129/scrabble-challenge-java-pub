import java.util.HashMap;
import static javax.swing.UIManager.put;

public class Scrabble {
    public String word;
    public char[] splitWord;

    // hashmap stores letters/scores as key/value pairs
    HashMap<Character, Integer> letterScorePair = new HashMap<Character, Integer>();
    {{
        letterScorePair.put('A', 1);
        letterScorePair.put('E', 1);
        letterScorePair.put('I', 1);
        letterScorePair.put('O', 1);
        letterScorePair.put('U', 1);
        letterScorePair.put('L', 1);
        letterScorePair.put('N', 1);
        letterScorePair.put('R', 1);
        letterScorePair.put('S', 1);
        letterScorePair.put('T', 1);
        letterScorePair.put('D', 2);
        letterScorePair.put('G', 2);
        letterScorePair.put('B', 3);
        letterScorePair.put('C', 3);
        letterScorePair.put('M', 3);
        letterScorePair.put('P', 3);
        letterScorePair.put('F', 4);
        letterScorePair.put('H', 4);
        letterScorePair.put('V', 4);
        letterScorePair.put('W', 4);
        letterScorePair.put('Y', 4);
        letterScorePair.put('K', 5);
        letterScorePair.put('J', 8);
        letterScorePair.put('X', 8);
        letterScorePair.put('Q', 10);
        letterScorePair.put('Z', 10);
        letterScorePair.put(' ', 0);
        letterScorePair.put(null, 0);
    }}

    // constructor
    public Scrabble(String word) { this.word = word; }

    //method
    public int score(){
//        System.out.println("hashmap"+letterScorePair);
        int totalPoints = 0;

        if (word == null) {totalPoints=0;}
        else {
            splitWord = word.toUpperCase().toCharArray();
//            System.out.println("char array:"+splitWord);

            // get each character from char-array
            for (char character: splitWord) {
                System.out.println("char array element:"+character);

                // use character as key in hashmap to get value
                if(letterScorePair.containsKey(character)){totalPoints = totalPoints + letterScorePair.get(character);}
                else {
                    System.out.println("is key in hashmap:"+letterScorePair.containsKey(character));
//                    System.out.println("value for key in hashmap:"+letterScorePair.get(character));
                }
            }
        }
        // final points
        System.out.println("total points:"+totalPoints);
        return totalPoints;
    }
}
