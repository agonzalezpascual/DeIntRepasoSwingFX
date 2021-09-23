


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GUI {

        public static void main(String[] args){

            try {
                UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
            } catch (Exception ex) {
                System.err.println("Failed to initialize LaF");
            }

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
            panelslider.setLayout(new FlowLayout(10,90,2));
            JSlider slider = new JSlider(0,30);
            JTextArea texto = new JTextArea();
            texto.setText("15");


            panelslider.add(slider);
            norte.add(panelslider);
            norte.add(texto);
            marco.add(norte);



            //Scrollbar
            JPanel paneltxtscroll = new JPanel();
            JPanel panellscroll = new JPanel();
            JLabel txtscroll = new JLabel("ScrollBar");
            paneltxtscroll.add(txtscroll);
            paneltxtscroll.setLayout(new FlowLayout(10,10,2));
            panellscroll.setLayout(new FlowLayout(10,80,2));
            JScrollBar barra = new JScrollBar(0,25,45,0,300);
            barra.setPreferredSize(new Dimension(200,20));
            JTextArea valorbarra = new JTextArea();
            valorbarra.setText("25");
            panellscroll.add(barra);
            paneltxtscroll.add(panellscroll);
            paneltxtscroll.add(valorbarra);
            marco.add(paneltxtscroll);


            barra.addAdjustmentListener(new AdjustmentListener() {
              @Override
              public void adjustmentValueChanged(AdjustmentEvent ae) {
                  String textobarra = barra.getValue() + "";
                  valorbarra.setText(textobarra);
              }
            });


            //Fecha1

            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            System.out.println(formatter.format(calendar.getTime()));


            Date today = new Date();
            //hola
            JPanel paneltxtfecha = new JPanel();
            JPanel panelfecha = new JPanel();
            JLabel txtfecha = new JLabel("Spinner fecha completa");
            paneltxtfecha.add(txtfecha);
            paneltxtfecha.setLayout(new FlowLayout(10,10,2));
            panelfecha.setLayout(new FlowLayout(10,42,2));
            JSpinner Spinnerfecha = new JSpinner(new SpinnerDateModel(today, null, null, Calendar.MONTH));
            JSpinner.DateEditor editor = new JSpinner.DateEditor(Spinnerfecha, "dd/MM/yyyy HH:mm:ss");
            Spinnerfecha.setEditor(editor);


            panelfecha.add(Spinnerfecha);
            paneltxtfecha.add(panelfecha);
            marco.add(paneltxtfecha);


            //Fecha2
            JPanel paneltxtfecha2 = new JPanel();
            JPanel panelfecha2 = new JPanel();
            JLabel txtfecha2 = new JLabel("Spinner fecha desglosada");
            paneltxtfecha2.add(txtfecha2);
            paneltxtfecha2.setLayout(new FlowLayout(10,10,2));
            panelfecha2.setLayout(new FlowLayout(10,30,2));
            JSpinner Spinnerfechadia = new JSpinner(new SpinnerDateModel(today, null, null, Calendar.MONTH));
            JSpinner.DateEditor editordia = new JSpinner.DateEditor(Spinnerfechadia, "dd");
            Spinnerfechadia.setEditor(editordia);
            JSpinner Spinnerfechames = new JSpinner(new SpinnerDateModel(today, null, null, Calendar.MONTH));
            JSpinner.DateEditor editormes = new JSpinner.DateEditor(Spinnerfechames, "MMMM");
            Spinnerfechames.setEditor(editormes);
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
            texto.setVisible(true);
            valorbarra.setVisible(true);

            slider.addChangeListener(new ChangeListener(){
                public void stateChanged(ChangeEvent e) {
                    String sleepSense = slider.getValue() + "";
                    texto.setText(sleepSense);
                }});


        }


}
