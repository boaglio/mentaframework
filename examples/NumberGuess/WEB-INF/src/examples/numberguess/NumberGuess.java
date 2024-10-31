package examples.numberguess;

import java.util.*;

import org.mentawai.core.*;
import org.mentawai.validation.*;
import org.mentawai.rule.*;

public class NumberGuess extends BaseAction implements Validatable {
    
    public static final String BINGO = "bingo";
    public static final String FIRST = "first";
    public static final String WRONG = "wrong";    
    
    private static final Random random = new Random();
    
    private void incrementGuesses() {
        
        Integer i = (Integer) session.getAttribute("guesses");
        
        session.setAttribute("guesses", new Integer(i.intValue() + 1));
        
    }
    
    public void prepareValidator(Validator val, String innerAction) {
            
            val.add("guess", new IntegerRule(0, 100), "Invalid guess!");
    }
    
    public String execute() throws Exception {
        
        // Check if a game is in progess, by fetching the current answer...
        
        int answer = -1;
        
        if (session.getAttribute("answer") == null) {
            
            answer = random.nextInt(101);
            
            session.setAttribute("answer", new Integer(answer));
            
            session.setAttribute("guesses", new Integer(0));
            
        } else {
            
            answer = ( (Integer) session.getAttribute("answer")).intValue();
            
        }
        
        if (input.getValue("guess") != null) {
            
            incrementGuesses();
            
            int guess = input.getInt("guess");
            
            if (answer == guess) {
                
                output.setValue("answer", session.getAttribute("answer").toString());
                
                output.setValue("guesses", session.getAttribute("guesses").toString());
                
                session.removeAttribute("answer");
                
                session.removeAttribute("guesses");
                
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

