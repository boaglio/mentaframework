import java.util.*;

import org.mentawai.core.*;
import org.mentawai.filter.*;
import org.mentawai.i18n.*;

import examples.numberguess.*;

public class ApplicationManager extends org.mentawai.core.ApplicationManager {
	
	public void loadActions() {
        
        filter(new ValidatorFilter(NumberGuess.WRONG));
        
        action(NumberGuess.class)
            .on(NumberGuess.FIRST, redir("tryhere.jsp"))
            .on(NumberGuess.BINGO, fwd("bingo.jsp"))
            .on(NumberGuess.WRONG, fwd("tryhere.jsp"));
            
        action(NumberGuessSticky.class)
            .on(NumberGuessSticky.FIRST, redir("tryhere.jsp"))
            .on(NumberGuessSticky.BINGO, fwd("bingo.jsp"))
            .on(NumberGuessSticky.WRONG, fwd("tryhere.jsp"));            
            
    }
            
	
}

		