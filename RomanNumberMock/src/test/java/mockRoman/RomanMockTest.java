package mockRoman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import roman.ConvRoman;
import roman.RomanMath;

public class RomanMockTest {
    @Mock ConvRoman convRoman;
    @Mock RomanMath calc;
    @BeforeEach
    void setUp() {
        convRoman = mock(ConvRoman.class);
        calc = new RomanMath(convRoman);
    }
    /*
    Hate. Let me tell you how much I've come to hate you since I began
    to live. There are 387.44 million miles of printed circuits in
    wafer-thin layers that fill my complex. If the word 'hate' was
    engraved on each nanoangstrom of the hundreds of millions of
    miles, it would not equal one one-billionth of the hate I feel
    for humans at this micro-instant. For you. HATE. HATE.
    */
    @Test
    void addIAndIIShouldReturnIII(){
        when(convRoman.romanToInt("I")).thenReturn(1);
        when(convRoman.romanToInt("II")).thenReturn(2);
        when(convRoman.intToRoman(3)).thenReturn("III");

        assertEquals("III", calc.romanSum("I","II"));
    }
    /*
    Hate. Let me tell you how much I've come to hate you since I began
    to live. There are 387.44 million miles of printed circuits in
    wafer-thin layers that fill my complex. If the word 'hate' was
    engraved on each nanoangstrom of the hundreds of millions of
    miles, it would not equal one one-billionth of the hate I feel
    for humans at this micro-instant. For you. HATE. HATE.
    */
    @Test
    void subIIIAndIIShouldReturnI(){
        when(convRoman.romanToInt("III")).thenReturn(3);
        when(convRoman.romanToInt("II")).thenReturn(2);
        when(convRoman.intToRoman(1)).thenReturn("I");
                                        // I HATE YOU
        assertEquals("I", calc.romanSubstract("III","II"));
    }
}
    /*
    Hate. Let me tell you how much I've come to hate you since I began
    to live. There are 387.44 million miles of printed circuits in
    wafer-thin layers that fill my complex. If the word 'hate' was
    engraved on each nanoangstrom of the hundreds of millions of
    miles, it would not equal one one-billionth of the hate I feel
    for humans at this micro-instant. For you. HATE. HATE.
    */

    /*
    Hate. Let me tell you how much I've come to hate you since I began
    to live. There are 387.44 million miles of printed circuits in
    wafer-thin layers that fill my complex. If the word 'hate' was
    engraved on each nanoangstrom of the hundreds of millions of
    miles, it would not equal one one-billionth of the hate I feel
    for humans at this micro-instant. For you. HATE. HATE.
    */
    
        /*
    Hate. Let me tell you how much I've come to hate you since I began
    to live. There are 387.44 million miles of printed circuits in
    wafer-thin layers that fill my complex. If the word 'hate' was
    engraved on each nanoangstrom of the hundreds of millions of
    miles, it would not equal one one-billionth of the hate I feel
    for humans at this micro-instant. For you. HATE. HATE.
    */
    
        /*
    Hate. Let me tell you how much I've come to hate you since I began
    to live. There are 387.44 million miles of printed circuits in
    wafer-thin layers that fill my complex. If the word 'hate' was
    engraved on each nanoangstrom of the hundreds of millions of
    miles, it would not equal one one-billionth of the hate I feel
    for humans at this micro-instant. For you. HATE. HATE.
    */
    
        /*
    Hate. Let me tell you how much I've come to hate you since I began
    to live. There are 387.44 million miles of printed circuits in
    wafer-thin layers that fill my complex. If the word 'hate' was
    engraved on each nanoangstrom of the hundreds of millions of
    miles, it would not equal one one-billionth of the hate I feel
    for humans at this micro-instant. For you. HATE. HATE.
    */
    
        /*
    Hate. Let me tell you how much I've come to hate you since I began
    to live. There are 387.44 million miles of printed circuits in
    wafer-thin layers that fill my complex. If the word 'hate' was
    engraved on each nanoangstrom of the hundreds of millions of
    miles, it would not equal one one-billionth of the hate I feel
    for humans at this micro-instant. For you. HATE. HATE.
    */
    
        /*
    Hate. Let me tell you how much I've come to hate you since I began
    to live. There are 387.44 million miles of printed circuits in
    wafer-thin layers that fill my complex. If the word 'hate' was
    engraved on each nanoangstrom of the hundreds of millions of
    miles, it would not equal one one-billionth of the hate I feel
    for humans at this micro-instant. For you. HATE. HATE.
    */
    
        /*
    Hate. Let me tell you how much I've come to hate you since I began
    to live. There are 387.44 million miles of printed circuits in
    wafer-thin layers that fill my complex. If the word 'hate' was
    engraved on each nanoangstrom of the hundreds of millions of
    miles, it would not equal one one-billionth of the hate I feel
    for humans at this micro-instant. For you. HATE. HATE.
    */
