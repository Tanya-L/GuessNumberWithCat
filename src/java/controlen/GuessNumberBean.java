package controlen;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Random;

@Named(value = "guessNumberBean")
@SessionScoped
public class GuessNumberBean implements Serializable {

    private final int RANDOMNUMBER;
    
    private int max = 10;
    private int min = 1;
    private int userguess;
    
    private String response;        
            
    public GuessNumberBean() {
        Random random = new Random();
        RANDOMNUMBER = random.nextInt(max)+1;
    }
    
    public String getRespons(){
    if (userguess==RANDOMNUMBER) {
        return "I can not believe it. You guessed right!";
    } else if (userguess<RANDOMNUMBER){ 
        return "Sorry, my dear. "
                + "You guessed too low number. "
                + "Do you want to try one more time?";
    } else { 
        return "Sorry, my dear. You guessed to high number. Do you want to try one more time?";
    }
}

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getUserguess() {
        return userguess;
    }

    public void setUserguess(int userguess) {
        this.userguess = userguess;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    } 
}

