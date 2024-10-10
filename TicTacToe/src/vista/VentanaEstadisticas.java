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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaEstadisticas extends JFrame {
    private JLabel jlMensaje;
    private JLabel jlMensaje1;
    private JLabel jlMensaje2;
    private JLabel jlMensaje3;
    private JPanel jpContenido;   
    private JButton btnJugar; 
    private JButton btnInstrucciones;
    private JLabel lblFondo;
    private JLabel lblTitulo;
    private String nombreJugador;
    private String nombreJugador1;
    private String nombreJugador2;
    private int scorePlayer1;
    private int scorePlayer2;
    private int numeroRounds;
    private String nombreGanador;
    
    public VentanaEstadisticas(String ganador,Jugador jugador1, Jugador jugador2, int modo, int score1, int score2){
        nombreGanador = ganador;
        nombreJugador1 = jugador1.getNombre();
        nombreJugador2 = jugador2.getNombre();
        scorePlayer1 = score1;
        scorePlayer2 = score2;
        System.out.println(numeroRounds);
        iniciarComponentes();
        jpContenido.revalidate();
        jpContenido.repaint(); 
    }
    
     
    
    private void iniciarComponentes() {
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
        
        jlMensaje = new JLabel("El ganador es : "  + nombreGanador);
        jlMensaje.setBounds(120,-30, 700,500);
        jlMensaje.setForeground(Color.WHITE);
        jlMensaje.setFont(fDialog);
        jpContenido.add(jlMensaje);
        
        jlMensaje1 = new JLabel("Puntaje del jugador 1 : "  + scorePlayer1);
        jlMensaje1.setBounds(120,0, 700,500);
        jlMensaje1.setForeground(Color.WHITE);
        jlMensaje1.setFont(fDialog);
        jpContenido.add(jlMensaje1);
        
        jlMensaje2 = new JLabel("Puntaje del jugador 2 : "  + scorePlayer2);
        jlMensaje2.setBounds(120,30, 700,500);
        jlMensaje2.setForeground(Color.WHITE);
        jlMensaje2.setFont(fDialog);
        jpContenido.add(jlMensaje2);
        
        ImageIcon titulo = new ImageIcon("img/titulo.png");
        lblTitulo = new JLabel();
        lblTitulo.setBounds(40,-120, 700,500);
        lblTitulo.setIcon(titulo);
        jpContenido.add(lblTitulo);
             
        
        ImageIcon fondo = new ImageIcon("img/fondo.jpg");
        lblFondo = new JLabel();  
        lblFondo.setBounds(0, 0, 700, 500);
        lblFondo.setIcon(fondo);
        jpContenido.add(lblFondo);
    }
}
