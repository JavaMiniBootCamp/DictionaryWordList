import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 words: ");
        String[] words= new String[10];
        String temp;
        for (int i =0 ; i <10; i++)
        {
            words[i] = input.nextLine();
        }
        System.out.println("\nOriginal Order: ");
        for(int i=0; i< words.length;i++)
        {
            System.out.print(words[i] + " ");
        }

        System.out.println("\n\nAlphabetical Order: ");
        for (int j = 0; j < words.length; j++) {
            for (int i = j + 1; i < words.length; i++) {
                // comparing adjacent strings
                if (words[i].compareTo(words[j]) < 0) {
                    temp = words[j];
                    words[j] = words[i];
                    words[i] = temp;
                }
            }
        }
        for(int i=0; i< words.length;i++)
        {
            System.out.print(words[i] + " ");
        }
        System.out.println("\n\nReverse Alphabetical Order: ");
        for (int j = 0; j < words.length; j++) {
            for (int i = j + 1; i < words.length; i++) {
                // comparing adjacent strings
                if (words[i].compareTo(words[j]) > 0) {
                    temp = words[j];
                    words[j] = words[i];
                    words[i] = temp;
                }
            }
        }
        for(int i=0; i< words.length;i++)
        {
            System.out.print(words[i] + " ");
        }
        System.out.println("\n\nUpper case array: ");
        for(int i=0; i< words.length;i++)
        {
            System.out.print(words[i].toUpperCase() + " ");
        }

        ArrayList vowelWords = new ArrayList();
        System.out.println("\n\nWords start with a vowel: ");
        for(int i=0; i< words.length;i++)
        {
            switch (words[i].charAt(0))
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelWords.add(words[i]);



            }

        }
        System.out.println(vowelWords.toString().replace('[',' ').replace(']',' ').replace(',',' '));

        ArrayList changeVowel = new ArrayList();
        String newWord = " ";
        System.out.println("\nWords with changed vowels:");
        for(int i=0; i< words.length;i++)
        {
            newWord = words[i].replace('e','a')
                .replace('i','a').replace('o','a')
                .replace('u','a');
            changeVowel.add(newWord);

        }
        System.out.println(changeVowel.toString().replace('[',' ').replace(']',' ').replace(',',' '));




    }


}

