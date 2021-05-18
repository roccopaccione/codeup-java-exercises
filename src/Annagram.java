public class Annagram {


    static int anagramCount(String A, String B)
    {
        int count = 0;


        int char_count[] = new int[26];


        for (int i = 0; i < A.length(); i++)
            char_count[A.charAt(i) - 'a']++;


        for (int i = 0; i < B.length(); i++)
        {
            char_count[B.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; ++i)
        {
            if(char_count[i] != 0)
            {
                count+= Math.abs(char_count[i]);
            }
        }

        return count;
    }

    public static void main(String[] args)
    {

        String A = "ddcf";
        String B = "cedk";
        System.out.println(anagramCount(A, B));
    }
}

