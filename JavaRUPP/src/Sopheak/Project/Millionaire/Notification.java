package Sopheak.Project.Millionaire;
import javax.swing.JOptionPane;

public class Notification {
    void About(){
        JOptionPane.showMessageDialog(null,"This program is free software. you can use in public \n"+
                                                                                        " It was been built by Java Team in year three of RUPP\n"+
                                                                                        "They finished this program on 21 February 2018\n"+
                                                                                        "Version 1.0.0 of the License, or any later version.", "About",
                                                                                        JOptionPane.INFORMATION_MESSAGE);
    }
    void ContactUs(){
        JOptionPane.showMessageDialog(null,"If you have problem, please contact us by : \n"+
                                                                                        "   - Email: pheak.tum7@gmail.com\n"+
                                                                                        "   - facebook: https://web.facebook.com/pheak.tum\n"+
                                                                                        "   - Address:  Royal University of Phnom Penh.\n"+
                                                                                        "   - Team Project:  Royal University of Phnom Penh.\n"+
                                                                                        "      Tum Pheak"+
                                                                                        "   Contact +855 886 089 325",
                                                                                        "Contact us\n",
                                                                                        JOptionPane.INFORMATION_MESSAGE);
    }
    void AboutMe(){
        JOptionPane.showMessageDialog(null,"This application was built for everyone  to test\n"+
                                                                                        "yourself with many questions in it,\n"+
                                                                                        "and apply your English education to answer\n"+
                                                                                        "all the question.\n"+
                                                                                        "We will try to upgrade to new version soon.\n\n"+
                                                                                        "Thank you for support our app",
                                                                                        "About me",
                                                                                        JOptionPane.INFORMATION_MESSAGE);
    }
    void Help(){
        JOptionPane.showMessageDialog(null,"We will tell you about how to play this app\n"+
                                                                                        "   1. Click button Play Now to start the game.\n"+
                                                                                        "   2. Click one answer that you think it is correct to next level,\n"+
                                                                                        "       but if you are not sure with any answer you can use our Help\n"+
                                                                                        "       such as:\n"+
                                                                                        "           - People to tell you about the answer\n"+
                                                                                        "           - 50:50 to cut two wrong answer\n"+
                                                                                        "           - Phone to call to anyone that you think he can help you. \n\n"+
                                                                                        "Thank you for support our app",
                                                                                        "How to play?",
                                                                                        JOptionPane.INFORMATION_MESSAGE);
    }
}
