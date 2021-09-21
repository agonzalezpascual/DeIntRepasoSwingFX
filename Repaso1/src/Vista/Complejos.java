import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class complejos {
    public static void main(String[] args) {

        //Creamos el marco principal
        //SASASAS
        JFrame marcoP = new JFrame("Mi primer interfaz GUI");
        marcoP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoP.setSize(350, 350);
        marcoP.setLayout(new GridLayout(8,1));

        //Esto impide que el tamaño de la ventana sea modificado
        marcoP.setResizable(false);

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

        //Boton mostrar y label del resultado
        JButton btnMostrar = new JButton("MOSTRAR");
        JLabel labelResult = new JLabel(" ");

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

        //Añadimos al marco todos los componentes
        marcoP.add(rb1);
        marcoP.add(rb2);
        marcoP.add(rb3);
        marcoP.add(rb4);
        marcoP.add(rb5);
        marcoP.add(rb6);

        marcoP.add(btnMostrar);
        marcoP.add(labelResult);

        //ActionListener del boton mostrar
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelResult.setText("Resultado de la elección");
                selection(rb1, rb2, rb3, rb4, rb5, rb6);
            }
        });

        marcoP.setVisible(true);
    }

    //Método que gestiona la selección de botones
    private static void selection(JRadioButton rb1, JRadioButton rb2, JRadioButton rb3, JRadioButton rb4, JRadioButton rb5, JRadioButton rb6) {
        if(rb1.isSelected()){
            JOptionPane.showConfirmDialog(null, "YES or NO",
                    "YES_NO_OPTION", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

        }else if (rb2.isSelected()){
            JOptionPane.showConfirmDialog(null, "Aceptar o Cancelar",
                    "OK_CANCEL_OPTION", JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

        }else if(rb3.isSelected()){
            JOptionPane.showConfirmDialog(null, "Sí, No o Cancelar",
                    "YES_NO_CANCEL_OPTION", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);

        }else if (rb4.isSelected()){
            JOptionPane.showOptionDialog(
                    null,
                    "Seleccione opcion",
                    "Selector de opciones",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,    // null para icono por defecto.
                    new Object[] { "opcion 1", "opcion 2", "opcion 3", "opcion 4" },
                    null);

        }else if (rb5.isSelected()){
            JOptionPane.showInputDialog(null, "Input dialog",
                    null);

        }else if(rb6.isSelected()){
            String[] opciones ={"1","2","3"};
            JComboBox jcb = new JComboBox(opciones);
            JOptionPane.showMessageDialog(null, jcb, "ComboBox", JOptionPane.QUESTION_MESSAGE);

        }
    }
}
