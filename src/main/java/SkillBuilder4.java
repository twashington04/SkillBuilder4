
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4{

    private static final String FINDING_Y = "Yy";

    private static final String FINDING_T = "Tt";
    private static final int NO_T = 0;
    private static final int NO_Y = 1;
    private static final int Y_AND_T = 2;

    public static String findTYPattern(String s)
    {
        int currentState = NO_T;
        int index = 0;
        String TYPattern = "";
        while ((index < s.length()) && (currentState != Y_AND_T)){
            char ch = s.charAt(index);
            if ( currentState == NO_T){
                if (FINDING_T.indexOf(ch) > -1){
                    TYPattern += ch;
                    currentState = NO_Y ;
                }
            } else if (currentState == NO_Y){
                if (FINDING_Y.indexOf(ch) > -1){
                    currentState = Y_AND_T;
                    TYPattern += ch;
                } else
                    TYPattern += ch;
                }
            index++;
            }
        return TYPattern;
        }


    }
