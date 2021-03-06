package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Calculator2Test {

    @Before
    public void setUp()throws Exception{}
    Calculator2 string =  new Calculator2();
    

    @Test
    public void test文字列で１プラス２を入力すると配列で１プラス２が返ってくる(){
        char[] fomula = string.fomula("1+2");
        assertEquals('1', fomula[0]);
        assertEquals('+', fomula[1]);
        assertEquals('2', fomula[2]);
    }
    
    @Test(expected = RuntimeException.class)
    public void test数字や演算子以外の文字が入力されたらexceptionを返す(){
       string.fomula("あ");
       string.check();
    }
    
    @Test
    public void test小括弧を渡しても例外にならない(){
        string.fomula("(1+2)");
        string.check();
    }
    @Test
    public void test１２プラス３１を入力すると１２プラス３１の順で返ってくる(){
        string.fomula("12+31");
        char[] fomula2 = string.figureCheck();
        assertEquals(12, fomula2[0]);
        assertEquals('+', fomula2[1]);
        assertEquals(31, fomula2[2]);
    }

//    @Test
//    public void test１プラス２を入力すると１２プラスの順で返ってくる(){
//        char[] fomula = string.fomula("1+2");
//        char[] fomula2 = string.sort(fomula);
//        assertEquals('1', fomula2[0]);
//        assertEquals('2', fomula2[1]);
//        assertEquals('+', fomula2[2]);
//        
//    }
  
}
