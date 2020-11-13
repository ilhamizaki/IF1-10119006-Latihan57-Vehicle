/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author 
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : class Main Vehicle
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : " + bicycle.getMyBrand());
        System.out.println("Model : " + bicycle.getMyModel());
        System.out.println("Jumlah Gear " + bicycle.getMyGearCount() + "\n");
        
        Skateboard skate = new Skateboard();
        skate.setMyBrand("Ally Skate");
        skate.setMyModel("Rocket");
        skate.setMyBoardLength(54.5);
        System.out.println("Brand : " + skate.getMyBrand());
        System.out.println("Model : " + skate.getMyModel());
        System.out.println("Jumlah Gear " + skate.getMyBoardLength() + "\n");
    }
    
}
