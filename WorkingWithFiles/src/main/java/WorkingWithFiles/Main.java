/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sb
 */
public class Main {

    static String pathx;

    public static void main(String[] args) {

        pathx = "D:\\Netbeans\\NetBeansProjects\\BtkAkademi\\WorkingWithFiles\\src\\main\\java\\Files\\student.txt";
        createFile(pathx);
        getFileInfo(pathx);
        read(pathx);
        writeToFile(pathx);
    }

    public static void createFile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("student.txt oluşturuldu");
            } catch (IOException ex) {
                System.out.println("student.txt oluşturulmadı");
            }
        } else {
            System.out.println("student.txt zaten var");
        }
    }

    public static void getFileInfo(String path) {

        File file = new File(path);

        System.out.println("Dosya adı : " + file.getName() + "\n"
                + "Dosya yolu : " + file.getAbsolutePath() + "\n"
                + "Dosya yazma yetkisi : " + file.canWrite() + "\n"
                + "Dosya okuma yetkisi : " + file.canRead() + "\n"
                + "Dosya boyutu : " + file.length());
    }

    public static void read(String path) {

        File file = new File(path);
        String line;
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());

        } finally {
            scanner.close();
        }
    }

    public static void writeToFile(String path) {

        String name = " Selçuk";
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));

            writer.write(name);
            writer.newLine();
            System.out.println(name + " Dosyaya eklendi");
            writer.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
