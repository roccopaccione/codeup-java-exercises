import static java.lang.Math.abs;

public class Solution {

    // Counts the no of manipulations required
    static int solution(String A, String B)
    {
        int num = 0;
        int charCount[] = new int[26];

        for (int i = 0; i < A.length(); i++)
            charCount[A.charAt(i) - 'a']++;

        for (int i = 0; i < B.length(); i++)
        {
            charCount[B.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; ++i)
        {
            if(charCount[i] != 0)
            {
                num+=abs(charCount[i]);

            }
        }

        return num;
    }


    // Driver code
    public static void main(String[] args)
    {

        String A = "ddcf";
        String B = "cedk";
        System.out.println(solution(A, B));
    }
}
