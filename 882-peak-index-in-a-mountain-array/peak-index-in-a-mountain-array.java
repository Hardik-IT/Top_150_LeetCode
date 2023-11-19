class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        if(!(arr.length>=3))
            return 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int start = 1;
        int end = arr.length-1;
        for(int i=1;i<arr.length-1;i++){
                if(arr[i] > arr[i+1] && arr[i] > arr[i-1])
                    return i;    
                else
                    continue;    
        }
        return 0;
    }
}