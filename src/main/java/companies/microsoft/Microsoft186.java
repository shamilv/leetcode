package companies.microsoft;

public class Microsoft186 {
    public void reverseWords(char[] s) {
        int N = s.length;
        reverse(s, 0, N-1);
        
        int left = 0, right = 0;
        while (right <= N) {
            if ((right < N && s[right] == ' ') || right == N) {
                reverse(s, left, right - 1);
                right++;
                left = right;
            } else {
                right++;
            }
        }
    }
    
    private void reverse(char[] s, int left, int right) {
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
    }
}
