package modelo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
;


public class compruebaBotones {

    BufferedImage imagen = ImageIO.read(new File("src/icono.png"));
    Image image = imagen.getScaledInstance(40,40, Image.SCALE_DEFAULT);
    ImageIcon icono = new ImageIcon(image);

    public compruebaBotones() throws IOException {
    }


    //Icon icono = new ImageIcon(getClass().getResource());
    public void selection(JRadioButton rb1, JRadioButton rb2, JRadioButton rb3, JRadioButton rb4, JRadioButton rb5, JRadioButton rb6) {
        if (rb1.isSelected()) {
            JOptionPane.showConfirmDialog(null, "YES or NO",
                    "YES_NO_OPTION", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

        } else if (rb2.isSelected()) {
            JOptionPane.showConfirmDialog(null, "Aceptar o Cancelar",
                    "OK_CANCEL_OPTION", JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

        } else if (rb3.isSelected()) {
            JOptionPane.showConfirmDialog(null, "Sí, No o Cancelar",
                    "YES_NO_CANCEL_OPTION", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

        } else if (rb4.isSelected()) {
            JOptionPane.showOptionDialog(
                    null,
                    "Seleccione opcion",
                    "Selector de opciones",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,    // null para icono por defecto.
                    new Object[]{"opcion 1", "opcion 2", "opcion 3", "opcion 4"},
                    null);

        } else if (rb5.isSelected()) {
            JOptionPane.showInputDialog(null, "Input dialog",
                    null);

        } else if (rb6.isSelected()) {
            String[] opciones ={"1","2","3"};
            JComboBox jcb = new JComboBox(opciones);
            JOptionPane.showMessageDialog(null, jcb, "ComboBox", JOptionPane.QUESTION_MESSAGE);


        }
    }

    public void selection2(JRadioButton radio1, JRadioButton radio2, JRadioButton radio3, JRadioButton radio4, JRadioButton radio5, JRadioButton radio6, JRadioButton radio7) {
        if (radio1.isSelected()) {
            JOptionPane.showMessageDialog(null, "Icono y mensaje por defecto",
                    "Icono y mensaje por defecto", JOptionPane.INFORMATION_MESSAGE);

        } else if (radio2.isSelected()) {
            JOptionPane.showMessageDialog(null, "Mensaje sin icono",
                    "Mensaje sin icono", JOptionPane.PLAIN_MESSAGE);

        } else if (radio3.isSelected()) {
            JOptionPane.showMessageDialog(null, "Icono de Warning",
                    "Icono de Warning", JOptionPane.WARNING_MESSAGE);

        } else if (radio4.isSelected()) {
            JOptionPane.showMessageDialog(null, "Icono de error", "Mensaje con icono de error",
                    JOptionPane.ERROR_MESSAGE);

        } else if (radio5.isSelected()) {
            JOptionPane.showMessageDialog(null, "Icono de información", "Mensaje con icono de información",
                    JOptionPane.INFORMATION_MESSAGE);

        } else if (radio6.isSelected()) {
            JOptionPane.showMessageDialog(null, "Icono de pregunta", "Mensaje con icono de pregunta",
                    JOptionPane.QUESTION_MESSAGE);


        } else if (radio7.isSelected()) {
            JOptionPane.showMessageDialog(null, "Icono personalizado", "Mensaje con icono personalizado",
                    JOptionPane.PLAIN_MESSAGE, icono);

        }
    }
}
