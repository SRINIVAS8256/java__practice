public class conloop {
    public static void main(String[] args) {
        //fibonachhi series
    //     int p=0;
    //     int c=1;
    //     int count=2;
    //     int n=8;
    //     while(count < n){
    //         int temp=c;
    //         c=c+p;
    //         p=temp;
    //         count++;
    //     }
    //     System.out.println(c);

    //tooooo count
    System.out.println((int)13839/10);
    int n=1432225612;
    int counet=0;
    while(n>0){
        int r=n%10;
        if(r==5){
        counet++;
    }
    n=n/10;
}
System.out.println(counet);
    }
    
}
