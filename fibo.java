public class fibo {
    public static void main(String[] args) {
        int n=3;
        int a=0,b=1;
        int count=2;
        while(count <= n){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
