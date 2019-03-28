package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {
    private Map<String, String> dictionary;
    private String file;


    public MindfulDictionary(){
        dictionary = new HashMap<String, String>();
    }

    public MindfulDictionary(String file){
        this.file = file;
        dictionary = new HashMap<String, String>();
    }

    public boolean load(){
        try{
            File file = new File(this.file);
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String parts[] = line.split(":");
                dictionary.put(parts[0],parts[1]);
            }

            fileReader.close();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public boolean save(){
        try{
            FileWriter fileWriter = new FileWriter(this.file);
            for(String key: dictionary.keySet()){
                fileWriter.write(key + ":" + dictionary.get(key) + "\n");
            }

            fileWriter.close();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public void add(String word, String translation) {
        if(!dictionary.containsKey(word)){
            dictionary.put(word,translation);
        }
    }

    public String translate(String word){
        if(dictionary.containsKey(word))
            return dictionary.get(word);
        if(dictionary.containsValue(word)){
            for(String key: dictionary.keySet()){
                if(dictionary.get(key).equals(word))
                    return key;
            }
        }
        return null;
    }

    public void remove(String word){
        if(dictionary.containsKey(word)) {
            dictionary.remove(word);
        }

        if (dictionary.containsValue(word)) {
            String keyToDelete = "";
            for (String key : dictionary.keySet()) {
                if (dictionary.get(key).equals(word))
                    keyToDelete = key;
            }
        if(!keyToDelete.equals(""))
            dictionary.remove(keyToDelete);
        }
    }
}
