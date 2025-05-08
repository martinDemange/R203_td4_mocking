package roman;

public class RomanMath {
    private ConvRoman convRoman;

    public RomanMath(ConvRoman convRoman) {
        this.convRoman = convRoman;
    }
    public String romanSum(String str, String str2) {
        return convRoman.intToRoman(convRoman.romanToInt(str) + convRoman.romanToInt(str2));
    }

    public String romanSubstract(String str, String str2) {
        return convRoman.intToRoman(convRoman.romanToInt(str) - convRoman.romanToInt(str2));
    }
}
