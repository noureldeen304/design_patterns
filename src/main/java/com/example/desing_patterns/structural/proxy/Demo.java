package com.example.desing_patterns.structural.proxy;

public class Demo {
    public static void main(String[] args) {
        Image image1 = new ImageProxy("image1.jpg");
        Image image2 = new ImageProxy("image2.jpg");

        // The real image object is loaded and displayed when calling the display()
        // method
        image1.display(); // Output: Loading image: image1.jpg, Displaying image: image1.jpg

        // The real image object is already loaded, so it is directly displayed
        image1.display(); // Output: Displaying image: image1.jpg

        // The real image object is loaded and displayed when calling the display()
        // method
        image2.display(); // Output: Loading image: image2.jpg, Displaying image: image2.jpg
    }
}