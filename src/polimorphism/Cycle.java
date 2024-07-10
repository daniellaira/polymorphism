/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorphism;

/**
 *
 * @author HP PAVILION
 */
public class Cycle extends Circle{
   // mobil
    public int wheels = 4;
    public int wheel(){
        return wheels;
    }
    public void ride(){
        System.out.println("Memiliki roda : " + wheels);
    }
}
