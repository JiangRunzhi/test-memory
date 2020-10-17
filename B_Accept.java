import java.util.Scanner;
public class B_Accept {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int T = input.nextInt();
        int[] n_diff = new int[N];
        int[] t_energy = new int[T];
        for(int i=0;i<N;i++){
            n_diff[i] = input.nextInt();
        }
        for(int i=0;i<T;i++){
            t_energy[i] = input.nextInt();
        }

        for(int i=0;i<T;i++){
            if(haveIt(n_diff,t_energy[i])){
                System.out.printf("Accept\n");
            }
            else{
                findTheAns(n_diff,t_energy[i]);
            }
        }
    }
    //Judge whether a number is in an array.
    public static boolean haveIt(int[] n, int m){
        int left = 0;
        int right = n.length-1;
        int mid = left + (right-left)/2;
        while(left<=right) {
            if(m==n[mid]){
                return true;
            }
            else if(m<n[mid]){
                right=mid-1;
                mid = left + (right-left)/2;
            }
            else {
                left = mid+1;
                mid = left + (right-left)/2;
            }
        }
        return false;
    }
    //Find the biggest num that smaller than m in an array.
    public static void findTheAns(int[] n, int m){
        int left = 0;
        int right = n.length-1;
        int mid = left + (right-left)/2;
        while(left<=right){
            if(m<n[mid]){
                right=mid-1;
                mid = left + (right-left)/2;
            }
            else {
                left = mid+1;
                mid = left + (right-left)/2;
            }
        }
        System.out.printf("%d\n",m-n[mid-1]);
    }
}

//a change hhhhhh

//another change
