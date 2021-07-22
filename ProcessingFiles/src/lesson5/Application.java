package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

    public static void main(String[] args) {
//hashmap implements the map interface which have key and value
        //hashmap in unordered whereas linkedhashmap is ordered
        //LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
        //HashMap<String, String> dictionary = new HashMap<String, String>();

        //Treemap sort keys in natural order like alphabetically for string
        TreeMap<String, String> dictionary = new TreeMap<String, String>();


        dictionary.put("Brilliant", "exceptionally clever or talented");
        dictionary.put("Joy", "a feeling of great pleasure and happiness");
        dictionary.put("Confidence", "the state of feeling certain about the truth of something.");

//        for (String word: dictionary.keySet()){
//            //print values
//            System.out.println(dictionary.get(word));
//            //print keys
//            //System.out.println(word);
//
//        }

        //loop over key and value both
        for(Map.Entry<String,String> entry:dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
