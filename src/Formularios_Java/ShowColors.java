package Formularios_Java;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;



public class ShowColors extends JFrame {
    
    public ShowColors(){
        
        super( "Colores en Ventana" );
        
        setSize( 800, 600 );
        setVisible ( true );
    }
    
    public void paint ( Graphics g ){
        
        super.paint( g );
        
        g.setColor ( new Color ( 255, 0, 0) );
        g.fillRect( 25, 25, 100, 20 );
        g.drawString( "Current RGB: " + g.getColor(), 130, 40 );
        
        g.setColor ( new Color ( 0, 255, 0) );
        g.fillRect( 25, 50, 100, 20 );
        g.drawString( "Current RGB: " + g.getColor(), 130, 65 );
        
        g.setColor ( new Color ( 0, 0, 255) );
        g.fillRect( 25, 75, 100, 20 );
        g.drawString( "Current RGB: " + g.getColor(), 130, 90 );
        
        g.setColor ( new Color ( 255, 0, 255) );
        g.fillRect( 25, 100, 100, 20 );
        g.drawString( "Current RGB: " + g.getColor(), 130, 115 );
        
        g.setColor(Color.BLACK);
        g.fillOval(25, 125, 100, 100);
        
        g.setColor(Color.BLUE);
        g.drawRect(25, 235, 100, 100);
        
        g.setColor(Color.YELLOW);
        g.drawRect(25, 345, 100, 100);
        
        g.setColor(Color.BLUE);
        g.fillRect(135, 235, 100, 100);
        
        g.setColor(Color.YELLOW);
        g.fillRect(135, 345, 100, 100);
    
        g.setColor(Color.MAGENTA);
        g.fillRoundRect(345, 235, 100, 100, 50, 50);
        
        g.setColor(Color.MAGENTA);
        g.drawRoundRect(455, 235, 100, 100, 50, 50);
        
        g.setColor(Color.PINK);
        g.drawOval(WIDTH, WIDTH, WIDTH, HEIGHT);
    }
    
    public static void main(String[] args) {
        
        ShowColors application = new ShowColors();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}