package Sopheak.Project.Millionaire;
import java.awt.Component;
import javax.swing.JLabel;

public class setTextOn_Question_AND_Answer {
    Font_Style s=new Font_Style();
    public void question(JLabel lbl,String qu){
        if(qu.length()>50){ //if text in label more than 50 and than size of text only 22
        s.Label(lbl, 40,353,990, 100,22);   
        }
        else{ //if text in label less than 50 and than size of text only 24
          s.Label(lbl, 40,353,990, 100,24);   
        }
       lbl.setText(qu);
    }
    public void answer1(JLabel lbl,String ans){
         lbl.setText(ans);
           lbl.setAlignmentX(Component.RIGHT_ALIGNMENT); //set Text in Label start at right
        s.Label(lbl, 170,461,320,30, 18);
    }
    public void answer3(JLabel lbl,String ans){
         lbl.setText(ans);
         lbl.setAlignmentX(Component.RIGHT_ALIGNMENT);//set Text in Label start at right
        s.Label(lbl,170,527,320,30, 18);
    }
    public void answer2(JLabel lbl,String ans){
         lbl.setText(ans);
          lbl.setAlignmentX(Component.RIGHT_ALIGNMENT);//set Text in Label start at right
        s.Label(lbl, 545,461,320,30, 18);
    }
    
    public void answer4(JLabel lbl,String ans){
         lbl.setText(ans);
          lbl.setAlignmentX(Component.RIGHT_ALIGNMENT);//set Text in Label start at right
        s.Label(lbl, 545,527,320,30, 18);
    }
    
}
