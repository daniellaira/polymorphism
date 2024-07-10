/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorphism;

/**
 *
 * @author HP PAVILION
 */
public class Shape {
     public void draw() {}
  public void erase() {}
    private static RandomShapeGenerator gen = 
            new RandomShapeGenerator();
  public static void main(String[] args)
  {
    Shape shapepesan = new Shape();
    shapepesan.pesan();
    
    Square squarepesan = new Square();
    squarepesan.pesan();
    
    Triangle trianglepesan = new Triangle();
    trianglepesan.pesan();
    
    Cycle ridecycle = new Cycle();
    ridecycle.ride();
    
    Shape[] s = new Shape[9];
    for(int i = 0; i < s. length; i++)
        s[i] = gen.next();
    for(Shape shp : s)
        shp.draw();
  }
 
  public void pesan()
  {
      System.out.println("pemanggilan dari shape");
  }
  }
