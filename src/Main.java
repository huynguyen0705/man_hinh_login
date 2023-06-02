import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Man hinh dang nhap");
        frame.setSize(500,400);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel("Lập trình Java Swing");
        label.setFont(new Font("Arial",Font.BOLD, 21));
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel.add(label);

        JPanel dangNhapPanel = new JPanel();
        dangNhapPanel.setLayout(new BoxLayout(dangNhapPanel,BoxLayout.X_AXIS ));
        dangNhapPanel.setMaximumSize(new Dimension(500, 50));
        JLabel labelDangNhap = new JLabel("Ten dang nhap");
        labelDangNhap.setFont(new Font("Arial",Font.BOLD, 19));
        labelDangNhap.setBorder(BorderFactory.createEmptyBorder(0,20,0,20));
        dangNhapPanel.add(labelDangNhap);

        JTextField textField = new JTextField();
        textField.setColumns(5);
        dangNhapPanel.add(textField);

        panel.add(dangNhapPanel);

        JPanel matKhauPanel = new JPanel();
        matKhauPanel.setLayout(new BoxLayout(matKhauPanel,BoxLayout.X_AXIS ));
        matKhauPanel.setMaximumSize(new Dimension(500, 50));
        JLabel labelMatKhau = new JLabel("Mat khau");
        labelMatKhau.setFont(new Font("Arial",Font.BOLD, 19));
        labelMatKhau.setBorder(BorderFactory.createEmptyBorder(0,20,0,76));
        matKhauPanel.add(labelMatKhau);

        JTextField textField1 = new JTextField();
        textField.setColumns(5);
        matKhauPanel.add(textField1);

        panel.add(matKhauPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.X_AXIS ));
        buttonPanel.setMaximumSize(new Dimension(500, 50));
        buttonPanel.add(Box.createHorizontalGlue());

        JButton button = new JButton("Dang nhap");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ten dang nhap: " + textField.getText());
                System.out.println("Mat khau: " + textField1.getText());
            }
        });
        buttonPanel.add(button);

        panel.add(buttonPanel);











        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}