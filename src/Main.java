import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       double sum=0;
       int count=0;
       boolean n=false;

       double[] nubers=new double[15];
       nubers[0]=4.5;
       nubers[1]=-3;
       nubers[2]=2.3;
       nubers[3]=1.2;
       nubers[4]=-6;
       nubers[5]=7.6;
       nubers[6]=-5.8;
       nubers[7]=-7.9;
       nubers[8]=9.2;
       nubers[10]=3.3;
       nubers[11]=-1;
       nubers[12]=8.5;
       nubers[13]=4.5;
       nubers[14]=-3.5;
       for (double num:nubers) {
          System.out.println(num);
          if(num<0){
             n=true;
          }
          else if (num>0&&n==true){
             sum+=num;
             count++;
          }
       } System.out.println(sum/count);
    }
}