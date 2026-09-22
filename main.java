import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(()-> {

        JFrame ventana = new JFrame("Formulario de Contacto");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600,400);
        ventana.setLocationRelativeTo(null);

        ventana.setLayout(new BorderLayout());

        JPanel panelFormulario =
                new JPanel(new GridLayout(5,2,10,10));

        panelFormulario.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));

        JTextField TextNombre = new JTextField();
        JTextField TextApellido = new JTextField();
        JTextField TextTelefono = new JTextField();
        JTextField TextEmail = new JTextField();

        JTextArea textMensaje = new JTextArea(3,20);
        JScrollPane scrollMensaje = new JScrollPane(textMensaje);

        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(TextNombre);

        panelFormulario.add(new JLabel("Apellido:"));
        panelFormulario.add(TextApellido);

        panelFormulario.add(new JLabel("Telefono:"));
        panelFormulario.add(TextTelefono);

        panelFormulario.add(new JLabel("Email:"));
        panelFormulario.add(TextEmail);

        panelFormulario.add(new JLabel("Mensaje:"));
        panelFormulario.add(scrollMensaje);

        JPanel panelBotones = new JPanel();

        JButton botonEnviar = new JButton("Enviar");

        JButton botonCancelar = new JButton("Cancelar");

        panelBotones.add(botonEnviar);
        panelBotones.add(botonCancelar);

        ventana.add(panelFormulario,BorderLayout.CENTER);
        ventana.add(panelBotones,BorderLayout.SOUTH);

        ventana.setVisible(true);



        });

    }
}
