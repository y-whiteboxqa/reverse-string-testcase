import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.sample.ReverseString;

public class ReverseStringTest {

    @Test
    public void validString() {
        String original = "hello";
        String actual = ReverseString.reverseStr(original);
        String expected = "olleh";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void stringWithNullValue() {
        String original = null;
        String actual = ReverseString.reverseStr(original);
        String expected = original;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void emptyString() {
        String original = "";
        String actual = ReverseString.reverseStr(original);
        String expected = original;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void stringWithOneSpace() {
        String original = " ";
        String actual = ReverseString.reverseStr(original);
        String expected = original;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void alphanumericString() {
        String original = "Hello123";
        String actual = ReverseString.reverseStr(original);
        String expected = "321olleH";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void stringWithSingleCharacter() {
        String original = "A";
        String actual = ReverseString.reverseStr(original);
        String expected = "A";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void StringWithUpperAndLowercase() {
        String original = "HeLlO";
        String actual = ReverseString.reverseStr(original);
        String expected = "OlLeH";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void StringWithSpecialCharacter() {
        String original = "ab\"&\"c@d.";
        String actual = ReverseString.reverseStr(original);
        String expected = ".d@c\"&\"ba";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void spaceAtBeginingOfString() {
        String original = " hello";
        String actual = ReverseString.reverseStr(original);
        String expected = "olleh ";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void spaceAtEndOfString() {
        String original = "hello ";
        String actual = ReverseString.reverseStr(original);
        String expected = " olleh";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void spaceInMiddleOfString() {
        String original = "hel lo";
        String actual = ReverseString.reverseStr(original);
        String expected = "ol leh";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void stringWithMultipleSpaces() {
        String original = " h el lo ";
        String actual = ReverseString.reverseStr(original);
        String expected = " ol le h ";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void palindromeString() {
        String original = "bib";
        String actual = ReverseString.reverseStr(original);
        String expected = "bib";
        Assert.assertEquals(actual, expected);
    }

}

