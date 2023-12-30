import java.util.*;
public class Integerpairs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int[] n=new int[l];
        for(int i=0;i<l;i++){
            n[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        boolean f=false;
        for(int j=0;j<n.length;j++){
            for(int k=j+1;k<n.length;k++){
                if((n[j]+n[k])==m){
                    System.out.print((n[j]+" "+n[k]));
                    f=true;
                    break;
                }
            }
            if(f){
                break;
            }
        }
        sc.close();
    }
    
}
