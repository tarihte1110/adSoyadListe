import java.util.Arrays;
import java.util.Scanner;
public class adSoyadListe {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Kaç kişi gireceksiniz?");
        int numb= input.nextInt();

        String[] dizi=new String[numb];

        for(int a=0;a<numb;a++){
            System.out.println(a+1+"."+" KİŞİ");
            System.out.print("Adınız:");
            String name1= input.next();
            System.out.print("Soyadınız:");
            String name2= input.next();

            String isimSoyisim=adSoyad(name1,name2);
            System.out.println("# "+isimSoyisim+" #");
            System.out.println("------");

            dizi[a]=isimSoyisim;
        }

        System.out.println("* GİRİLEN İSİMLER *");
        System.out.println(Arrays.toString(dizi));
    }
    public static String adSoyad(String isim,String soyisim){
        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+
        isim.substring(1).toLowerCase();
        String soyisimDuzenlenmis=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();
        return isimDuzenlenmis+" "+soyisimDuzenlenmis;
    }
}
