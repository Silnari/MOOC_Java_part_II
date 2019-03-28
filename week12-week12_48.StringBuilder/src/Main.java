
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        String str = "{\n ";

        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 1; i <= t.length; i++) {
            stringBuilder.append(t[i - 1]);
            if(i != t.length){
                stringBuilder.append(", ");
                if (i % 4 == 0) {
                    stringBuilder.append("\n ");
                }
            }
        }

        str = stringBuilder.toString();

        if(str.endsWith("\n"))
            return str + "}";
        return str + "\n}";
    }
}
