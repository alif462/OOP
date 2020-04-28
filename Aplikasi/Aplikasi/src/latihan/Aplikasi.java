/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Mualif Dwi Saputra
 */
public class Aplikasi {
    public static void main(String args[]){
        Logger logger = Logger.getLogger("Aplikasi");
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("log/history.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            logger.warning("Tidak dapat membuat / membuka history.log");
        }
        try {
            String nama = args[0];
            int umur = Integer.parseInt(args[1]);
            System.out.println("Nama : " + nama);
            System.out.println("Umur : " + umur );
                 
        } catch (Exception e) {
            logger.warning("error");
        }
    }
}
