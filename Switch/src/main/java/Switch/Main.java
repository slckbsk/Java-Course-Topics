/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

/**
 *
 * @author sb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {

            case 'A':
                System.out.println("MÃœKEMMEL");
                break;
            case 'B':
                System.out.println("Ã‡OK GÃœZEL");
                break;
            case 'C':
                System.out.println("Ä°YÄ°");
                break;
            case 'D':
                System.out.println("ORTA");
                break;
            case 'F':
                System.out.println("KALDINIZ");
                break;
            default:
                System.out.println("GEÃ‡ERSÄ°Z NOT");
                break;
        }

    }

}
