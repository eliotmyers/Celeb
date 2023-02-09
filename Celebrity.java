import java.util.ArrayList;
import java.util.Scanner;

public class Celebrity {
        private String name;
        private String clue;
        private String sex;
        private String hairColor;
        private String height;
        private String profession;
        private int age;
        private boolean alive;
        
        public Celebrity(String name, String clue, String sex, String hairColor, String height, String profession, int age, boolean alive) {
          this.name = name;
          this.clue = clue;
          this.sex = sex;
          this.hairColor = hairColor;
          this.height = height;
          this.profession = profession;
          this.age = age;
          this.alive = alive;
        }
        
        public Celebrity(String string, String string2, String string3, String string4, int j, boolean b) {
        }

        public String getName() {
                return name;
        }
        
        public String getClue() {
                return clue;
        }
        
        public String getSex() {
                return sex;
        }
        
        public String getHairColor() {
                return hairColor;
        }
        
        public String getHeight() {
                return height;
        }
        
        public String getProfession() {
                return profession;
        }
        
        public int getAge() {
                return age;
        }
        
        public boolean getAlive() {
                return alive;
        }
      
        
        public static void main(String[] args){
                

                

        

               
                       
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
                        
                        ArrayList<String> Celebrities = new ArrayList<>();
                        Celebrities.add(JaMorant);
                }
                
                
        }

    
        

        

        

    
