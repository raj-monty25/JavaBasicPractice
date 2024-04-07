class Solution
{
    static int isCircle(int N, String A[])
    {
        // code here
        int result = 0;
        for (String startWord : A) {
            String currentWord = startWord;
            for (int i = 0; i < A.length; i++) {
                for (String word : A) {
                    if (word.charAt(0) == currentWord.charAt(currentWord.length() - 1)) {
                        currentWord = word;
                        result = 1;
                        break;
                    }
                }
                if (result==0) {
                    break;
                }
                if (currentWord.equals(startWord)) {
                    result = 1;
                }
            }
        }
        return result = 0;
    }

    public static void main(String[] agrs){
        String[] str = {"aa", "bb"};
        Solution.isCircle(2, str);
    }
}