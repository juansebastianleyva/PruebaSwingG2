package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	 private BufferedImage image;
	 public MyPanel(String imagePath) {
	        try {
	            image = ImageIO.read(new File(imagePath));
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	 @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	       /* if (image != null) {
	            g.drawImage(image, 0, 0, this); // dibuja la imagen en las coordenadas (0,0)
	        }*/
            
            // Cuerpo del Funko Pop
            g.setColor(Color.BLUE);
            g.fillRect(150, 200, 100, 100);
            
            // Cabeza del Funko Pop
            g.setColor(Color.PINK);
            g.fillOval(100, 50, 200, 200);

            // Ojos
            g.setColor(Color.WHITE);
            g.fillOval(140, 120, 40, 40);
            g.fillOval(220, 120, 40, 40);

            // Pupilas
            g.setColor(Color.BLACK);
            g.fillOval(160, 140, 10, 10);
            g.fillOval(240, 140, 10, 10);
            
            // Nariz
            g.setColor(Color.BLACK);
            g.fillOval(195, 170, 10, 10);
            
            // Boca
            g.setColor(Color.RED);
            g.drawArc(170, 190, 60, 30, 0, -180);
	    }
}
