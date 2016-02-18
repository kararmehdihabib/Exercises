
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
   
    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
        
        //checks the letter already been gussed or not
        //if the gussedLetters string doesn't contain the letter then the letter
        //is added to the string
        //if the guessed letter is already in the guessedLetter string then nothing happens which 
        //means the below statements dont work
        
        if(!this.guessedLetters.contains(letter)){
        this.guessedLetters+=letter; 
        
        //if the word doesn't contain the guessed letter then the number of faults increases
          if(!this.word.contains(letter)){
           this.numberOfFaults++;
           
        }
        }
      
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
       /* String hidden="";
        char c;
        for(int j=0;j<this.guessedLetters.length();j++){
            c= this.guessedLetters.charAt(j);
        }
      
        
        for(int i=0;i<this.word.length();i++){
            hidden+="_";
        }
        if(guessedLetters.length()==0){
     return hidden;   
    }
        if(this.word.contains(""+c)){
            return hidden;
        }
    }*/
       
       //dECLARING THE HIDDEN WORD STRING
       
        String hiddenWord="";
        //DECLARING THE INDEX
        int index=0;
        
        //USING WHILE LOOP TO ITERATE EACH LETTER IN THE WORD STRING
        while(index<this.word.length()){
            
            //RETURNING CHARACTER AT THE CORRESPONDING INDEX
            char c=this.word.charAt(index);
            String letter =""+c;
            
            //cHECKING IF THE CHARACTER IS PRESENT IN GUESSEDLETTERS OR NOT
            //IF IT DOES THEN THE CHARACTER IS ADDED TO THE HIDDENWORD STRING EXACTLY AT THAT INDEX
            if(this.guessedLetters.contains(letter)){
                hiddenWord+=c;
                
            }
            //IF NOT THEN A DASH IS ADDED EXACTLY AT THAT INDEX
            else{
                hiddenWord+="_";
            }
            //INCREMENTING INDEX
            index++;
        }
        
        //AT LAST RETURNING THE HIDDENWORD
        return hiddenWord;
}
}
