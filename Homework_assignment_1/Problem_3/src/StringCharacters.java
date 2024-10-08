
public class StringCharacters{
    public static void main(String[] args){
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
            
        int spaces = 0, vowels = 0, letters = 0;
        text = text.toLowerCase(); // converting the String to Lower_case  
        
        for(int i= 0; i< text.length(); i++){
            char c = text.charAt(i); // c is a character from the string text at the index i.
        	if(c >= 'a' && c <= 'z'){ // Checking whether c is a letter.
        	    letters += 1;
        	    if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u'){ // Checking whether c is a vowel.
        	        vowels += 1;
        	    }
        	}else if(c == ' '){ // Checking whether c is a white space.
        	    spaces += 1;
        	}
        }
        System.out.println("The text contained vowels: " + vowels + "\n"
            + "consonants: " + (letters - vowels) + "\n"
            + "spaces: " + spaces); // Printing the results.
    }
}
