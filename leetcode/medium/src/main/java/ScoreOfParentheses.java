/**
 * @author harrison
 */

/*
    856. Score of Parentheses
*/
public class ScoreOfParentheses {
    public static int solve(String S) {
        int length = S.length();

        int score = 0;
        int leftRightDiff = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == '(') {
                leftRightDiff++;
            } else {
                leftRightDiff--;
            }

            if (S.charAt(i) == ')' && S.charAt(i-1) == '(') {
                // Diff = 0 : (), ()()  <- +1
                // Diff > 0 : (()), (())(())  <- *2 for every diff , also ((() implies ((()))
                score += Math.pow(2, leftRightDiff);
            }
        }
        return score;
    }
}
