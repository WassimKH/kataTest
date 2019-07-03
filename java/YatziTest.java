import org.junit.*;
import static org.junit.Assert.*;

public class YatziTest {

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int[] t1 = {2,3,4,5,1};
        int[] t2 = {2,3,4,5,6};
        int actual = YatziRefactoring.chance(t1);
        assertEquals(expected, actual);
        assertEquals(20, YatziRefactoring.chance(t2));
    }

    @Test public void yatzy_scores_50() {
        int expected = 50;
        int[] t1 = {4,4,4,4,4};
        int[] t2 = {6,6,6,6,6};
        int[] t3 = {6,6,6,6,3};
        int actual = YatziRefactoring.yatzy(t1);
        assertEquals(expected, actual);
        assertEquals(50, YatziRefactoring.yatzy(t2));
        assertEquals(0, YatziRefactoring.yatzy(t3));
    }

    // we have regrouped some tests in the same test case
    @Test public void test_onesTwosThreesFoursFivesSixes() {
    	int[] t1 = {1,2,3,4,5};
        int[] t2 = {1,2,1,4,5};
        int[] t3 = {6,2,2,4,5};
        int[] t4 = {1,2,1,1,1};
        int[] t5 = {1,2,3,2,6};
        int[] t6 = {2,2,2,2,2};
        int[] t7 = {1,2,3,2,3};
        int[] t8 = {2,3,3,3,3};
        int[] t9 = {4,4,4,5,5};
        int[] t10 = {4,4,5,5,5};
        int[] t11 = {4,5,5,5,5};
        int[] t12 = {4,4,4,5,5};
        int[] t13 = {4,4,5,5,5};
        int[] t14 = {4,5,5,5,5};
        int[] t15 = {4,4,4,5,5};
        int[] t16 = {4,4,6,5,5};
        int[] t17 = {6,5,6,6,5};
        
        assertTrue(YatziRefactoring.onesTwosThreesFoursFivesSixes(1,t1) == 1);
        assertEquals(2, YatziRefactoring.onesTwosThreesFoursFivesSixes(1,t2));
        assertEquals(0, YatziRefactoring.onesTwosThreesFoursFivesSixes(1,t3));
        assertEquals(4, YatziRefactoring.onesTwosThreesFoursFivesSixes(1,t4));
        assertEquals(4, YatziRefactoring.onesTwosThreesFoursFivesSixes(2,t5));
        assertEquals(10, YatziRefactoring.onesTwosThreesFoursFivesSixes(2,t6));
        assertEquals(6, YatziRefactoring.onesTwosThreesFoursFivesSixes(3,t7));
        assertEquals(12, YatziRefactoring.onesTwosThreesFoursFivesSixes(3,t8));
        assertEquals(12, YatziRefactoring.onesTwosThreesFoursFivesSixes(4,t9));
        assertEquals(8, YatziRefactoring.onesTwosThreesFoursFivesSixes(4,t10));
        assertEquals(4, YatziRefactoring.onesTwosThreesFoursFivesSixes(4,t11));
        assertEquals(10, YatziRefactoring.onesTwosThreesFoursFivesSixes(5,t12));
        assertEquals(15, YatziRefactoring.onesTwosThreesFoursFivesSixes(5,t13));
        assertEquals(20, YatziRefactoring.onesTwosThreesFoursFivesSixes(5,t14));
        assertEquals(0, YatziRefactoring.onesTwosThreesFoursFivesSixes(6,t15));
        assertEquals(6, YatziRefactoring.onesTwosThreesFoursFivesSixes(6,t16));
        assertEquals(18, YatziRefactoring.onesTwosThreesFoursFivesSixes(6,t17));
        
    }

    @Test
    public void one_pair() {
    	int[] t1 = {3,4,3,5,6};
        int[] t2 = {5,3,3,3,5};
        int[] t3 = {5,3,6,6,5};
        assertEquals(6, YatziRefactoring.score_pair(t1));
        assertEquals(10, YatziRefactoring.score_pair(t2));
        assertEquals(12, YatziRefactoring.score_pair(t3));
    }

    @Test
    public void two_Pair() {
    	   int[] t1 = {3,3,5,4,5};
           int[] t2 = {3,3,5,5,5};
           assertEquals(16, YatziRefactoring.two_pair(t1));
           assertEquals(16, YatziRefactoring.two_pair(t2));
    }

    @Test
    public void number_of_a_kind() 
    {
    	int[] t1 = {3,3,3,4,5};
        int[] t2 = {5,3,5,4,5};
        int[] t3 = {3,3,3,3,5};
        int[] t4 = {3,3,3,3,5};
        int[] t5 = {5,5,5,4,5};
        int[] t6 = {3,3,3,3,3};
        assertEquals(9, YatziRefactoring.number_of_a_kind(3,t1));
        assertEquals(15, YatziRefactoring.number_of_a_kind(3,t2));
        assertEquals(9, YatziRefactoring.number_of_a_kind(3,t3));
        assertEquals(12, YatziRefactoring.number_of_a_kind(4,t4));
        assertEquals(20, YatziRefactoring.number_of_a_kind(4,t5));
        //must be equal to 12 and not to 9
        assertEquals(12, YatziRefactoring.number_of_a_kind(4,t6));
    }

    

    @Test
    public void smallStraight() {
    	int[] t1 = {1,2,3,4,5};
        int[] t2 = {2,3,4,5,1};
        int[] t3 = {1,2,2,4,5};
        assertEquals(15, YatziRefactoring.smallStraight(t1));
        assertEquals(15, YatziRefactoring.smallStraight(t2));
        assertEquals(0, YatziRefactoring.smallStraight(t3));
    }

    @Test
    public void largeStraight() {
    	int[] t1 = {6,2,3,4,5};
        int[] t2 = {2,3,4,5,6};
        int[] t3 = {1,2,2,4,5};
        assertEquals(20, YatziRefactoring.largeStraight(t1));
        assertEquals(20, YatziRefactoring.largeStraight(t2));
        assertEquals(0, YatziRefactoring.largeStraight(t3));
    }

    @Test
    public void fullHouse() {
    	  int[] t1 = {6,2,2,2,6};
          int[] t2 = {2,3,4,5,6};
          assertEquals(18, YatziRefactoring.fullHouse(t1));
          assertEquals(0, YatziRefactoring.fullHouse(t2));
    }
}