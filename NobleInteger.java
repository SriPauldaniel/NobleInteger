import java.util.*;
public class NobleInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findInt(arr, n));
        sc.close();
    }

    static int findInt(int[] arr,int n) {
        int count_n = 0,count_s = 0;
        Arrays.sort(arr);
        if(arr[0] == 0) {
            count_n++;
        }
        for(int i=1;i<n;i++) {
            if(arr[i] != arr[i-1]) {
                count_s = i;
            }
            if(count_s == arr[i]) {
                count_n++;
            }
        }
        return count_n;
    }
}