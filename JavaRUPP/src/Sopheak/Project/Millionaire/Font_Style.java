package Sopheak.Project.Millionaire;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Font_Style {
    public void Label( JLabel lbl,int x,int y,int a,int b,int size){
         Font f=new Font("Times New Roman",Font.PLAIN,size);
        lbl.setFont(f);
         lbl.setForeground(Color.WHITE);
        lbl.setBounds(x, y, a, b);
    }
}
