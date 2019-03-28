package dictionary;

import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, ArrayList<String>> dictionary;

    public PersonalMultipleEntryDictionary(){
        dictionary = new HashMap<String, ArrayList<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if(!dictionary.containsKey(word)){
            dictionary.put(word, new ArrayList<String>());
        }
        dictionary.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        if(dictionary.containsKey(word)){
            Set<String> set = new HashSet<String>();
            for(String str: dictionary.get(word))
                set.add(str);
            return set;
        }
        return null;
    }

    @Override
    public void remove(String word) {
        dictionary.remove(word);
    }
}
