package com.tw.practice;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelTest {

    private Vowel vowel = new Vowel();

    @Test
    public void shouldReturnMommyWhenOneVowel() {
        assertEquals("mommy", vowel.replaceVowel("a"));
    }

    @Test
    public void shouldReturnItselfWhenOneNonVowel() {
        assertEquals("c", vowel.replaceVowel("c"));
    }

    @Test
    public void shouldReturnReplacedStringWhenExitDiscontinuousVowel() {
        assertEquals("mommyfmommythmommyrmommy", vowel.replaceVowel("afatheri"));
    }

    @Test
    public void shouldReturnReplacedStringWhenExitContinuousVowel() {
        assertEquals("LmommyVmommyM", vowel.replaceVowel("LOVEaioM"));
    }

    @Test
    public void shouldReturnItselfWhenJustThirtyPercent() {
        assertEquals("abcdefghij", vowel.replaceVowel("abcdefghij"));
    }
}
