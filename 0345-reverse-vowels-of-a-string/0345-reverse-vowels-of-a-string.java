class Solution {
    public String reverseVowels(String s) {
    char[] arr = s.toCharArray();

    int left = 0;
    int right = arr.length -1;
    
     while(left< right){
        while(left < right && !isVowel(arr[left])) {
            left++;
           
        }

        while(left < right && !isVowel(arr[right])){
            right--;

        }

        char a = arr[left];
        arr[left] =arr[right];
        arr[right] = a;

        left++;
        right--;
     }

     return new String(arr);
    }
    private boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}