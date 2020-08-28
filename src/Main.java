/*1.ask for user input
  1.read user input
  2.stop reading user input after 10 entries
  3.store user inputs into an array
  4.print out the array with the original order
  5.sort the array in an alphabetically order
  6.print out the array in an alphabetically order.
  7.sort the array in a reverse alphabetically order.
  8.print out hte array in a reverse alphabetically order.
  9.print the array out with all caps
  10.find all the words start with a vowel
  11.store these words in an array
  12.print out the array with words start with vowels
  13.place all the vowels with 'a' in the array
  14.print the array with all the vowels replaced with 'a'
  15. finished
  */
/*
Author: Hsien Shen
Date: Aug 28 2020
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 words: ");
        String[] words= new String[10]; //the array size is 10
        String temp;
        //read all 10 words
        for (int i =0 ; i <10; i++)
        {
            words[i] = input.nextLine();
        }
        //print the array out
        System.out.println("\nOriginal Order: ");
        for(int i=0; i< words.length;i++)
        {
            System.out.print(words[i] + " ");
        }
        //sort the array in an alphabetically order
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
        //print out the array
        for(int i=0; i< words.length;i++)
        {
            System.out.print(words[i] + " ");
        }
        //sort the array in a revere order
        System.out.println("\n\nReverse Alphabetical Order: ");
        for (int j = 0; j < words.length; j++) {
            for (int i = j + 1; i < words.length; i++) {
                if (words[i].compareTo(words[j]) > 0) {
                    temp = words[j];
                    words[j] = words[i];
                    words[i] = temp;
                }
            }
        }
        //print out the array
        for(int i=0; i< words.length;i++)
        {
            System.out.print(words[i] + " ");
        }
        //turn all the words into all caps
        System.out.println("\n\nUpper case array: ");
        for(int i=0; i< words.length;i++)
        {
            System.out.print(words[i].toUpperCase() + " ");
        }

        ArrayList vowelWords = new ArrayList(); //use arraylist to store the words, since the size is uncertain
        System.out.println("\n\nWords start with a vowel: ");
        for(int i=0; i< words.length;i++)
        {
            //if the word starts with an vowel, store it in the arraylist
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
        // print all the words out
        System.out.println(vowelWords.toString().replace('[',' ').replace(']',' ').replace(',',' '));

        //use a new var to store the changed word
        String newWord = " ";
        System.out.println("\nWords with changed vowels:");
        for(int i=0; i< words.length;i++)
        {
            //replace all the vowels with 'a'
            newWord = words[i].replace('e','a')
                .replace('i','a').replace('o','a')
                .replace('u','a');
            words[i] = newWord;
            System.out.print(words[i] + " ");

        }




    }


}

