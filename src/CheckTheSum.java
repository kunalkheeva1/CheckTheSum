import java.util.HashMap;

public class CheckTheSum {
    public static boolean checkTheSum(int []arr, int n, int x){
        //start storing it in hashmap
        HashMap<Integer, Boolean> map = new HashMap<>();
        //run a loop until n
        for(int i = 0; i<n; i++){
            //if map contains other portion that adds to make x then return true
            if(map.containsKey(x-arr[i])){
                return true;
                //otherwise just put everything in map
            }else{
                map.put(arr[i], true);
            }
            //else if no condition matches, or array is empty return false
        }return false;

    }
    public static void main(String[] args) {

    }
}
