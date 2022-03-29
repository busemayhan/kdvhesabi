package Giris;
import java.util.Scanner;
public class KdvHesap {
    public static void main(String[]args)  {
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
          //  tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
    int tutar;
    Scanner input= new Scanner(System.in);
    System.out.print("tutar giriniz: ");
    tutar=input.nextInt();
    double kdvtutari;
    if (tutar<1000){
    kdvtutari=tutar *0.18;
    System.out.println("kdv tutari:" + kdvtutari);
    double kdvlitutar;
    kdvlitutar = tutar+(tutar *0.18);
    System.out.print("kdvli tutar: "+ kdvlitutar);}
    else{
        kdvtutari=tutar *0.08;
        System.out.println("kdv tutari:" + kdvtutari);
        double kdvlitutar;
        kdvlitutar = tutar+(tutar *0.08);
        System.out.print("kdvli tutar: "+ kdvlitutar);}




    }

}
