class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] count = new int[arr.length];
        int size = 0;

        for(int i = 0 ; i<arr.length;i++){
            boolean found = false;

            for (int j =0;j<i;j++){
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (!found ){
                int c =0;

                for(int j =0;j< arr.length;j++){
                    if (arr[i] == arr[j]){
                        c++;
                    }
                }
                count[size] = c;
                size++;
            }
        }
        for(int i =0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if (count [i] == count [j]){
                    return false;
                }
            }
        }
        return true;
    }
}