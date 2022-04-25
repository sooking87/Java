package Week8;

import javax.swing.*;
import java.awt.*;

public class JButtonTest {

    JButton plus, minus, mux, div;

    public JButtonTest(String msg) {
        JFrame jf = new JFrame((msg));
        jf.getContentPane().setLayout(new GridLayout(2, 2));

        // 이미지 아이콘 생성 -> 이미지 가져오기 필요!
        ImageIcon iplus = new ImageIcon("../Imgaes");
        ImageIcon iminus = new ImageIcon();
        ImageIcon imux = new ImageIcon();
        ImageIcon idiv = new ImageIcon();

        // make Buttons with icons
        plus = new JButton(iplus);
        minus = new JButton(iminus);
        mux = new JButton(imux);
        div = new JButton(idiv);

        // Button 붙히기
        jf.getContentPane().add(plus);
        jf.getContentPane().add(minus);
        jf.getContentPane().add(mux);
        jf.getContentPane().add(div);

        // JFrame 크기 및 visible
        jf.setSize(500, 500);
        jf.setVisible(true);

    }
}
