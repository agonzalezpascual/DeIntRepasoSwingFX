package Vista;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            System.out.println(formatter.format(calendar.getTime()));


            Date today = new Date();
            JPanel paneltxtfecha = new JPanel();
            JPanel panelfecha = new JPanel();
            JLabel txtfecha = new JLabel("Spinner");
            paneltxtfecha.add(txtfecha);
            paneltxtfecha.setLayout(new FlowLayout(10,10,2));
            panelfecha.setLayout(new FlowLayout(10,100,2));
            JSpinner Spinnerfecha = new JSpinner(new SpinnerDateModel(today, null, null, Calendar.MONTH));
            JSpinner.DateEditor editor = new JSpinner.DateEditor(Spinnerfecha, "dd/MM/yyyy HH:mm:ss");
            Spinnerfecha.setEditor(editor);


            panelfecha.add(Spinnerfecha);
            paneltxtfecha.add(panelfecha);
            marco.add(paneltxtfecha);


            //Fecha2
            JPanel paneltxtfecha2 = new JPanel();
            JPanel panelfecha2 = new JPanel();
            JLabel txtfecha2 = new JLabel("Spinner");
            paneltxtfecha2.add(txtfecha2);
            paneltxtfecha2.setLayout(new FlowLayout(10,10,2));
            panelfecha2.setLayout(new FlowLayout(10,50,2));
            JSpinner Spinnerfechadia = new JSpinner(new SpinnerDateModel(today, null, null, Calendar.MONTH));
            JSpinner.DateEditor editordia = new JSpinner.DateEditor(Spinnerfechadia, "dd");
            Spinnerfechadia.setEditor(editordia);
            JSpinner Spinnerfechames = new JSpinner();
            Spinnerfechames.setValue(30);
            JSpinner Spinnerfechaano = new JSpinner(new SpinnerDateModel(today, null, null, Calendar.MONTH));
            JSpinner.DateEditor editorano = new JSpinner.DateEditor(Spinnerfechaano, "yyyy");
            Spinnerfechaano.setEditor(editorano);


            panelfecha2.add(Spinnerfechadia);
            panelfecha2.add(Spinnerfechames);
            panelfecha2.add(Spinnerfechaano);
            paneltxtfecha2.add(panelfecha2);
            marco.add(paneltxtfecha2);





            marco.setVisible(true);
            norte.setVisible(true);
            txtslider.setVisible(true);
            slider.setVisible(true);
            barra.setVisible(true);
            paneltxtscroll.setVisible(true);
            Spinnerfechaano.setVisible(true);


        }


}
