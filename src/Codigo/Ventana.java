
package Codigo;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta, imagen;
    private JRadioButton rb1, rb2, rb3, rb4;
    
    public Ventana(){
        setSize(700,400);
        setTitle("Ejercicio 2");
        setLocationRelativeTo(null);
        
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarRadioBotones();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null); //Desactivando el diseño del panel
        this.add(panel);
        
    }
    
    private void colocarEtiqueta(){
        etiqueta = new JLabel("Escoja su anime favorito");
        etiqueta.setBounds(20, 10, 250, 40);
        etiqueta.setFont(new Font("Arial",0,18));
        panel.add(etiqueta);
        
    }
    
    private void colocarRadioBotones(){
        rb1 = new JRadioButton("Dragon Ball Z");
        rb1.setBounds(20, 80, 150, 40);
        rb1.setFont(new Font("arial rounded mt bold",0,16));
        panel.add(rb1);
                
        rb2 = new JRadioButton("Evangelion");
        rb2.setBounds(20, 140, 150, 40);
        rb2.setFont(new Font("arial rounded mt bold",0,16));
        panel.add(rb2);
        
        rb3 = new JRadioButton("One Piece");
        rb3.setBounds(20, 200, 150, 40);
        rb3.setFont(new Font("arial rounded mt bold",0,16));
        panel.add(rb3);
        
        rb4 = new JRadioButton("Hero Academy");
        rb4.setBounds(20, 260, 150, 40);
        rb4.setFont(new Font("arial rounded mt bold",0,16));
        panel.add(rb4);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);
        grupo.add(rb4);
        
        eventoDeAccion();
    }
    
    private void eventoDeAccion(){
        imagen = new JLabel();
        imagen.setBounds(300, 50, 220, 300);
        panel.add(imagen);
        
        /*
        ImageIcon imagenDragonBall = new ImageIcon("Imagenes/DragonBall.jpe");  //si lo ponemos asi, estaria bien, PERO al momento de hacer nuestro 
        ejecutable NO nos apareceria nuestras imagenes no las va contener 
        */
        
        //Manera correcta de colocar la imagen, asi ya nos aparece en el ejecutable
        final ImageIcon imagenDragonBall = new ImageIcon(getClass().getResource("/Imagenes/DragonBall.jpe"));
        final ImageIcon imagenOnePiece = new ImageIcon(getClass().getResource("/Imagenes/OnePiece.jpg"));
        final ImageIcon imagenEvangelion = new ImageIcon(getClass().getResource("/Imagenes/evangelion.png"));
        final ImageIcon imagenHeroAcademy = new ImageIcon(getClass().getResource("/Imagenes/heroacademy.jpg"));
        
        
        ActionListener eventoDeAccion1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenDragonBall.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb1.addActionListener(eventoDeAccion1);
        
        
        ActionListener eventoDeAccion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenEvangelion.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb2.addActionListener(eventoDeAccion2);
        
        
        ActionListener eventoDeAccion3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenOnePiece.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb3.addActionListener(eventoDeAccion3);
        
        
        ActionListener eventoDeAccion4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imagen.setIcon(new ImageIcon(imagenHeroAcademy.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
            }
        };
        rb4.addActionListener(eventoDeAccion4);
        
    }
}
