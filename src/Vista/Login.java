package Vista;

/**
 *
 * @author juank
 */
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton btnIngresar;

    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public Login() {
        setTitle("Login Verdulería");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(30, 30, 80, 25);
        add(lblUsuario);

        txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 30, 150, 25);
        add(txtUsuario);

        JLabel lblContrasena = new JLabel("Contraseña:");
        lblContrasena.setBounds(30, 70, 80, 25);
        add(lblContrasena);

        txtContrasena = new JPasswordField();
        txtContrasena.setBounds(120, 70, 150, 25);
        add(txtContrasena);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(120, 110, 150, 30);
        add(btnIngresar);

        conectar();

        btnIngresar.addActionListener(e -> validarLogin());
    }

    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/verduleria", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
    }

    public void validarLogin() {
        try {
            String usuario = txtUsuario.getText();
            String contrasena = new String(txtContrasena.getPassword());

            pst = con.prepareStatement("SELECT * FROM usuario WHERE nombre_usuario=? AND contrasena=?");
            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bienvenido " + usuario);
                
                FrmProducto menu = new FrmProducto();
                menu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión: " + e.getMessage());
        }
    }
}


