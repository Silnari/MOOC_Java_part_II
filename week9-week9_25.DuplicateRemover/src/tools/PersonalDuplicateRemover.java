package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private int numberOfDuplicates;
    private Set<String> list;

    public PersonalDuplicateRemover(){
        numberOfDuplicates = 0;
        list = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if(list.contains(characterString))
            numberOfDuplicates++;
        else
            list.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return numberOfDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return list;
    }

    @Override
    public void empty() {
        numberOfDuplicates = 0;
        list.clear();
    }
}
