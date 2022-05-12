/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author sb
 */
public class Main {

    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        // B u g ü n        h a v a             ç  o  k            g  ü   z   e   l
        // 1 2 3 4 5   6    7 8 9 10   11   12 13 14   15   16 17 18 19 20
        // 0 1 2 3 4   5    6 7 8  9    10   11 12 13   14   15 16 17 18 19
        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("15. Eleman : " + mesaj.charAt(15));
        System.out.println(mesaj.concat(" mi acaba"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("k"));

        char[] karakterler = new char[mesaj.length()];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("hava"));
        System.out.println(mesaj.indexOf("ü"));
        System.out.println(mesaj.lastIndexOf("ü"));

        String yeniMesaj = (mesaj.replace("güzel", "kötü"));
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(6));
        System.out.println(mesaj.substring(6, 14));

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        
        String mesaj1 = "         Bugün hava çok güzel        ";
        System.out.println(mesaj1.trim());
  
    }

}
