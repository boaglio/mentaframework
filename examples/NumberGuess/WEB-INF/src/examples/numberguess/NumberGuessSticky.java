package examples.numberguess;

import java.util.*;

import org.mentawai.core.*;
import org.mentawai.validation.*;
import org.mentawai.rule.*;

public class NumberGuessSticky extends BaseAction implements Validatable {
    
    public static final String BINGO = "bingo";
    public static final String FIRST = "first";
    public static final String WRONG = "wrong";    
    
    private int answer = -1;
    
    private int guesses = 0;
    
    private static final Random random = new Random();
    
    public void prepareValidator(Validator val, String innerAction) {
            
            val.add("guess", new IntegerRule(0, 100), "Invalid guess!");
    }
            
    
    public String execute() throws Exception {
        
        // Check if a game is in progess, by fetching the current answer...
        
        if (answer == -1) {
            
            answer = random.nextInt(101);
            
            guesses = 0;
            
            adhere();
            
        }
        
        if (input.getValue("guess") != null) {
            
            guesses++;
            
            output.setValue("guesses", String.valueOf(guesses));
            
            int guess = input.getInt("guess");
            
            if (answer == guess) {
                
                output.setValue("answer", String.valueOf(answer));
                
                disjoin();
                
                return BINGO;
                
            } else {
                
                if (guess < answer) {
                    
                    addMessage("Number is higher!"); // of course this can be i18n...
                    
                } else {
                    
                    addMessage("Number is lower!"); // of course this can be i18n...
                    
                }
                
                return WRONG;
            }
        }
        
        return FIRST;
    }
}

