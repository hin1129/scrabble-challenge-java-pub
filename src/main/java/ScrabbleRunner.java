public class ScrabbleRunner {
    //main
    public static void main(String[] args) {

        Scrabble scrabble = new Scrabble("");
        scrabble.score();

        scrabble = new Scrabble(null);
        scrabble.score();

        scrabble = new Scrabble("a");
        scrabble.score();

        scrabble = new Scrabble("f");
        scrabble.score();

        scrabble = new Scrabble("street");
        scrabble.score();

        scrabble = new Scrabble("quirky");
        scrabble.score();

        scrabble = new Scrabble("OXYPHENBUTAZONE");
        scrabble.score();
    }
}
