public class MyClass {
    
    public static void solve(int[] arr, int i){
        for(int x=0;x<arr.length-1;x++){
            for(int y=x+1;y<arr.length;y++){
                if(arr[x] * arr[y] == i){
                    System.out.println(i + " = "+x+"*"+y);
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
    public static void main(String args[]) {
      int a1[] = {2,4,7,6,12,15};
      int a2[] = {31,22,45,63,21,98,2};
      int a3[] = {312,73,90,76,210,64,87};
      solve(a1,72);
      solve(a1,213);
      solve(a2,62);
      solve(a2,41);
      solve(a3,6570);
      solve(a2,7211);
      solve(a3,13440);
      solve(a1,22);
     
    }
}
//OUTPUT IS
// 72 = 3*4
// Not found
// 62 = 0*6
// Not found
// 6570 = 1*2
// Not found
// 13440 = 4*5
// Not found
