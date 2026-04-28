package Problemslvl1;

import java.util.Random;

public class RandomCharacterGenerator {

    public static int randomNumber(int from, int to) {
        Random rand = new Random();
        return rand.nextInt(to - from + 1) + from;
    }

    enum CharType {
        SMALL_LETTER,
        CAPITAL_LETTER,
        DIGIT,
        SYMBOL
    }

    public static char getRandomCharacter(CharType charType) {
        switch (charType) {
            case SMALL_LETTER:
                return (char) randomNumber(97, 122); // a-z
            case CAPITAL_LETTER:
                return (char) randomNumber(65, 90);  // A-Z
            case SYMBOL:
                return (char) randomNumber(33, 47);  // symbols
            case DIGIT:
                return (char) randomNumber(48, 57);  // 0-9
            default:
                return '\0';
        }
    }

    public static void main(String[] args) {
        System.out.println(getRandomCharacter(CharType.SMALL_LETTER));
        System.out.println(getRandomCharacter(CharType.CAPITAL_LETTER));
        System.out.println(getRandomCharacter(CharType.SYMBOL));
        System.out.println(getRandomCharacter(CharType.DIGIT));
    }
}
