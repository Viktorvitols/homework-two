import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String ryabaTheHen = "An Old Man and Old Woman lived in a small village. They had got a hen – Ryaba. One day Ryaba laid an egg. Old Man and Old Woman looked at it and couldn’t believe their eyes – the egg is golden! It was a real miracle for them. The Owners put the egg in the middle of the table to have a good look at it. The egg was glittering in the sun so that they couldn’t take their eyes off it! They admired this wonderful egg and wanted to taste it. The Old Man took the egg to break it. However hard he tries to break it – he could’t. Then the Old Woman wanted to try. However hard she tried to break it – she could’t. At that time the Mouse jumped out of the corner and touched the golden egg with her tail. The egg rolled, fell and broken to pieces. The Old Man and Old Woman were so upset that they began to cry. “Don’t cry Old Man and Old Woman’ said the Hen Ryaba. “I’ll lay you new egg – ordinary egg, not golden.";
        String[] splitRyaba = ryabaTheHen.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        System.out.println("There are " + splitRyaba.length + " words in the text.");

        HashMap<String, Integer> uniqueWords = new HashMap<>();
        for (int i = 0; i < splitRyaba.length; i++) {
            String word = splitRyaba[i];
            Integer count = uniqueWords.get(word);
            if (count == null) {
                uniqueWords.put(word, 1);
            } else {
                uniqueWords.put(word, count + 1);
            }
        }

        System.out.println("There are " + uniqueWords.size() + " UNIQUE words in the text");
        System.out.println("The list of unique words and word count:");

        for (Map.Entry<String, Integer> entry : uniqueWords.entrySet()) {
            System.out.println("|" + entry.getKey() + "|" + entry.getValue() + "|");
        }
    }
}