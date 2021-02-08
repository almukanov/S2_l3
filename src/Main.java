import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] words = new String[10];
        words[0]="Hello";
        words[1]="House";
        words[2]="Word";
        words[3]="Smile";
        words[4]="Smile";
        words[5]="House";
        words[6]="Mother";
        words[7]="Father";
        words[8]="Children";
        words[9]="Word";
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
     if(i< words.length-1) {
         if (words[i] == words[i + 1]) {

             continue;
         }
         System.out.println(words[i]);
     }

            }System.out.println(words[words.length -1]);


    }
}
