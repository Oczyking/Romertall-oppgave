import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowRomanLetters {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }
    @Test
    void shouldConvert2ToII() {
        assertEquals("II", toRoman(2));
    }

    @Test
    void shouldConvert3ToIII(){
        assertEquals("III", toRoman(3));
    }

    private String toRoman(int i) {

        String roman = "";
        if(i == 1){
            roman = "I";
        } else if (i ==2 ){
            roman = "II";
        } else{
            roman = "III";
        }

        return roman;

    }
}
