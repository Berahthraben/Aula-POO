package aula2;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane.*;
import java.awt.image.BufferedImage;
import java.awt.*;

public class Aula2 {

    public static void main(String[] args) {
      Carro carro1 = new Carro("Azul escuro metalico", 2013, 32055, 43200, "DogãoCar");
      Carro carro2 = new Carro("prata", 2006, 89233, 23900, "DogãoCar");
      Carro carro3 = new Carro("Preto fosco", 2013, 19631, 139800, "DogãoCar");
      carro1.show(1);
      carro2.show(2);
      carro3.show(3);
      System.exit(0);
    }
}
