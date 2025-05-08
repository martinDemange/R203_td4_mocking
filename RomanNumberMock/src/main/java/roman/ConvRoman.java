package roman;

public interface ConvRoman {
    // convert a char in a number following the roman numbers
    public int convertLettreToInt(String roman);
    // convert a string in a number, using the convertLettreToInt method
    public int romanToInt(String roman);
    //
    public String intToRoman(int number);
}
