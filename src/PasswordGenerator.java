import java.util.Random;

public class PasswordGenerator {
    public static final String LOWERCASE_CHARACTERS = "abcdefghjklmnopqrstuvwxyz";
    public static final String UPPERCASE_CHARACTERS = "ABCDEFGHJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERS = "0123456789";
    public static final String SPACIAL_SYMBOLS = "!@#$%^&*()_+[]{};:.<>,/?";

    private final Random random;

    public PasswordGenerator(){random = new Random();}

    public String generatePassword(int length, boolean includeUppercase, boolean includeLowercase, boolean includeNumbers, boolean includeSpecialSymbols){
        StringBuilder passwordBuilder = new StringBuilder();


        String validCharcters = "";
        if(includeUppercase) validCharcters += UPPERCASE_CHARACTERS;
        if(includeLowercase) validCharcters += LOWERCASE_CHARACTERS;
        if(includeNumbers) validCharcters += NUMBERS;
        if(includeSpecialSymbols) validCharcters += SPACIAL_SYMBOLS;

        for (int i=0; i<length; i++){
            int randomIndex = random.nextInt(validCharcters.length());
            char randomChar = validCharcters.charAt(randomIndex);
            passwordBuilder.append(randomChar);
        }
        return passwordBuilder.toString();
    }
}
