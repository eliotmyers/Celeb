import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class CelebrityGame {
    private List<Celebrity> celebrities;
    private Scanner scanner;

    public CelebrityGame() {
        celebrities = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    

    public void createCelebrities() {
        addCelebrity("Ja Morant", "Basketball Player", "male", "black hair", "Twenty-three years old", "Alive");
        addCelebrity("Zion Williamson", "Basketball Player", "male", "black hair", "Twenty-two years old", "Alive");
        addCelebrity("Kobe Bryant", "Basketball Player", "male", "black hair", "Forty-one years old", "Dead");
        addCelebrity("J Cole", "Singer", "male", "black hair", "Thirty-seven years old", "Alive");
        addCelebrity("Taylor Swift", "Singer", "female", "blonde hair", "Thirty-three years old", "Alive");
        addCelebrity("Steve Harvey", "Entertainer", "male", "bald", "Sixty-six years old", "Alive");
        addCelebrity("Oprah Winfrey", "Entertainer", "female", "brown hair", "Sixty-nine years old", "Alive");
        addCelebrity("Tom Brady", "Football Player", "male", "brown hair", "Forty-five years old", "Alive");
        addCelebrity("Ryan Tannehill", "Football Player", "male", "brown hair", "Thirty-four years old", "Alive");
        addCelebrity("Ryan Reynolds", "Actor", "male", "brown hair", "Forty-six years old", "Alive");
    }

    public void addCelebrity(String name, String... traits) {
        celebrities.add(new Celebrity(name, traits));
    }

    public void celebrityDescription() {
        for (Celebrity celebrity : celebrities) {
            System.out.println(celebrity.getName() + " can be described as:");
            for (String trait : celebrity.getTraits()) {
                System.out.println("  - " + trait);
            }
        }
    }
    public void game() {
        createCelebrities();
        celebrityDescription();
        Celebrity name = celebrities.get((int) (Math.random() * celebrities.size()));
        int attempt = 0;
        while (attempt < name.getTraits().size()) {
            System.out.println("Guess trait:");
            String guess = scanner.nextLine();
            if (name.guessTrait(guess, attempt)) {
                attempt++;
            } else {
                System.out.println("Incorrect guess, try again.");
            }
        }
        System.out.println("Guess the celebrity:");
        String guess = scanner.nextLine();
        if (name.getName().equalsIgnoreCase(guess)) {
            System.out.println("You guessed the Celebrity! Their name was " + name.getName());
        } else {
            System.out.println("Wrong. The celebrity's name was " + name.getName());
        }
    }

    public static void main(String[] args) {
        CelebrityGame game = new CelebrityGame();
        game.game();
    }
}

class Celebrity {
    private String name;
    private List<String> traits;

    public Celebrity(String name, String... traits) {
        this.name = name;
        this.traits = new ArrayList<>();
        for (String trait : traits) {
            this.traits.add(trait);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getTraits() {
        return traits;
    }

    public boolean guessTrait(String guess, int index) {
        return guess.equalsIgnoreCase(traits.get(index));
    }
}

    
        

        

        

    
