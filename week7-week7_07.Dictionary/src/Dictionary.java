import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String,String> _dictionary;

    public Dictionary(){
        _dictionary = new HashMap<String, String>();
    }

    public String translate(String word){
        if(_dictionary.containsKey(word)){
            return _dictionary.get(word);
        }
        return null;
    }

    public void add(String word, String translation){
        if(!_dictionary.containsKey(word))
            _dictionary.put(word,translation);
    }

    public int amountOfWords(){
        return _dictionary.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> toReturn = new ArrayList<String>();
        for(String key: _dictionary.keySet())
            toReturn.add(key + " = " + _dictionary.get(key));
        return toReturn;
    }
}
