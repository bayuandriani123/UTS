/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

import java.util.Scanner;
public class Bmi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println("masukan berat :");
        berat = input.nextInt();
        System.out.println("masukan tinggi");
        tinggi = input.nextInt();
        tinggi/=100;
        bmi=berat/(tinggi*tinggi);
        System.out.println("bmi anda adalah"+bmi);
        
        if(bmi <16){
            System.out.println("bandan anda kurang gizi");
        }
        else if(bmi<24){
            System.out.println("badan anda normal");
        }
        else if(bmi<31){
            System.out.println("badan anda gemuk");
        }
        else  {
            System.out.println("badan anda obesitas");
       
        }
    }
    
}
