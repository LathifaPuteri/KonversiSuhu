/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Konversi Suhu");
        System.out.println("---------------------------------------");
        Scanner inputUser;
        //input suhu celcius
        inputUser = new Scanner(System.in);
        float c, hasil;
        String suhu;
        System.out.println("Masukkan Suhu Dalam Celcius = ");
        c = inputUser.nextFloat();
        System.out.println("Masukkan ffffffffSuhu Yang Dinginkan = ");
        suhu = inputUser.next();
        //pilihan
        switch (suhu){
            case "Farenhit":
                //farenhit
                hasil = (c * 9/5) + 32;
                System.out.println(c+"°C* 9/5* ="+hasil+"°F°");
                break;
            case "Kelvin":
                //kelvin
                hasil = (c + 273);
                System.out.println(c+"°C+273* ="+hasil+"K°");
                break;
            case "Reamur":
                //reamur
                hasil = (c * 4/5);
                System.out.println(c+"°C* 4/5* ="+hasil+"°R°");
                break;
        }
    }
    
}
