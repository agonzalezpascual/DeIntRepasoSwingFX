package Vista;

import javax.swing.*;
import java.awt.*;

public class GUI {

        public static void main(String[] args){

            JFrame marco = new JFrame("Ejercicio Repaso SWING 1");
            marco.setBounds(400,250,500,380);
            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco.setLayout(new GridLayout(4,1,10,2));


            //Slider
            JPanel norte = new JPanel();
            JPanel panelslider = new JPanel();
            JLabel txtslider = new JLabel("Slider");
            norte.add(txtslider);
            norte.setLayout(new FlowLayout(10,10,2));
            panelslider.setLayout(new FlowLayout(10,100,2));
            JSlider slider = new JSlider(0,30);
            panelslider.add(slider);
            norte.add(panelslider);
            marco.add(norte);

            //Scrollbar
            JPanel paneltxtscroll = new JPanel();
            JPanel panellscroll = new JPanel();
            JLabel txtscroll = new JLabel("ScrollBar");
            paneltxtscroll.add(txtscroll);
            paneltxtscroll.setLayout(new FlowLayout(10,10,2));
            panellscroll.setLayout(new FlowLayout(10,100,2));
            JScrollBar barra = new JScrollBar(0,25,200,0,300);
            panellscroll.add(barra);
            paneltxtscroll.add(panellscroll);
            marco.add(paneltxtscroll);

            //Fecha1
            JPanel paneltxtfecha = new JPanel();
            JPanel panelfecha = new JPanel();
            JLabel txtfecha = new JLabel("Spinner");
            paneltxtfecha.add(txtfecha);
            paneltxtfecha.setLayout(new FlowLayout(10,10,2));
            panelfecha.setLayout(new FlowLayout(10,100,2));
            JSpinner Spinnerfecha = new JSpinner();

            panelfecha.add(Spinnerfecha);
            paneltxtfecha.add(panellscroll);
            marco.add(paneltxtfecha);





            marco.setVisible(true);
            norte.setVisible(true);
            txtslider.setVisible(true);
            slider.setVisible(true);
            barra.setVisible(true);
            paneltxtscroll.setVisible(true);


        }


}
