package jp.leve_five.careerup.sample;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class StackTest {
    private Stack stack = null;
    private Stack stack5 = null;

    @Before
    public void setUp() {
        stack = new Stack();
        stack5 = new Stack(5);
    }

    @Test
    public void test初期状態ではgetCountは0を返す() {
        int count = stack.getCount();
        assertEquals(0, count);
    }

    @Test
    public void test整数3を１つ追加するしたらgetCountは１を返す() {
        stack.push(3);
        int count = stack.getCount();
        assertEquals(1, count);
    }

    @Test
    public void testpush２回実行に対してpopが一回実行された場合はgetCountが１を返す() {
        stack.push(1);
        stack.push(2);
        int pop = stack.pop();
        int count = stack.getCount();
        assertEquals(2, pop);
        assertEquals(1, count);
    }

    @Test
    public void testpushに３と４の順番で値を渡したらpopで４と３の順番で返ってくる() {
        stack.push(3);
        stack.push(4);
        int pop = stack.pop();
        assertEquals(4, pop);
        pop = stack.pop();
        assertEquals(3, pop);
    }

    @Test
    public void testpushに５と６と７の順番で値を渡したらpopで７と６と５の順番で返ってくる() {
        stack.push(5);
        stack.push(6);
        stack.push(7);
        int pop = stack.pop();
        assertEquals(7, pop);

        pop = stack.pop();
        assertEquals(6, pop);
        pop = stack.pop();
        assertEquals(5, pop);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void test要素が空のときにpopを実行したら例外が発生する() {
        stack.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testpushでスタックの要領を超えた時例外が発生する() {

        for (int i = 0; i < 11; i++) {
            stack.push(1);
        }
    }

    @Test
    public void testStackの要素数を5にして要素数も５個入る() {
        stack5.push(1);
        stack5.push(2);
        stack5.push(3);
        stack5.push(4);
        stack5.push(5);
        assertTrue(true);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testStackの要素数を５にして要素数を６個入れると例外が発生する() {
        stack5.push(1);
        stack5.push(2);
        stack5.push(3);
        stack5.push(4);
        stack5.push(5);
        stack5.push(6);
    }

}
