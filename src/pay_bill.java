import java.awt.*;
import javax.swing.*;
import java.net.URI;

public class pay_bill extends JFrame {

    pay_bill() {
        try {
            Desktop.getDesktop().browse(
                    new URI("https://paytm.com/electricity-bill-payment"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unable to open browser");
        }

        setVisible(false);
    }

    public static void main(String[] args){
        new pay_bill();
    }
}