import java.util.ArrayList;
import java.util.List;

public class Celebrity {
   

    
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

