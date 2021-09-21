package vista;

import modelo.compruebaBotones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class marquito extends JFrame {

    public static void main(String[] args) throws IOException {

        compruebaBotones CB = new compruebaBotones();

        JFrame marco = new JFrame("Repaso Java Swing 2");
        marco.setSize(350, 350);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout distribucion = new GridLayout(10,1);



        //creación conjunto de pestañas

        JTabbedPane pestañas = new JTabbedPane();

        //Creación de paneles para añadirlos posteriormente a las pestañas
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JRadioButton radio1 = new JRadioButton("Icono y mensaje por defecto");
        JRadioButton radio2 = new JRadioButton("Mensaje sin icono");
        JRadioButton radio3 = new JRadioButton("Icono de warning");
        JRadioButton radio4 = new JRadioButton("Icono de error");
        JRadioButton radio5 = new JRadioButton("Icono de información");
        JRadioButton radio6 = new JRadioButton("Icono de pregunta");
        JRadioButton radio7 = new JRadioButton("Icono personalizado");

        //Creamos los JRadioButton
        JRadioButton rb1 = new JRadioButton("ShowConfirmDialog YES/NO");
        JRadioButton rb2 = new JRadioButton("ShowConfirmDialog con OK/CANCEL");
        JRadioButton rb3 = new JRadioButton("ShowConfirmDialog YES/NO/CANCEL");
        JRadioButton rb4 = new JRadioButton("ShowOptionDialog con cuatro opciones");
        JRadioButton rb5 = new JRadioButton("ShowInputDialog con texto de prueba");
        JRadioButton rb6 = new JRadioButton("ShowInputDialog con combo");

        //Hacemos un grupo de botones para poder seleccionar solo uno
        ButtonGroup grupo = new ButtonGroup();

        //Y los añadimos a panel
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);
        grupo.add(rb4);
        grupo.add(rb5);
        grupo.add(rb6);
        grupo.add(radio1);
        grupo.add(radio2);
        grupo.add(radio3);
        grupo.add(radio4);
        grupo.add(radio5);
        grupo.add(radio6);
        grupo.add(radio7);

        //Boton mostrar y label del resultado
        JButton btnMostrar = new JButton("MOSTRAR");
        JLabel labelResult = new JLabel(" ");
        JButton btnMostrar2 = new JButton("MOSTRAR");
        JLabel labelResult2 = new JLabel(" ");

        //Creamos un tipo de fuente para que queden mas bonitos los label
        Font fuente = new Font("Verdana", 1, 12);

        //Aplicamos los tipos de fuente
        labelResult.setFont(fuente);
        rb1.setFont(fuente);
        rb2.setFont(fuente);
        rb3.setFont(fuente);
        rb4.setFont(fuente);
        rb5.setFont(fuente);
        rb6.setFont(fuente);
        radio1.setFont(fuente);
        radio2.setFont(fuente);
        radio3.setFont(fuente);
        radio4.setFont(fuente);
        radio5.setFont(fuente);
        radio6.setFont(fuente);
        radio7.setFont(fuente);


        //ActionListener del boton mostrar
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelResult.setText("Resultado de la elección");
                CB.selection(rb1, rb2, rb3, rb4, rb5, rb6);
            }

        });

        btnMostrar2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelResult.setText("Resultado de la elección");
                CB.selection2(radio1, radio2, radio3, radio4, radio5, radio6, radio7);
            }

        });



    //Método que gestiona la selección de botones


        panel1.add(radio1);
        panel1.add(radio2);
        panel1.add(radio3);
        panel1.add(radio4);
        panel1.add(radio5);
        panel1.add(radio6);
        panel1.add(radio7);
        panel1.add(btnMostrar2);
        panel1.add(labelResult2);

        panel2.add(rb1);
        panel2.add(rb2);
        panel2.add(rb3);
        panel2.add(rb4);
        panel2.add(rb5);
        panel2.add(rb6);
        panel2.add(btnMostrar);
        panel2.add(labelResult);

        pestañas.addTab("Simples", panel1);
        pestañas.addTab("Complejos", panel2);
        panel1.setLayout(distribucion);
        panel2.setLayout(distribucion);

        marco.add(pestañas);
        marco.setVisible(true);
    }
}
