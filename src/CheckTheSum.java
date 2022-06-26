import java.util.HashMap;

public class CheckTheSum {
    public static boolean checkTheSum(int []arr, int n, int x){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(x-arr[i])){
                return true;
            }else{
                map.put(arr[i], true);
            }
        }return false;

    }
    public static void main(String[] args) {

    }
}
