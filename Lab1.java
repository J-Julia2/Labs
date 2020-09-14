package study;

public class Lab1 {
    public static void main(String[] args){ 
        int s=3;
    long[] d=new long[9];
    double[] x=new double[18];
    double[][] k=new double[9][18];

    for (int i=0;i<9;i++){
        d[i]=s;
        s+=2;
    }
    for (int i=0;i<14;i++){
        x[i]=(Math.random()*(14+11))-11;
    }
        
    for (int i=0; i<9;i++){
        for (int j=0;j<18;j++) {
            if (d[i]==17){
            k[i][j]=Math.log1p(Math.abs(3/4+x[j]));
            }
            else if ((d[i]==5)||(d[i]==9)||(d[i]==11)||d[i]==15){
                k[i][j]=Math.atan(Math.exp(Math.cbrt(-Math.abs(x[j]))));
            }
            else  k[i][j]=Math.log1p(Math.pow(Math.exp(Math.tan(Math.pow(x[j]+1,3)))/2,2));
            System.out.print(Math.round(k[i][j]*100.0)/100.0+"  ");
            }
        System.out.println();
    }
    }
}
