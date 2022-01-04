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

        // INPUT KEY
        char letter = 'R';
        int index = 0;
        index = getLetterIndex(alphabet, letter);

        System.out.print(letter);
        System.out.println(index);

        // ROTOR 1
        index += r1pos;
        index = checkIndexRange(index);
        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);

        index = getLetterIndex(alphabet, letter);
        letter = rotorI[index];

        System.out.print(letter);
        System.out.println(index);

        // ROTOR 2
        index = getLetterIndex(alphabet, letter);
        index+= r2pos - r1pos;
        index = checkIndexRange(index);

        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);

        letter = rotorII[index];
        index = getLetterIndex(alphabet, letter);

        System.out.print(letter);
        System.out.println(index);

        // ROTOR 3
        index+= r2pos - r1pos;
        index = checkIndexRange(index);
        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);

        index = getLetterIndex(alphabet, letter);
        letter = rotorIII[index];
        index = getLetterIndex(alphabet, letter);

        System.out.print(letter);
        System.out.println(index);

        // REFLECTOR
        index-= r3pos;
        index = checkIndexRange(index);
        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);

        letter = reflector[index];
        index = getLetterIndex(alphabet, letter);

        System.out.print(letter);
        System.out.println(index);

        // ROTOR 3
        index+= r3pos;
        index = checkIndexRange(index);
        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);

        index = getLetterIndex(rotorIII, letter);
        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);

        // ROTOR 2
        index+= r2pos - r3pos;
        index = checkIndexRange(index);
        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);

        index = getLetterIndex(rotorII, letter);
        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);

        // ROTOR 1
        index+= r1pos - r2pos;
        index = checkIndexRange(index);
        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);

        index = getLetterIndex(rotorI, letter);
        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);

        // OUTPUT KEY
        index-= r1pos;
        index = checkIndexRange(index);
        letter = alphabet[index];

        System.out.print(letter);
        System.out.println(index);
    }

    public static int getLetterIndex(char[] arr, char letter) {
        int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==letter) {
                index = i;
            }
        }
        return index;
    }

    public static int checkIndexRange(int index) {
        if(index > 25) {
            return (index % 25) - 1;
        } else if(index < 0) {
            return 26 + index;
        } else {
            return index;
        }
    }
}
