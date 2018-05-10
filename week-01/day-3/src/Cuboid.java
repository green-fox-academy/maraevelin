// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

public class Cuboid {
    public static void main(String [] args) {
        double length = 10;
        double width = 30;
        double height = 20;

        double SurfaceArea = length * width;
        double Volume = length * width * height;

        System.out.println("Surface Area: " + SurfaceArea);
        System.out.println("Volume: " + Volume);
    }
}
