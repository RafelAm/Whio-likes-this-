import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", Solution.whoLikesIt());
        assertEquals("Peter likes this", Solution.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Solution.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Solution.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}


class Solution {
    public static String whoLikesIt(String... names) {
        
        if(names.length == 0){
          return "no one likes this";
        }
        for(int i = 0; i < names.length; i++){
          if(names.length == 1){
            return names[i] + " likes this";
          }if(names.length == 2){
            return names[0] + " and " + names[1] + " like this";
          }if(names.length == 3){
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
          }if(names.length > 3){
            return names[0] + ", " + names[1] + " and "+ (names.length - 2) + " others like this";
          }
        }
      
        return "";
    }
}
