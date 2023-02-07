import java.util.ArrayList;

public class Celebrity{
        String name;
        String sex;
        String hairColor;
        String height;
        String profession;
        int age;
        boolean alive;

        public static void main(String[] args){
                Them();

                Scanner scan = new Scanner(System.in);
                int num = (int) Math.random()^9;
                System.out.println("Enter A Guess");
                String guess = scan.nextLine();
        
                for(int i = 0; i<Celebrities.length(); i++){
                        System.out.println("Guess the celebrity");
                        
                }
        }

    
        public Celebrity( String sex, String haircolor, String height, String profession, int age, boolean alive){
                String[] ArrayOne = {"JaMorant", "ZionWilliamson", "KobeBryant", "JCole", "TaylorSwift", "SteveHarvey", "OprahWinfrey", "TomBrady", "RyanTannehill", "RyanReynolds"};
                Celebrity JaMorant = new Celebrity("male", "black", "Six Foot Two", "Basketball Player", 23, true); 
                Celebrity ZionWilliamson = new Celebrity("male", "black", "Six Foot Six", "Basketball Player", 22, true); 
                Celebrity KobeBryant = new Celebrity("male", "black", "Six Foot Six", "Basketball Player", 41, false);
                Celebrity JCole = new Celebrity("male", "black", "Six Foot Three", "Musician", 37, true);
                Celebrity TaylorSwift = new Celebrity("female", "blonde", "Five Foot Ten", "Musician", 33, true); 
                Celebrity SteveHarvey = new Celebrity("male", "bald", "Six Foot Two", "TV Host", 66, true); 
                Celebrity OprahWinfrey = new Celebrity("female", "black", "Five Foot Seven", "TV Host", 69, true);
                Celebrity TomBrady = new Celebrity("male", "brown", "Six Foot Four", "Football Player", 45, true);
                Celebrity RyanTannehill = new Celebrity("male", "brown", "Six Foor Four", "TV Host", 34, true);
                Celebrity RyanReynolds = new Celebrity("male", "brown", "Six Foot Two", "Actor", 46, true);
                
                ArrayList<String> Celebrities = new ArrayList<>(JaMorant, ZionWilliamson, KobeBryant, JCole, TaylorSwift, SteveHarvey, OprahWinfrey, TomBrady, RyanTannehill, RyanReynolds);
        }

        

        public void setHeight(String height){
                
        }

    
}