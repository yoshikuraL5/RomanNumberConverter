package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class InRomanNumeralsTest {
 
    @Before
    
        
    
 
   @Test
    public void testiを３つ入力すると３が返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("iii");
        assertEquals(3, answer);
    }
    @Test
    public void testvを1つ入力すると5が返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("v");
        assertEquals(5, answer);
    }
    @Test
    public void testxを３つ入力すると3０が返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("xxx");
        assertEquals(30, answer);
    }
    @Test
    public void testxを３つvを１つiを２つ入力すると36が返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("xXxVI");
        assertEquals(36, answer);
    }
    
    @Test
    public void testLを1つ入力すると50が返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("L");
        assertEquals(50, answer);
    }
    @Test
    public void testcを３つ入力すると３00が返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("Ccc");
        assertEquals(300, answer);
    }
    @Test
    public void testDを1つ入力すると500が返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("D");
        assertEquals(500, answer);
    }
    @Test
    public void testMを2つ入力すると2000が返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("Mm");
        assertEquals(2000, answer);
    }
    @Test
    public void testmを2つdを１つcを２つ入力すると2700が返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("mMdCC");
        assertEquals(2700, answer);
    }
    
    @Test
    public void testcを1つ入力すると100が返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("c");
        assertEquals(100, answer);
    }
    @Test
    public void testmmmcmlivを入力する3954とが返る() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        int answer = inRomanNumerals.inOut("mmmcmliv");
        assertEquals(3954, answer);
    }
    @Test
    public void testiを4つ入力すると正しいローマ数字の記法ではありませんと表示される() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        inRomanNumerals.inOut("iiii");
    }
    @Test
    public void testvmを入力すると正しいローマ数字の記法ではありませんと表示される() {
        InRomanNumerals inRomanNumerals = new InRomanNumerals();
        inRomanNumerals.inOut("vm");
    }

}
