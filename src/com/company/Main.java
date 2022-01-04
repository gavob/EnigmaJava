package com.company;

public class Main {

    public static void main(String[] args) {
        char[] alphabet  = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] rotorI    = new char[] {'E','K','M','F','L','G','D','Q','V','Z','N','T','O','W','Y','H','X','U','S','P','A','I','B','R','C','J'};
        char[] rotorII   = new char[] {'A','J','D','K','S','I','R','U','X','B','L','H','W','T','M','C','Q','G','Z','N','P','Y','F','V','O','E'};
        char[] rotorIII  = new char[] {'B','D','F','H','J','L','C','P','R','T','X','V','Z','N','Y','E','I','W','G','A','K','M','U','S','Q','O'};
        char[] reflector = new char[] {'Y','R','U','H','Q','S','L','D','P','X','N','G','O','K','M','I','E','B','F','Z','C','W','V','J','A','T'};

        int r1pos = 1;
        int r2pos = 2;
        int r3pos = 3;

        char letter = 'G';
        int index = 0;

        System.out.println(letter);
        System.out.println(index);

        index = getLetterIndex(alphabet, letter);
        letter = alphabet[index+r1pos]; //B

        System.out.println(letter);
        System.out.println(index);

        index = getLetterIndex(alphabet, letter);
        letter = rotorI[index]; //K

        System.out.println(letter);
        System.out.println(index);

        index = getLetterIndex(alphabet, letter);
        System.out.println(index);

        index+= r2pos - r1pos;
        letter = alphabet[index]; //L

        System.out.println(letter);
        System.out.println(index);

        letter = rotorII[index]; //H
        index = getLetterIndex(alphabet, letter);
        System.out.println(letter);
        System.out.println(index);

        index+= r2pos - r1pos;
        letter = alphabet[index]; //I

        System.out.println(letter);
        System.out.println(index);

        index = getLetterIndex(alphabet, letter);
        letter = rotorIII[index];
        index = getLetterIndex(alphabet, letter);

        System.out.println(letter);
        System.out.println(index);

        index+= 0 - r3pos;
        letter = alphabet[index];

        System.out.println(letter);
        System.out.println(index);

        letter = reflector[index];
        index = getLetterIndex(alphabet, letter);

        System.out.println(letter);
        System.out.println(index);

        index+= r3pos;
        letter = alphabet[index];

        System.out.println(letter);
        System.out.println(index);

        index = getLetterIndex(rotorIII, letter);
        letter = alphabet[index];

        System.out.println(letter);
        System.out.println(index);

        //index = getLetterIndex(rotorII, letter);

        index+= r2pos - r3pos;
        letter = alphabet[index];

        System.out.println(letter);
        System.out.println(index);

        index = getLetterIndex(rotorII, letter);
        letter = alphabet[index];

        System.out.println(letter);
        System.out.println(index);

        index+= r1pos - r2pos;
        letter = alphabet[index];

        System.out.println(letter);
        System.out.println(index);

        index = getLetterIndex(rotorI, letter);
        letter = alphabet[index];

        System.out.println(letter);
        System.out.println(index);

        index+= 0 - r1pos;
        letter = alphabet[index];

        System.out.println(letter);
        System.out.println(index);
    }

    public static int getLetterIndex(char[] arr, char letter) {
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==letter) {
                index = i;
                //System.out.println("found");
            }
        }
        return index;
    }
}
