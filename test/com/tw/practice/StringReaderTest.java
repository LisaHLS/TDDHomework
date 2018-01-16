package com.tw.practice;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class StringReaderTest {
    private StringReader reader = new StringReader();

    private void setInputStream(String input) throws NoSuchFieldException, IllegalAccessException {
        Field scannerField = reader.getClass().getDeclaredField("scanner");
        scannerField.setAccessible(true);
        Scanner scannerWithMockedStream = new Scanner(new ByteArrayInputStream(input.getBytes()));
        scannerField.set(reader, scannerWithMockedStream);
    }

    @Test
    public void shouldReadCharacterString() throws Exception {
        setInputStream("abdcfffff");
        assertEquals("abdcfffff", reader.read());
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionForNonCharacterInput() throws Exception {
        setInputStream("ab12");
        reader.read();
    }
}
