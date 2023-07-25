
public class Climbingstairsrecu {
  public static int climbingStairsRecur(int n){
    if(n==0 || n==1){
      return 1;
    }
    return climbingStairsRecur(n-1)+climbingStairsRecur(n-2);
  }
  public static int recurmemoization(int n, int arr[]){
    if(n==0 || n==1){
      return 1;
    }
    if(arr[n]!=0){
      return arr[n];
    }
    arr[n]=recurmemoization(n-1, arr)+recurmemoization(n-2, arr);
    return arr[n];
  }
  public static int recurTabulation(int n){
    int arr[]=new int[n+1];
    arr[0]=1;
    arr[1]=1;
    for(int i=2;i<arr.length;i++){
      arr[i]=arr[i-1]+arr[i-2];
    }
    return arr[n];
  }
 public static void main(String[] args) {
  int n=5;
  int arr[]=new int[n+1];

  System.out.println(climbingStairsRecur(n));
  System.out.println(recurmemoization(n, arr));
  System.out.println(recurTabulation(n));
 }
}
