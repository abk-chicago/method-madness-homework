/*

Method Madness: Homework Part One

To test each one, you'll have to comment out the other problems

*/







/* <--------------- start of comment-out for problem 1 -------------------------------------------

// _____________________________________________________________
// Problem Number 1 ***********
// _____________________________________________________________


import java.util.*;

public class Madness {

    public static void main(String[] args) {

    System.out.println(maxOfTwoNumbers());
    }

    // method below will compare and print the larger of two numbers
    // source: https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html#max(int,%20int)


    public static int maxOfTwoNumbers() {
        System.out.println("Let's compare two numbers!");
        System.out.println("Please enter two whole numbers to compare. Please press enter in between.");
        Scanner userInput = new Scanner(System.in);
        int n1 = userInput.nextInt();
        int n2 = userInput.nextInt();
        String errorMessage = "These numbers are equal!";
        String messageAnswer = "The larger of the two numbers you entered is...";

        if (n1 == n2) {
            System.out.println(errorMessage);
        } else {
            System.out.println(messageAnswer);
        }
        return((n1 > n2 ? n1 : n2));
    }

}
------------------------------------------- end of comment-out for problem 1 ------------>  */


/*  <--------------- start of comment-out for problem 2 -------------------------------------------



    // _____________________________________________________________
    // Problem Number 2 ***********
    // _____________________________________________________________

    // documentation from: http://www.programmingsimplified.com/java/source-code/java-program-largest-of-three-numbers


import java.util.*;

    public class Madness {

        public static int maxOfThree() {
            System.out.println("I'll give you the largest of three numbers.");
            System.out.println("Please enter three whole numbers to compare. Please press enter in between.");
            Scanner userInput = new Scanner(System.in);
            int n1 = userInput.nextInt();
            int n2 = userInput.nextInt();
            int n3 = userInput.nextInt();
            int result = 0;
            String errorMessage = "... Hey! These numbers are all equal!  You get a big, fat Zero for trying to trick me!";
            String messageAnswer = "The largest of the three numbers you entered:";

            if (n1 > n2 && n1 > n3) {
                result = n1;
                System.out.println(messageAnswer);
                return result;

            } else if
                    (n2 > n1 && n2 > n3) {
                result = n2;
                System.out.println(messageAnswer);
                return result;

            } else if
                    (n3 > n1 && n3 > n2) {
                result = n3;
                System.out.println(messageAnswer);
                return result;

            } else if((n1 == n2) && (n2 == n3) && (n1 == n3)) {
                System.out.println(errorMessage);
            }
            return result;
        }
        public static void main(String[] args) {
            System.out.println(maxOfThree());
        }
    }



 ------------------------------------------- end of comment-out for problem 2 ------------>  */





/* <--------------- start of comment-out for problem 3 -------------------------------------------


    // _____________________________________________________________
    // Problem Number 3 ***********
    // _____________________________________________________________

   // used info from...  http://stackoverflow.com/questions/19160921/how-do-i-check-if-a-char-is-a-vowel
   // & http://stackoverflow.com/questions/17764680/check-if-a-character-is-a-vowel-or-consonant
   // & http://stackoverflow.com/questions/13942701/take-a-char-input-from-the-scanner

import java.util.*;

public class Madness {

    public static String isCharacterAVowel() {

        Scanner letterInput = new Scanner(System.in);
        System.out.println("To see if it is a vowel or not, please enter one (single) letter from the English alphabet.");
        String abc = letterInput.nextLine(); // <-- had a lot of trouble with this
        String isItaVowel;

        switch (abc) {
            case "a":
                isItaVowel = "Yes, it is a vowel";
                break;
            case "e":
                isItaVowel = "Yes, it is a vowel";
                break;
            case "i":
                isItaVowel = "Yes, it is a vowel";
                break;
            case "o":
                isItaVowel = "Yes, it is a vowel";
                break;
            case "u":
                isItaVowel = "Yes, it is a vowel";
                break;
            case "A":
                isItaVowel = "Yes, it is a vowel";
                break;
            case "E":
                isItaVowel = "Yes, it is a vowel";
                break;
            case "I":
                isItaVowel = "Yes, it is a vowel";
                break;
            case "O":
                isItaVowel = "Yes, it is a vowel";
                break;
            case "U":
                isItaVowel = "Yes, it is a vowel";
                break;
            default:
                isItaVowel = "Not a vowel.";
                break;
        }
        return isItaVowel;
    }
    public static void main(String[] args) {
        System.out.println(isCharacterAVowel());
        }
    }



  ------------------------------------------- end of comment-out for problem 3 ------------> */




/* <--------------- start of comment-out for problem 4 -------------------------------------------






    // _____________________________________________________________
    // Problem Number 4 ***********
    // _____________________________________________________________

// resource used: http://stackoverflow.com/questions/2330942/java-variable-number-or-arguments-for-a-method
// & http://web.eecs.utk.edu/~bvz/cs365/examples/datacheck.html

import java.util.*;
import java.io.*;

public class Madness {

    public static void main(String[] args) {
        String initialMsg = ("Gimme some words, please."); // I prefer to prompt the user rather than hardcode
        System.out.println(initialMsg);
        Scanner userInput = new Scanner(System.in);
        String newArgs = userInput.nextLine();
        argCounter();
    }
        public static void argCounter(String... newArgs) {
            int theNumber = newArgs.length;
            System.out.println("Number of words entered: " + theNumber);
        }

}

  ------------------------------------------- end of comment-out for problem 4 ------------>  */




/*     #8 - in class with Spoorthi ---------------------------------------------------


public class Madness {   //<-- in order to keep in same file, I switched out "Car" for "Madness"

    int mTopSpeed;
    int mNumDoors;

    Madness() {   //  <--- default (no params) constructor, must be same name as class; other kind is "parameterized"

    }

    Madness(int mTopSpeed, int mNumDoors) {
        System.out.println("The top speed is: " + mTopSpeed + " and the num of doors is: " + mNumDoors);
    }

    public static void main(String[] args) {
        Madness bmw = new Madness(150,4);
        Madness ferrari = new Madness(200,6);
        Madness bmw3 = new Madness();
    }
}


  ------------------------------------------- end of comment-out for problem 8 ------------>  */

/*  #2 in class with Spoorthi ______________________ //<-- in order to keep in same file and have it work here, will have to switch out "Car" for "Madness"

public class maxOfThree {

    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a > b && a > c) {
            System.out.println(a + "is the largest number");
        } else if (b > a && b > c) {
            System.out.println(b + "is the largest number");
        } else (c > a && c > b) {
            System.out.println(c + "is the largest number");
        }
    }
}


------------------------------------------- end of comment-out for problem 2 ------------>  */




//  #5 in class with Spoorthi ______________________
// ****** in order to keep in same file and have it work here, will have to switch out "ReverseString" for "Madness"


public class ReverseString {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String name = "spoorthi";
        String reverse = null;
        int n = name.length();
        char[] reverse = new char[n];   //<--- character array named "reverse"

        for (int counter = n - 1; counter >= 0; counter--) {
            //"counter" is a name given to the integer keeping track of the position of the name string
            int indexForReverse = 0;
            reverse[indexForReverse] = name.charAt(counter);
            indexForReverse++;
        }
        for (int counterTwo = 0; counterTwo < n; counterTwo++) {
            System.out.println(reverse[counterTwo]);
        }
    }
}




// ------------------------------------------- end of comment-out for problem 2 ------------>  */