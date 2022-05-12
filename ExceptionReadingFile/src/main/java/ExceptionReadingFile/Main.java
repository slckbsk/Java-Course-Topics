/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionReadingFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author sb
 */
public class Main {

    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        int total = 0;

        try {

            bufferedReader = new BufferedReader(new FileReader("D:\\Netbeans\\NetBeansProjects\\BtkAkademi\\ExceptionReadingFile\\src\\main\\java\\ExceptionReadingFile\\Document.txt"));

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {

                if (line.matches("^\\d+")) {
                //    System.out.println(line + " -> is a number");
                    total += Integer.valueOf(line);
                } else {
                    System.out.println(line + "----is NOT a number, it's not in TOTAL");
                } 
            }

            System.out.println("Toplam : " + total);

        } catch (FileNotFoundException e) {

            System.out.println(e.getMessage());

        } catch (IOException ex) {

            System.out.println(ex.getMessage());

        } finally {

            try {

                bufferedReader.close();

            } catch (IOException ex) {

                System.out.println(ex.getMessage());

            }

        }
    }

}
