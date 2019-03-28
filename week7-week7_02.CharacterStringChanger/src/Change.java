public class Change {
    private char _fromCharacter;
    private char _toCharacter;

    public Change(char fromCharacter, char toCharacter){
        _fromCharacter = fromCharacter;
        _toCharacter = toCharacter;
    }

    public String change(String characterString){
        String from = "" + _fromCharacter;
        String to = "" + _toCharacter;
        return characterString.replaceAll(from,to);
    }
}
