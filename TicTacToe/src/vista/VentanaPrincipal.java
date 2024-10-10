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
public class VentanaPrincipal extends JFrame {

    private JLabel jlMensaje;
    private JPanel jpContenido;   
    private JButton btnJugar; 
    private JButton btnInstrucciones;
    private JLabel lblFondo;
    private JLabel lblTitulo;
    
    public VentanaPrincipal(){
        iniciarComponentes();
        jpContenido.revalidate();
        jpContenido.repaint(); 
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
        lblTitulo.setBounds(40,-120, 700,500);
        lblTitulo.setIcon(titulo);
        jpContenido.add(lblTitulo);
        
        ImageIcon Jugar = new ImageIcon("img/Jugar.png");
        btnJugar = new JButton("Jugar");
        btnJugar.setBounds(250,220, 176,104);
        btnJugar.setOpaque(false);
        btnJugar.setContentAreaFilled(false);
        btnJugar.setBorderPainted(false);
        btnJugar.setFocusPainted(false);
        btnJugar.setIcon(new ImageIcon(Jugar.getImage().getScaledInstance(btnJugar.getWidth(),
                btnJugar.getHeight(), Image.SCALE_SMOOTH)));
        btnJugar.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnJugar);
        
        
   

        ImageIcon Instrucciones = new ImageIcon("img/Instrucciones.png");
        btnInstrucciones = new JButton("Instrucciones");
        btnInstrucciones.setBounds(225,340, 230,104);
        btnInstrucciones.setOpaque(false);
        btnInstrucciones.setContentAreaFilled(false);
        btnInstrucciones.setBorderPainted(false);
        btnInstrucciones.setFocusPainted(false);
        btnInstrucciones.setIcon(new ImageIcon(Instrucciones.getImage().getScaledInstance(btnInstrucciones.getWidth(),
                btnInstrucciones.getHeight(), Image.SCALE_SMOOTH)));
        btnInstrucciones.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnInstrucciones);
        
        ImageIcon fondo = new ImageIcon("img/fondo.jpg");
        lblFondo = new JLabel();  
        lblFondo.setBounds(0, 0, 700, 500);
        lblFondo.setIcon(fondo);
        jpContenido.add(lblFondo);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnJugar.addActionListener(manejadorEventos);
        btnInstrucciones.addActionListener(manejadorEventos);
        
        
    }
    
    //alterna a la otra versión del botón de moneda
    public void JugarAlt(){
        ImageIcon jugarAlt = new ImageIcon("img/Jugar2.png");
        btnJugar.setIcon(new ImageIcon(jugarAlt.getImage().getScaledInstance(
                btnJugar.getWidth(), btnJugar.getHeight(), Image.SCALE_SMOOTH)));
    }

    public void JugarNormal(){
        ImageIcon jugarAlt = new ImageIcon("img/Jugar.png");
        btnJugar.setIcon(new ImageIcon(jugarAlt.getImage().getScaledInstance(
                btnJugar.getWidth(), btnJugar.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    public void InstruccionesAlt(){
        ImageIcon InstruccionesAlt = new ImageIcon("img/Instrucciones2.png");
        btnInstrucciones.setIcon(new ImageIcon(InstruccionesAlt.getImage().getScaledInstance(
                btnInstrucciones.getWidth(), btnInstrucciones.getHeight(), Image.SCALE_SMOOTH)));
    }

    public void InstruccionesNormal(){
        ImageIcon InstruccionesNormal = new ImageIcon("img/Instrucciones.png");
        btnInstrucciones.setIcon(new ImageIcon(InstruccionesNormal.getImage().getScaledInstance(
                btnInstrucciones.getWidth(), btnInstrucciones.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    
    class ManejadoraDeMouse extends MouseAdapter{
        
        @Override
        public void mouseEntered(MouseEvent evento) {
            if(evento.getSource() == btnJugar){
                JugarAlt();
            }
            else if(evento.getSource() == btnInstrucciones){
                InstruccionesAlt();
            }
        }
            
        @Override
        public void mouseExited(MouseEvent evento) {
            if(evento.getSource() == btnJugar){
                JugarNormal();
            }
            else if(evento.getSource() == btnInstrucciones){
                InstruccionesNormal();
            }
        }
        
        @Override
        public void mousePressed(MouseEvent evento){
            if(evento.getSource() == btnJugar){
                if (evento.getButton() == 1){
                    JugarNormal();
                } else{
                    evento.consume();
                }
            }
            if(evento.getSource() == btnInstrucciones | evento.getSource() == btnInstrucciones){
                if (evento.getButton() == 1){
                    InstruccionesNormal();
                } else{
                    evento.consume();
                } 
            }
        }
        
        
        @Override
        public void mouseReleased(MouseEvent evento){
            if(evento.getSource() == btnJugar){
                if (evento.getButton() == 1){
                    JugarAlt();
                } else{
                    evento.consume();
                }
            }
        }
    }
   
    
    
    class ManejadorDeEventos implements ActionListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            if(evento.getSource() == btnJugar){                
               VentanaOpciones ventana = new VentanaOpciones();
               dispose();
            } else if (evento.getSource() == btnInstrucciones) {
               JOptionPane.showMessageDialog(null, "El clásico Triqui", "Instrucciones", JOptionPane.PLAIN_MESSAGE);
            }
        }
        
       
        
        
        @Override
        public void keyReleased(KeyEvent evento) {
           /* System.out.println("Se liberó la tecla " + evento.getKeyChar() +
                    " Con codigo " + evento.getKeyCode());*/
            //if(evento.getKeyCode() == evento.VK_ENTER){
               // btnJugar.doClick();
            //}
        }
        
        @Override
        public void keyPressed(KeyEvent evento) {
            /*System.out.println("Se presionó la tecla " + evento.getKeyChar()+
                    " Con codigo " + evento.getKeyCode());*/
            
        }
        
        @Override
        public void keyTyped(KeyEvent evento) {
            /*System.out.println("Se digitó la tecla " + evento.getKeyChar()+
                    " Con codigo " + evento.getKeyCode());*/
        }
    }
}
