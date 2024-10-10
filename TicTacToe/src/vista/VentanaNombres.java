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
public class VentanaNombres extends JFrame {
    private JLabel jlMensaje;
    private JLabel jlMensaje2;
    private JTextField txtNombre1;
    private JTextField txtNombre2;
    private JPanel jpContenido;   
    private JButton btnJugar;
    private JButton btnAtras;
    private JLabel lblFondo;
    private JLabel lblTitulo;
    private int modoJuego;
    int numeroRounds;
    
    public VentanaNombres(){
    }
       
    public VentanaNombres(int modo,int numeroRondas){
        modoJuego = modo;
        VerificarModo();
        numeroRounds = numeroRondas;
        System.out.println(numeroRounds);
    }
    
    private void VerificarModo () {
        if (modoJuego == 1){
            iniciarComponentesModo1();
        } else if (modoJuego == 2) {
            iniciarComponentesModo2();
        }
    }
    
    private void iniciarComponentesModo1() {
        Font fDialog = new Font(Font.DIALOG_INPUT, Font.BOLD,  20);
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
        
        jlMensaje = new JLabel("Por favor, escriba el nombre del Jugador 1 ");
        jlMensaje.setBounds(100,-100, 700,500);
        jlMensaje.setForeground(Color.WHITE);
        jlMensaje.setFont(fDialog);
        jpContenido.add(jlMensaje);
        
        txtNombre1 = new JTextField("");
        txtNombre1.setHorizontalAlignment(JTextField.CENTER);
        txtNombre1.setForeground(Color.BLACK);
        txtNombre1.setFont(fDialog); 
        txtNombre1.setBounds(150,190,400, 30);
        jpContenido.add(txtNombre1);
               
        jlMensaje2 = new JLabel("Por favor, escriba el nombre del Jugador 2");
        jlMensaje2.setBounds(100,20, 700,500);
        jlMensaje2.setForeground(Color.WHITE);
        jlMensaje2.setFont(fDialog);
        jpContenido.add(jlMensaje2);
        
        txtNombre2 = new JTextField("");
        txtNombre2.setHorizontalAlignment(JTextField.CENTER);
        txtNombre2.setForeground(Color.BLACK);
        txtNombre2.setFont(fDialog); 
        txtNombre2.setBounds(150,310,400, 30);
        jpContenido.add(txtNombre2);
        
        ImageIcon Jugar = new ImageIcon("img/Jugar.png");
        btnJugar = new JButton("Jugar");
        btnJugar.setBounds(350,333, 176,104);
        btnJugar.setOpaque(false);
        btnJugar.setContentAreaFilled(false);
        btnJugar.setBorderPainted(false);
        btnJugar.setFocusPainted(false);
        btnJugar.setIcon(new ImageIcon(Jugar.getImage().getScaledInstance(btnJugar.getWidth(),
                btnJugar.getHeight(), Image.SCALE_SMOOTH)));
        btnJugar.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnJugar);
        
        ImageIcon atras = new ImageIcon("img/atras.png");
        btnAtras = new JButton("Atrás");
        btnAtras.setBounds(170,333, 177,104);
        btnAtras.setOpaque(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setBorderPainted(false);
        btnAtras.setFocusPainted(false);
        btnAtras.setIcon(new ImageIcon(atras.getImage().getScaledInstance(btnAtras.getWidth(),
                btnAtras.getHeight(), Image.SCALE_SMOOTH)));
        btnAtras.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnAtras);
        
        ImageIcon fondo = new ImageIcon("img/fondo.jpg");
        lblFondo = new JLabel();  
        lblFondo.setBounds(0, 0, 700, 500);
        lblFondo.setIcon(fondo);
        jpContenido.add(lblFondo);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnJugar.addActionListener(manejadorEventos);
        btnAtras.addActionListener(manejadorEventos);
        
}
    
    private void iniciarComponentesModo2() {
        Font fDialog = new Font(Font.DIALOG_INPUT, Font.BOLD,  20);
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
        
        jlMensaje = new JLabel("Por favor, escriba el nombre del Jugador ");
        jlMensaje.setBounds(150,-30, 700,500);
        jlMensaje.setForeground(Color.WHITE);
        jlMensaje.setFont(fDialog);
        jpContenido.add(jlMensaje);
        
        txtNombre1 = new JTextField("");
        txtNombre1.setHorizontalAlignment(JTextField.CENTER);
        txtNombre1.setForeground(Color.BLACK);
        txtNombre1.setFont(fDialog); 
        txtNombre1.setBounds(145,250,400, 30);
        jpContenido.add(txtNombre1);
        
        ImageIcon Jugar = new ImageIcon("img/Jugar.png");
        btnJugar = new JButton("Jugar");
        btnJugar.setBounds(350,330, 176,104);
        btnJugar.setOpaque(false);
        btnJugar.setContentAreaFilled(false);
        btnJugar.setBorderPainted(false);
        btnJugar.setFocusPainted(false);
        btnJugar.setIcon(new ImageIcon(Jugar.getImage().getScaledInstance(btnJugar.getWidth(),
                btnJugar.getHeight(), Image.SCALE_SMOOTH)));
        btnJugar.addMouseListener(new ManejadoraDeMouse());
        jpContenido.add(btnJugar);
        
        btnAtras = new JButton("Atrás");
        btnAtras.setBounds(200,370, 120,35);
        jpContenido.add(btnAtras);
        
        ImageIcon fondo = new ImageIcon("img/fondo.jpg");
        lblFondo = new JLabel();  
        lblFondo.setBounds(0, 0, 700, 500);
        lblFondo.setIcon(fondo);
        jpContenido.add(lblFondo);
        
        ManejadorDeEventos manejadorEventos = new ManejadorDeEventos();
        
        btnJugar.addActionListener(manejadorEventos);
        btnAtras.addActionListener(manejadorEventos);
        
}
    
    protected void obtenerNombre(){
        if(modoJuego == 1) {
           String nombre1 =txtNombre1.getText();
           String nombre2 =txtNombre2.getText();
        if((!nombre1.trim().isEmpty() || nombre1.trim().length() > 0) && (!nombre2.trim().isEmpty() || nombre2.trim().length() > 0 )){
            Jugador jugador1 = new Jugador(nombre1);
            Jugador jugador2 = new Jugador(nombre2);
            System.out.println(nombre1);
            System.out.println(nombre2);
            VentanaJuego ventanaJuego = new VentanaJuego(jugador1,jugador2, modoJuego, numeroRounds,0,0);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese el nombre de ambos jugadores", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
        } else if (modoJuego == 2) {
            String nombre =txtNombre1.getText();
            if(!nombre.trim().isEmpty() || nombre.trim().length() > 0 ) {
                Jugador jugador = new Jugador(nombre);
                Jugador pc = new Jugador("El PC");
                System.out.println("PC");
                VentanaJuego ventanaJuego = new VentanaJuego(jugador,pc, modoJuego, numeroRounds,0,0);
                dispose();
            } else {
            JOptionPane.showMessageDialog(null,"Por favor ingrese el nombre del jugador", 
                    "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }
    
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
    
    public void AtrasAlt(){
        ImageIcon atrasAlt = new ImageIcon("img/atras2.png");
        btnAtras.setIcon(new ImageIcon(atrasAlt.getImage().getScaledInstance(
                btnAtras.getWidth(), btnAtras.getHeight(), Image.SCALE_SMOOTH)));
    }

    public void AtrasNormal(){
        ImageIcon atrasAlt = new ImageIcon("img/atras.png");
        btnAtras.setIcon(new ImageIcon(atrasAlt.getImage().getScaledInstance(
                btnAtras.getWidth(), btnAtras.getHeight(), Image.SCALE_SMOOTH)));
    }
    
    
    class ManejadoraDeMouse extends MouseAdapter{
        
        @Override
        public void mouseEntered(MouseEvent evento) {
            if(evento.getSource() == btnJugar){
                JugarAlt();
            }
            if(evento.getSource() == btnAtras){
                AtrasAlt();
            }
        }
            
        @Override
        public void mouseExited(MouseEvent evento) {
            if(evento.getSource() == btnJugar){
                JugarNormal();
            }
            if(evento.getSource() == btnAtras){
                AtrasNormal();
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
            if(evento.getSource() == btnAtras){
                if (evento.getButton() == 1){
                    AtrasNormal();
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
    
    
    class ManejadorDeEventos implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evento){
            if (evento.getSource() == btnJugar) {
                obtenerNombre();
            } 
            else if (evento.getSource() == btnAtras) {
                VentanaOpciones ventana = new VentanaOpciones();
                dispose();
            }
            
        }
    }
}
