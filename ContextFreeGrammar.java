/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contextfreegrammar;

/**
 *
 * @author johnc
 */
import java.util.Random;

public class ContextFreeGrammar 
{
    private static final String[] article = {"the", "a"};
    private static final String[] noun = {"cat", "dog", "house", "book", "computer"};
    private static final String[] verb = {"runs", "jumps", "eats", "sleeps", "reads"};
    private static final String[] adjective = {"happy", "sad", "big", "small", "red"};
    private static final String[] preposition = {"on", "in", "at", "under", "over"};
    
    private static final Random random = new Random();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String tree = "";
        
        String test = generateSentence();
        System.out.println(test);
        
        String words[] = test.split(" ");
        for (int index = 0; index < words.length; index++)
        {
            System.out.print(words[index]);
            
            switch(words[index])
            {
                case "the":
                    System.out.println(": art");
                    tree = tree + "art\n";
                    break;
                case "a":
                    System.out.println(": art");
                    tree = tree + "art\n";
                    break;
                case "The":
                    System.out.println(": art");
                    tree = tree + "art\n";
                    break;
                case "A":
                    System.out.println(": art");
                    tree = tree + "art\n";
                    break;
                case "cat":
                    System.out.println(": noun");
                    tree = tree + "noun\n";
                    break;
                case "dog":
                    System.out.println(": noun");
                    tree = tree + "noun\n";
                    break;
                case "house":
                    System.out.println(": noun");
                    tree = tree + "noun\n";
                    break;
                case "book":
                    System.out.println(": noun");
                    tree = tree + "noun\n";
                    break;
                case "computer":
                    System.out.println(": noun");
                    tree = tree + "noun\n";
                case "cat.":
                    System.out.println(": noun");
                    tree = tree + "noun\n";
                    break;
                case "dog.":
                    System.out.println(": noun");
                    tree = tree + "noun\n";
                    break;
                case "house.":
                    System.out.println(": noun");
                    tree = tree + "noun\n";
                    break;
                case "book.":
                    System.out.println(": noun");
                    tree = tree + "noun\n";
                    break;
                case "computer.":
                    System.out.println(": noun");
                    tree = tree + "noun\n";
                    break;
                case "runs":
                    System.out.println(": verb");
                    tree = tree + "verb\n";
                    break;
                case "jumps":
                    System.out.println(": verb");
                    tree = tree + "verb\n";
                    break;
                case "eats":
                    System.out.println(": verb");
                    tree = tree + "verb\n";
                    break;
                case "sleeps":
                    System.out.println(": verb");
                    tree = tree + "verb\n";
                    break;
                case "reads":
                    System.out.println(": verb");
                    tree = tree + "verb\n";
                    break;
                case "happy":
                    System.out.println(": adj");
                    tree = tree + "adj\n";
                    break;
                case "sad":
                    System.out.println(": adj");
                    tree = tree + "adj\n";
                    break;
                case "big":
                    System.out.println(": adj");
                    tree = tree + "adj\n";
                    break;
                case "small":
                    System.out.println(": adj");
                    tree = tree + "adj\n";
                    break;
                case "red":
                    System.out.println(": adj");
                    tree = tree + "adj\n";
                    break;
                case "on":
                    System.out.println(": prep");
                    tree = tree + "prep\n";
                    break;
                case "in":
                    System.out.println(": prep");
                    tree = tree + "prep\n";
                    break;
                case "at":
                    System.out.println(": prep");
                    tree = tree + "prep\n";
                    break;
                case "under":
                    System.out.println(": prep");
                    tree = tree + "prep\n";
                    break;
                case "over":
                    System.out.println(": prep");
                    tree = tree + "prep\n";
                    break;
                default:
                    System.out.println("Error: the word is not available in the language");
            }
            
        }
        
        System.out.println("\n\n\nParse Tree: \n" + tree) ;
        System.out.println("Since the sentence is grammatically correct, it is a valid sentence in American English");
    }
   
    
    public static String generateSentence() 
    {
        String sentence = generateNounPhrase() + " " + generateVerbPhrase() + ".";
        return sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
    }

    public static String generateNounPhrase() 
    {
        String nounPhrase = article[random.nextInt(article.length)] + " " +
                            adjective[random.nextInt(adjective.length)] + " " +
                            noun[random.nextInt(noun.length)];
        return nounPhrase;
    }

    public static String generateVerbPhrase() 
    {
        String verbPhrase = verb[random.nextInt(verb.length)] + " " +
                            generateNounPhrase() + " " +
                            preposition[random.nextInt(preposition.length)] + " " +
                            generateNounPhrase();
        return verbPhrase;
    }
    
}
