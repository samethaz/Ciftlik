 
import java.util.Scanner;
 
 
public class Ciftlik {
 
  
    public static void main(String[] args) {
       	int STavuk;
       	int SInek ;
	int SKeci; 
	int SBalik;
	int SMevcut;
	int SBacak;
        Scanner reader = new Scanner(System.in);
        System.out.print("Tavuk Sayısını Giriniz..: ");         
        STavuk = reader.nextInt();
        System.out.print("İnek Sayısını Giriniz...: ");         
        SInek = reader.nextInt();
        System.out.print("Keci Sayısını Giriniz...: ");         
        SKeci = reader.nextInt();
        System.out.print("Balık Sayısını Giriniz..: ");   
        SBalik = reader.nextInt();
 
        SMevcut = STavuk + SKeci + SInek + SBalik;
	SBacak = (STavuk * 2) + (SKeci * 4) + (SInek * 4);


        System.out.println("Hayvanların Mevcudu...: " + SMevcut);
	System.out.println("Bacak Sayısı..........: " + SBacak);
    }
    
}