/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana caranya menampilkan waktu sekarang
 */
public class PBO210118067Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Hari ini adalah hari : ");
        SimpleDateFormat df = new SimpleDateFormat ("EEEE, dd MMMM YYYY "
                + "HH:mm:ss");
        System.out.println(df.format(new Date()));
    }
    
}
