import java.util.ArrayList;

public class Skoczek implements Comparable<Skoczek> {
    private String _name;
    private int _points;
    private int _mostRecentJumpLength;
    private ArrayList<Integer> _jumpsLength;
    private ArrayList<Integer> _judgesVotes;

    public Skoczek(String name){
        _name = name;
        _points = 0;
        _mostRecentJumpLength = 0;
        _jumpsLength = new ArrayList<Integer>();
    }

    public String get_name() {
        return _name;
    }

    public ArrayList<Integer> get_judgesVotes() {
        return _judgesVotes;
    }

    public int get_mostRecentJumpLength() {
        return _mostRecentJumpLength;
    }

    public void set_judgesVotes(ArrayList<Integer> _judgesVotes) {
        this._judgesVotes = _judgesVotes;
    }

    public void set_mostRecentJumpLength(int mostRecentJumpLength) {
        this._mostRecentJumpLength = mostRecentJumpLength;
    }

    public void add_points(int points) {
        this._points += points;
    }

    public void addJumpLength(int length){
        _jumpsLength.add(length);
    }

    public void printJumpLengths(){
        System.out.print("jump lengths: ");
        int i = 0;
        for(int jump: _jumpsLength){
            if(i < _jumpsLength.size() - 1)
                System.out.print(jump + " m, ");
            else
                System.out.print(jump + " m");
            i++;
        }
        System.out.print("\n");
    }

    @Override
    public int compareTo(Skoczek o) {
        return o._points - _points;
    }

    @Override
    public String toString() {
        return _name + " (" + _points + " points)";
    }
}
