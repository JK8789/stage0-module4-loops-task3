package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public static void printAlphabet() {
        char letter;
        for (letter = 'a'; letter <= 'z'; letter++) {
            System.out.println(letter);
        }
    }

    public static void main(String[] args) {
        printAlphabet();
    }
}
