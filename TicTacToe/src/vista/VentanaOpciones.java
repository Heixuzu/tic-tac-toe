/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Jugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author jhon
 */
public class VentanaOpciones extends JFrame {

    private JLabel jlMensaje;
    private JLabel jlMensaje2;
    private JPanel jpContenido;   
    private JButton btnModo1; 
    private JButton btnModo2;
    private JButton btnRondas1; 
    private JButton btnRondas2;
    private JButton btnRondas3; 
    private JButton btnRondas4;
    private JLabel lblFondo;
    private JLabel lblTitulo;
    private int numeroRounds;
    private int modoJuego;
    private ImageIcon numeros[], numerosAlt[];
    
    public VentanaOpciones(){
        iniciarComponentes();
        numeros = new ImageIcon[4];
        numerosAlt = new ImageIcon[4];
        
        numeros[0] = new ImageIcon("img/Numeros/1.png");
        numeros[1] = new ImageIcon("img/Numeros/2.png");
        numeros[2] = new ImageIcon("img/Numeros/3.png");
        numeros[3] = new ImageIcon("img/Numeros/4.png");
        
        numerosAlt[0] = new ImageIcon("img/Numeros/1 alt.png");
        numerosAlt[1] = new ImageIcon("img/Numeros/2 alt.png");
        numerosAlt[2] = new ImageIcon("img/Numeros/3 alt.png");
        numerosAlt[3] = new ImageIcon("img/Numeros/4 alt.png"); 
    }
    
    private void  imgNormal(int index, JButton boton){
        ImageIcon colocarImagen = numeros[index];
        boton.setIcon(new ImageIcon(colocarImagen.getImage().getScaledInstance(
                boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    public void imgAlt(int index, JButton boton){
                ImageIcon colocarImagen = numerosAlt[index];
        boton.setIcon(new ImageIcon(colocarImagen.getImage().getScaledInstance(
                boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    private void iniciarComponentes() {
        setTitle("TicTacToe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,500);
        setLocationRelativeTo(null);
        setVisible(true);
        setBackground(Color.magenta);
        setResizable(false);
        setLayout(null);
        
        jpContenido = new JPanel();
        jpContenido.setSize(700,500);        
        jpContenido.setBounds(0,0, 700, 500);
        jpContenido.setLayout(null);
        jpContenido.setBackground(Color.magenta);
        add(jpContenido);
        
        ImageIcon titulo = new ImageIcon("img/titulo.png");
        lblTitulo = new JLabel();
        lblTitulo.setBounds(180,-150, 700,500);
        lblTitulo.setIcon(new ImageIcon(titulo.getImage().getScaledInstance(320, 65, Image.SCALE_SMOOTH)));
        jpContenido.add(lblTitulo);
        
        jlMensaje = new JLabel("Por favor, seleccione un modo de juego");
        jlMensaje.setBounds(150,-100, 700,500);
        jlMensaje.setForeground(Color.WHITE);
        jlMensaje.setFont(new Font("arial", Font.BOLD, 20));
        jpContenido.add(jlMensaje);
        
        ImageIcon Modo1 = new ImageIcon("img/modo1.png");    
        btnModo1 = new JButton();
        btnModo1.setBounds(230,180, 80,80);
        btnModo1.setIcon(new ImageIcon(Modo1.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH)));
        //btnModo1.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnModo1);
        
        ImageIcon Modo2 = new ImageIcon("img/modo2.png");
        btnModo2 = new JButton();
        btnModo2.setBounds(360,180, 80,80);
        btnModo2.setIcon(new ImageIcon(Modo2.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH)));
        //btnModo2.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnModo2);
        
        jlMensaje2 = new JLabel("Por favor, seleccione un número de rondas");
        jlMensaje2.setBounds(130,40, 700,500);
        jlMensaje2.setForeground(Color.WHITE);
        jlMensaje2.setFont(new Font("arial", Font.BOLD, 20));
        jpContenido.add(jlMensaje2);
        
        ImageIcon img1 = new ImageIcon("img/Numeros/1.png");
        btnRondas1 = new JButton("1");
        btnRondas1.setBounds(120,310, 108,85);
        btnRondas1.setOpaque(false);
        btnRondas1.setContentAreaFilled(false);
        btnRondas1.setBorderPainted(false);
        btnRondas1.setFocusPainted(false);
        btnRondas1.setIcon(new ImageIcon(img1.getImage().getScaledInstance(btnRondas1.getWidth(),
                btnRondas1.getHeight(), Image.SCALE_SMOOTH)));
        btnRondas1.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnRondas1);
        
        ImageIcon img2 = new ImageIcon("img/Numeros/2.png");
        btnRondas2 = new JButton("2");
        btnRondas2.setBounds(240,310, 108,85);
        btnRondas2.setOpaque(false);
        btnRondas2.setContentAreaFilled(false);
        btnRondas2.setBorderPainted(false);
        btnRondas2.setFocusPainted(false);
        btnRondas2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(btnRondas2.getWidth(),
                btnRondas2.getHeight(), Image.SCALE_SMOOTH)));
        btnRondas2.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnRondas2);
        
        ImageIcon img3 = new ImageIcon("img/Numeros/3.png");
        btnRondas3 = new JButton("3");
        btnRondas3.setBounds(360,310, 108,85);
        btnRondas3.setOpaque(false);
        btnRondas3.setContentAreaFilled(false);
        btnRondas3.setBorderPainted(false);
        btnRondas3.setFocusPainted(false);
        btnRondas3.setIcon(new ImageIcon(img3.getImage().getScaledInstance(btnRondas3.getWidth(),
                btnRondas3.getHeight(), Image.SCALE_SMOOTH)));
        btnRondas3.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnRondas3);
        
        ImageIcon img4 = new ImageIcon("img/Numeros/4.png");
        btnRondas4 = new JButton("4");
        btnRondas4.setBounds(470,310, 108,85);
        btnRondas4.setOpaque(false);
        btnRondas4.setContentAreaFilled(false);
        btnRondas4.setBorderPainted(false);
        btnRondas4.setFocusPainted(false);
        btnRondas4.setIcon(new ImageIcon(img4.getImage().getScaledInstance(btnRondas4.getWidth(),
                btnRondas4.getHeight(), Image.SCALE_SMOOTH)));
        btnRondas4.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnRondas4);
        
        ImageIcon fondo = new ImageIcon("img/fondo.jpg");
        lblFondo = new JLabel();  
        lblFondo.setBounds(0, 0, 700, 500);
        lblFondo.setIcon(fondo);
        jpContenido.add(lblFondo);
        
        ManejadorDeModos manejadorModos = new ManejadorDeModos();
        ManejadorDeRondas manejadorRondas = new ManejadorDeRondas();
        
        
        btnModo1.addActionListener(manejadorModos);
        btnModo2.addActionListener(manejadorModos);
        btnRondas1.addActionListener(manejadorRondas);
        btnRondas2.addActionListener(manejadorRondas);
        btnRondas3.addActionListener(manejadorRondas);
        btnRondas4.addActionListener(manejadorRondas);
        
        
    }
    
    private void ObtenerNombres() {
        if (modoJuego == 1) {
            VentanaNombres ventana = new VentanaNombres(modoJuego, numeroRounds);
            dispose();
        } else if (modoJuego == 2) {
            VentanaNombres ventana = new VentanaNombres(modoJuego, numeroRounds);
            dispose();
        }
    }
    
    
    
    class ManejadoraDeMouse extends MouseAdapter{
        
        @Override
        public void mouseEntered(MouseEvent evento) {
            if(evento.getSource() == btnRondas1){
                imgAlt(0, btnRondas1);
            }
            if(evento.getSource() == btnRondas2){
                imgAlt(1, btnRondas2);
            }
            if(evento.getSource() == btnRondas3){
                imgAlt(2, btnRondas3);
            }
            if(evento.getSource() == btnRondas4){
                imgAlt(3, btnRondas4);
            }     
        }
            
        @Override
        public void mouseExited(MouseEvent evento) {
            if(evento.getSource() == btnRondas1){
                imgNormal(0, btnRondas1);
            }
            if(evento.getSource() == btnRondas2){
                imgNormal(1, btnRondas2);
            }
            if(evento.getSource() == btnRondas3){
                imgNormal(2, btnRondas3);
            }
            if(evento.getSource() == btnRondas4){
                imgNormal(3, btnRondas4);
            }     
        }
        
        @Override
        public void mousePressed(MouseEvent evento){
            if(evento.getSource() == btnRondas1){
                if (evento.getButton() == 1){
                    imgNormal(0, btnRondas1);
                } else{
                    evento.consume();
                }
            }
            if(evento.getSource() == btnRondas2){
                if (evento.getButton() == 1){
                    imgNormal(1, btnRondas2);
                } else{
                    evento.consume();
                }
            }
            if(evento.getSource() == btnRondas3){
                if (evento.getButton() == 1){
                    imgNormal(2, btnRondas3);
                } else{
                    evento.consume();
                }
            }
            if(evento.getSource() == btnRondas4){
                if (evento.getButton() == 1){
                    imgNormal(3, btnRondas4);
                } else{
                    evento.consume();
                }
            }
        }
        
    }
  
    
    class ManejadorDeRondas implements ActionListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnRondas1){                
               numeroRounds = 0;
               ObtenerNombres();
            } 
            if (evento.getSource() == btnRondas2) {
               numeroRounds = 1;
               ObtenerNombres();
            }          
            if (evento.getSource() == btnRondas3){
               numeroRounds = 2;
               ObtenerNombres();
            }
            if (evento.getSource() == btnRondas4){
               numeroRounds = 3;
               ObtenerNombres();
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
        class ManejadorDeModos implements ActionListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnModo1){                
               modoJuego = 1;
               System.out.println(modoJuego);
            } else if (evento.getSource() == btnModo2) {
               modoJuego = 2;
            }
        }
        
        

        @Override
        public void keyTyped(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        }
    }

