
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    private static void printSmiles(int n){
        for(int i = 0; i < n; i++)
            System.out.print(":)");
    }

    private static void printWithSmileys(String characterString){
        int len = characterString.length();
        double howManySmiles;
        if(len%2 == 0){
            howManySmiles = (double)len/2.0 + 3.0;
            printSmiles((int)howManySmiles);
            System.out.print("\n:) " + characterString + " :)\n");
            printSmiles((int)howManySmiles);
            System.out.print("\n");
        }
        else{
            howManySmiles = (double)len/2.0 + 3.5;
            printSmiles((int)howManySmiles);
            System.out.print("\n:) " + characterString + "  :)\n");
            printSmiles((int)howManySmiles);
            System.out.print("\n");
        }
    }
}

/*
:):):):):):):)
:) cdssssss :)

2 - 4
4 - 5
6 - 6
8 - 7

1 - 4
3 - 5
5 - 6
7 - 7
 */