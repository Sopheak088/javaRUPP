package Sopheak.Project.Millionaire;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class Millionaire   extends JFrame implements MouseListener,MouseMotionListener {
static Step[] obj={new Step("How many languages and dialects are spoken by people all over the world?","6,000","1,000","4,000","9,000"),
new Step("Approximately, how many people speak Chinese language?","1 thousand","1 lakh","1 million","1 billion"),
new Step("The language with the richest vocabulary is:","German","French","Hindi","English"),
new Step("English Language have more than ?? words:","450","4,500","45,000","4,50,000"),
new Step("The oldest Indian language is:","Punjabi","Hindu","Telugu","Tamil"),
new Step("Which book has been printed in the maximum number of languages and these scripts?","None of these","The Super Book","Hiraka Sutra","The Bible"),
new Step("The only religious book ever printed in a shorthand scripts is:","The Ramayana","The Mahabharata","Guru Granth Sahib","The bible"),
new Step("The oldest printed work in the world, which dates back to AD 868 is:","The Mahabharata","The Ramayana","The Bible","The Hirake Sutra"),
new Step("The largest book, the super book, is ?? and weight is ??","None of these","200 cm, 100 cm, 60 kg.","100 cm, 110 cm, 100 kg.","270 cm, 300 cm, 252 kg."),
new Step("Les Hommes de bonne volonté is the:","None of these","The oldest novel","Shortest novel every published","Longest novel ever published"),
new Step("The author of the play/book ?Ratnawali? is:","Prem Chand","Kalidas","Tulsidas","Harsha Vardhan"),
new Step("Which of the following in the book/play written by Maithili Sharan Gupt?","Savitri","Shakuntala","Satyartha Prakash","Saket"),
new Step("The book ?Satyartha Prakash? was written by","Kalidas","Sarojini Naidu","Swami Vivekanand","Swami Dayanand"),
new Step("The play/book ?Shakuntala? was written by:","Swami Dayanand","Maithili Sharan gupt","Tulsidas","Kalidas"),
new Step("Which of the following is the author of ?Song of India, The?:","Sri Aurobindo Ghosh","Lala Lajpat Rai","Firdausi","Sarojini Naidu"),
new Step("The author of the book ?Time machine? is:","Charles Lamb","Robert Louis Stevenson","Lewis Carroll","H.G. Wells"),
new Step("Which of the following book was written by Tulsidas:","Yashodhara(a)","Ramcharitmanas(b)","Vinay Patrika","Both (a) and (b)"),
new Step("The book ?Vish Vriksha? was written by:","Kalidas","Tulsidas","Annie Basant","Bankimchandra Chatterjee"),
new Step("The book ?We Indians? was written by:","Thomas Moore","James Jeans","H.G. Wells","Khushwant Singh"),
new Step("Which of he follow ing is he author of play/book ?Yashodhara?:","Sarojini Naidu","Bankimchandra C hatterjee","Khushwant Singh","Maithili Sharan Gupt"),
new Step("Who developed the small pox v accination?","Alexander Flem ing","Albert Einstein","None of these","Eduard Jenner"),
new Step("Firdausi was:","A person poet","Well known fo r his epic ?Sharnama?","None of these","Both are correct"),
new Step("Who is also kno wn as the ?Lady with the Lamp?","Bachendri Pal","Rani Laxmiba i","Sarojini Naidu","Florence Nightingale"),
new Step("Who is known a s the father of English poetry?","John Milton","John Keats","None of the se","Geoffrey Chaucer"),
new Step("The American G eneral who led the revolt against the British & declared American independence was:","Bill Clinton","George Bush","None of these","George Washington"),
new Step("Marco Polo","Discovered Greenland","Discovered Canada","Traveled round the cape of Good Hope","Traveled three China, India and other parts of Asia"),
new Step("Who landed on the mainland of South America for the First time?","Discovered Greenland","Discovered the sea route from Europe to India","None of these","Landed of south America"),
new Step("Who discovered Australia?","Eric the Red","Leif Ericsson","None of these","William Janszoom"),
new Step("Who located the magnetic pole?","Sir James Clark","Rear Admiral","Sir John Ross","All the above"),
new Step("Who was first to reach the South Pole?","Rear Admiral","Capt. R. E. Scett","Sir Edmund Hillary","Capt. Amundsen"),
new Step("Who was the first to cross the Antarctic?","Maj. Yuri Gagarin and Maj. Gherman Titor","Capt. R. E. Scott","All of these","Sir Vivian Fuchs & sir Edmund Hillary"),
new Step("Who was the first man to ?Walk? in space?","Col. Leonor from Russia","Major White from America","None of these","Both of these"),
new Step("?Arena? is the special name for playground of:","Cricket","Lawn Tennis","Skating","Wrestling"),
new Step("The national sport of Canada is:","Tennis and cricket","Judo","Rugby and Football","Lacrosse"),
new Step("Badminton is the national sport at:","Scotland","China","Former soviet Union","Malaysia"),
new Step("Where is the Vallabhbhai Patel stadium located?","Kolkata","Chennai","Delhi","Mumbai"),
new Step("Where is the sports stadium, Green Park, located?","Jamshedpur","Cuttack","Patiala","Kanpur"),
new Step("For which of the following disciplines in Nobel Prize awarded?","Physics and chemistry","Physiology or Medicine","Literature, Peace and Economics","All the above"),
new Step("On which date is Nobel Prize awarded?","January 10","April 10","July 10","December 10"),
new Step("The Royal Swedish Academy of Sciences, awarded the Noble Prize in:","Physics(a)","Economics","Chemistry(c)","(a) and (c)"),
new Step("The committee of the Norwegian Parliament awards the prize for:","Economics","Medicine","Literature","Peace"),
/*Sport*/
new Step("Who won the Shanghai Masters Tennis tournament organised recently?","Novak Djokovic","Roger Federer","Rafael Nadal","Nikolay Davydenko"),
new Step("Who won the 2009 FIFA Under-17 World Cup in Abuja, Nigeria recently?","Mexico","Portugal","Brazil","Switzerland"),
new Step("DRDO was formed in","1947","1950","1954","1958"),
new Step("What is the name of Indian Aerostat of 2000 cum capacity?","Rustom","Mareech","BrahMos","Akashdeep"),
new Step("Name the Advanced Torpedo Defence System (ATDS) developed by DRDO","Rustom","Akashdeep","MLRS","Mareech"),
new Step("What is the grade pay for Scientist F (in Rupees)?","2700","6500","10000","8900"),
new Step("A permanent DRDO exhibition known as Darpan is established at","VRDE","INMAS","DRDE","RAC"),
new Step("The three-stage Agni-V has a range of","2000 KM","3000 KM","4000 KM","5000 KM"),
new Step("The DRDO-FICCI programme to create commercial pathway is popularly known as","ASPIRE","ENERGY","DRFI","ATAC"),
new Step("Honorable PM of India declared 2012 to be the National ______ Year","Phyics","Nano Science","Metallurgy","Mathematical"),
new Step("________ radar is an indigenous 3 D surveillance radar development by LRDE","Agni III","Mareech","Sarvatra","Rohini"),
new Step("Indian army’s oldest T-72 tanks, entered service in","1960","1962","1965","1969"),
new Step("National Science Day is celebrated on","11 May","1 Jan","15 May","28 Feb"),
new Step("The Robotics Development Centre, Saksham is located at","VRDE","DRDE","HEMRL","R&DE(E)"),
new Step("Lukoskin, a herbal product for Leucoderma is developed by","INMAS","DRDE","DEBEL","DIBER"),
new Step("This DRDO lab has developed Anti-thermal, Anti-laser smoke grenade","LASTEC","R&DE(E)","DRDE","HEMRL"),
new Step("This Lab has developed Alocal, an Aloe Vera based cream containing 50 per cent Aloe Juice (w/w)","DIBER","DIHAR","DRDE","DIPAS"),
new Step("98th Indian Science Congress (ISC-2011) was held at","IIT, Chennai","IISc, Bangalore","KIIT Univ","SRM University"),
new Step("One of the following is the name of a Pilotless Target Aircraft","Nang","Limpet","Pinaka","Lakshaya"),
new Step("Remotely operated vehicle (ROV) Daksh, is designed and developed by","DL","DRDE","DMSRDE","R& DE(E)"),
new Step("Pinaka is a","Submarine","Bomb","Missile","MBR System"),
new Step("Lakshya-II has been designed and developed by","ADA","GTRE","DTRL","ADE"),
new Step("100th Indian Science Congress (ISC-2013) will be held at","Chandigarh","Chennai","Bangalore","Kolkata"),
new Step("What is the another name of ATHLETICS.","Sports","Gymnastics","Decathlon","Track &Field"),
new Step("Time shall be taken from the.","Whistle","None of these.","Sound of Gun","Flash smoke"),
new Step("How many types of tracks are there?","Three type","Five type","Four type","Two type"),
new Step("How many lanes are there in a standard track?","11 to 13","8 to 9","10 to 12","6 to 9"),
new Step("The following are the standard distance of hurdler Race for men.","100 & 400 mts.","80 & 200 mts.","All of these.","110 & 400 mts."),
new Step("Direction of running shall be.","Right hand side","curve- running","none of these.","Left hand side"),
new Step("The Standard distance of Marathon Race.","26 kms.","42 kms.","42.123 kms","42.195 kms"),
new Step("The procedure of doping test is including the collection of.","Sugar sample","stool Sample","Blood Sample","Urine sample"),
new Step("How many athletes may be used as substitutes in Relays race event","none of these.","Two athlete","Three athlete","One athlete."),
new Step("Landing area of High jump event should be.","5x2 mts","5x4 mts","5x5 mts.","5x3 mts"),
new Step("Landing area of Pole vault event should be.","6x4 mts","5x4 mts","5x3 mts","5x5 mts."),
new Step("Landing area of long jump event should be.","10x2.75 mt","9x4 mts","9x3 mts","9x2.75 mts."),
new Step("Minimum weight of shot for acceptance of a record (for men)","5 kg","8 kg","7.25 kg","7.26 kg."),
new Step("Minimum weight of shot for acceptance of a record (for women)","5 kg","8 kg","4 kg.","4 kg"),
new Step("Minimum weight of discuss for acceptance of a record (for men)","1 kg","3 kg","800 gms.","2 kg"),
new Step("Minimum weight of Javelin for acceptance of a record (for women)","800 gms","750 gms","500 gms","600 gms"),
new Step("Ten event which shall be held on two consecutive days is known as.","relay race","Heptathlon","Penthalon","Decathlon"),
new Step("First “Padmashree” in athletics.","none of these.","Milkha singh","P.T.Usha","Bandhu singh"),
new Step("The Person who represented India in 6 Olympics from (1964 to 84)","Ranjeet singh","Milkha singh","Randhir singh","None of these"),
new Step("The first Indian woman athlete to win a gold in Asian Games is .","Shayni Abhramn","Anju B. G.","kamaljit Sandhu","P.T.Usha"),
new Step("How many hurdles are placed in a Hurdle race in one lap?","7","15","12","10"),
new Step("How many Olympics medal have been won by Indian hockey team?","10","18","13","11"),
new Step("Who has got the First Arjuna Award in the field of Athletics?","P.T.Usha","Milkha Singh","B.S.Bedi","G.S.Randhawa"),
new Step("The first Commonwealth games were held in","1940 Pakistan","1935 India","1934 Australia","1930 Hamilton"),
new Step("When did the ancient Olympic game start?","394 B. C.","676 B.C.","493 B.C.","776 B.C."),
new Step("Till now how many Olympic Games have been organized?","22","28","27","29"),
new Step("Who was the first Indian woman to take part in Olympic Games?","Anju B.G.","K.Malleshwree","P.T.Usha","Merry La RO"),
new Step("In which Olympic Games did India last win a gold medal in Hockey?","1964","1972","1984","1980"),
new Step("Where and in which year were the first Asian games held?","1952 Doha","1950 Delhi","1954 Beijing","1951 New Delhi"),
new Step("Where were the Last (fifteenth) Asian games held?","2002 Bussan","2007 Beijing","2008 New Delhi","2006 Doha"),
new Step("At what place the Asian games have been held four times?","New Delhi","Tehran","Seoul","Bangkok"),
new Step("Where were the first commonwealth (1930) games held?","New Delhi","Sidney","Landon","Hamilton"),
new Step("In which common wealth game did India take part for the first time?","1930 Hamilton","1962 Perth","Auckland 1950","London 1934"),
new Step("When and where will Nineteenth Commonwealth games be held?","2010 Melbourne","2010 India","2010 Pakistan","2010 New Delhi"),
new Step("When did first modern Olympic game start?","1900","1895","1892","1896")
/*new Step("Question","Answer1","Answer2","Answer3","Correct Answer"),*/
};
        static int Index_Question=0,balance_Picture_name=0;
        static String balance="0";
        static  Random Rand_Object=new Random();
        static int[] Get_Rand_Object=new int[14];
        static String[] setText_Answer=new String[4];
       static Timer t;
        static int count =0;
        void Close(String ImageName){
        lblClose.setBounds(5,7,20,20);//300, 0, 800, 20);
        lblClose.setIcon(new ImageIcon(p.Source(ImageName)));
        lblBackground.add(lblClose);
         }
         void Minimize(String ImageName){
        lblMinimize.setBounds(25,7,20,20);//300, 0, 800, 20);
        lblMinimize.setIcon(new ImageIcon(p.Source(ImageName)));
        lblBackground.add(lblMinimize);
         }
          void About(String ImageName){
        lblAbout.setBounds(45,7,20,20);//300, 0, 800, 20);
        lblAbout.setIcon(new ImageIcon(p.Source(ImageName)));
        lblBackground.add(lblAbout);
         }
          
           void Background_Playing(){
        lblBackground.setBounds(0,-5, 990, 650);
        lblBackground.setIcon(new ImageIcon(p.Source("Quest.png")));
        add(lblBackground);
         }
           void Background_Home(){
        lblBackground.setBounds(0,-5, 990, 650);
        lblBackground.setIcon(new ImageIcon(p.Source("Back.gif")));
        add(lblBackground);
         }
          void Play(String ImageName){
        lblPlay.setBounds(430,150,160,60);
        lblPlay.setIcon(new ImageIcon(p.Source(ImageName)));
        lblBackground.add(lblPlay);
         }
          void ContactUs(String ImageName){
        lblContactUs.setBounds(430,220,160,60);
        lblContactUs.setIcon(new ImageIcon(p.Source(ImageName)));
        lblBackground.add(lblContactUs);
         }
          void AboutMe(String ImageName){
        lblAboutMe.setBounds(430,290,160,60);
        lblAboutMe.setIcon(new ImageIcon(p.Source(ImageName)));
        lblBackground.add(lblAboutMe);
         }
           void HelpApp(String ImageName){
        lblHelpApp.setBounds(945,590,40,40);
        lblHelpApp.setIcon(new ImageIcon(p.Source(ImageName)));
        lblBackground.add(lblHelpApp);
         }
          void FB(String ImageName){
        lblFB.setBounds(860,590,80,40);
        lblFB.setIcon(new ImageIcon(p.Source(ImageName)));
        lblBackground.add(lblFB);
         } 
           void DateTime(){
               Font f=new Font("Times New Roman",Font.PLAIN,16);
        lblDate.setBounds(470,610,130,25);
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");//"yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        lblDate.setFont(f);
        lblDate.setForeground(Color.WHITE);
        lblDate.setText(dateFormat.format(date));
        lblBackground.add(lblDate);
         } 
          
   public void Pause(String ImageName){
                lblPause.setIcon(new ImageIcon(p.Source(ImageName)));
                lblPause.setBounds(780, 10, 45, 45);
                lblBackground.add(lblPause);  
        }
          void On_Off(Boolean b){  
              lblQuest.setVisible(b);
              lblAnswer1.setVisible(b);
              lblAnswer2.setVisible(b);
              lblAnswer3.setVisible(b);
              lblAnswer4.setVisible(b);
              lblPic50.setVisible(b);
              lblPicEveryOne.setVisible(b);
              lblBalance.setVisible(b);
              lblPicPhone.setVisible(b);
              lblPause.setVisible(b);
          }
          
 //set Balance'balance_Picture_name Picture
  public static void Balance(){
                int s=Index_Question+1;
                PicturePath pi=new PicturePath();
                String su=Integer.toString(s);
                lblBalance.setIcon(new ImageIcon(pi.Source(su)+".png"));
                lblBalance.setBounds(815, 10, 175, 340);
                lblBackground.add(lblBalance);  
        }
  
    //set setTextOn_Question_AND_Answer Location
     public void Question (String qu){
                QA.question(lblQuest,qu);
                lblQuest.setHorizontalAlignment(JLabel.CENTER);
                lblBackground.add(lblQuest);
        }
      //set Answer1 Location
     public void Answer1(String ans1){
                QA.answer1(lblAnswer1,ans1);
                if(ans1.length()>25){ // If string in Answer1 has then 25 character,it gets size 12
                        Font f=new Font("Times New Roman",Font.PLAIN,12);
                        lblAnswer1.setFont(f);
                }
                lblBackground.add(lblAnswer1);
        }
      //set Answer3 Location
       void Answer3(String ans3){  
                QA.answer3(lblAnswer3, ans3);
                if(ans3.length()>25){
                        Font f=new Font("Times New Roman",Font.PLAIN,12);
                        lblAnswer1.setFont(f);
                }
                lblBackground.add(lblAnswer3);
        }
        //set Answer2 Location
     void Answer2(String ans2){
                QA.answer2(lblAnswer2,ans2);
                if(ans2.length()>25){
                        Font f=new Font("Times New Roman",Font.PLAIN,12);
                        lblAnswer1.setFont(f);
                }
                lblBackground.add(lblAnswer2);
        }
     //set Answer4 Location
       void Answer4(String ans4){
                QA.answer4(lblAnswer4,ans4);
                if(ans4.length()>25){
                        Font f=new Font("Times New Roman",Font.PLAIN,12);
                        lblAnswer1.setFont(f);
                }
                lblBackground.add(lblAnswer4);
       }
       //set Everyone Help Location
        public void HelpEveryOne(String ImageName){
                imgEveryOne=new ImageIcon(p.Source(ImageName));
                lblPicEveryOne=new JLabel(imgEveryOne);
                lblPicEveryOne.setBounds(10,40, 55, 50);
                lblBackground.add(lblPicEveryOne);
        }
         public void HelpEveryOne_After_Click(String ImageName){
                lblPicEveryOne.setVisible(false);
                imgEveryOne=new ImageIcon(p.Source(ImageName));
                lblPicEveryOne_2=new JLabel(imgEveryOne);
                lblPicEveryOne_2.setBounds(10,40, 55, 50);
                lblBackground.add(lblPicEveryOne_2);
        }
         //set Phone Help Location
        public void HelpPhone(String ImageName){
                imgPhone=new ImageIcon(p.Source(ImageName));
                lblPicPhone=new JLabel(imgPhone);
                lblPicPhone.setBounds(90,40, 55, 50);
                lblBackground.add(lblPicPhone);
        }
        public void HelpPhone_After_Click(String ImageName){
                lblPicPhone.setVisible(false);
                imgPhone=new ImageIcon(p.Source(ImageName));
                lblPicPhone_2=new JLabel(imgPhone);
                lblPicPhone_2.setBounds(90,40, 55, 50);
                lblBackground.add(lblPicPhone_2);
        }
        //set 50:50 Help Location
        public void Help50(String ImageName){
                img50=new ImageIcon(p.Source(ImageName));
                lblPic50=new JLabel(img50);
                lblPic50.setBounds(170,40, 55, 50);
                lblBackground.add(lblPic50);
        }
        public void Help50__After_Click(String ImageName){
                lblPic50.setVisible(false);
                img50=new ImageIcon(p.Source(ImageName));
                lblPic50_2=new JLabel(img50);
                lblPic50_2.setBounds(170,40, 55, 50);
                lblBackground.add(lblPic50_2);
     }
   public Millionaire(){
                super("I want to be a Millionaire");
               this.setIconImage(Toolkit.getDefaultToolkit().getImage(p.Source("icon.png")));//set icon to JFrame
                setSize(990,630);//set form'balance_Picture_name size
                setLayout(null);
                 this.setUndecorated(true);
                
                //set Center of screen
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
      
                this.setResizable(false); //Maximize form false, you can not resize
                
                 Background_Home();
                 DateTime();
                Play("Play1.png");
                ContactUs("ContactUs_1.png");
                AboutMe("AboutMe_1.png");
                HelpApp("help_1.png");
                FB("fb_1.png");
                
                Pause("pause_1.png");
                Balance();
                HelpEveryOne("everyone.png");
                HelpPhone("phone.png");
                Help50("50.png");
                
                Close("exit1.png");
                Minimize("min1.png");
                About("about1.png");
                On_Off(false);
                Question("");
                Answer1("");
                Answer2("");
                Answer3("");
                Answer4("");
                 //set event for label
                lblAnswer1.addMouseListener(this);
                lblAnswer2.addMouseListener(this);
                lblAnswer3.addMouseListener(this);
                lblAnswer4.addMouseListener(this);
                lblPic50.addMouseListener(this);
                lblPicEveryOne.addMouseListener(this);
                lblPicPhone.addMouseListener(this);               
                lblBackground.addMouseListener(this);
                lblMinimize.addMouseListener(this);
                lblAbout.addMouseListener(this);
                lblClose.addMouseListener(this);
                lblPlay.addMouseListener(this);
                 lblPause.addMouseListener(this);
                lblContactUs.addMouseListener(this);
                lblAboutMe.addMouseListener(this);
                lblHelpApp.addMouseListener(this);
               lblFB.addMouseListener(this);
                //set event for mouse move form that can move form to anywhere
                lblBackground.addMouseMotionListener(this);

                //Change icon when mouse move on
                lblClose.addMouseMotionListener(new MouseAdapter()
                {
                         @Override
                        public void mouseMoved(MouseEvent e) {
                               Close("exit2.png");
                               lblClose.setToolTipText("Close");//show text on label Close
                        }
                });
                lblMinimize.addMouseMotionListener(new MouseAdapter()
                {
                         @Override
                        public void mouseMoved(MouseEvent e) {
                               Minimize("min2.png");
                               lblMinimize.setToolTipText("Minimize");//show text on label Minimize
                        }
                });
                 lblAbout.addMouseMotionListener(new MouseAdapter()
                {
                         @Override
                        public void mouseMoved(MouseEvent e) {
                               About("about2.png");
                               lblAbout.setToolTipText("About");//show text on label About                          
                              
                        }
                });
                 lblPause.addMouseMotionListener(new MouseAdapter()
                {
                         @Override
                        public void mouseMoved(MouseEvent e) {
                               Pause("pause_2.png");
                               lblPause.setToolTipText("Pause"); //show text on label Pause
                        }
                });
                 lblPlay.addMouseMotionListener(new MouseAdapter()
                {
                         @Override
                        public void mouseMoved(MouseEvent e) {
                               Play("Play2.png");
                        }
                });
                 lblContactUs.addMouseMotionListener(new MouseAdapter()
                {
                         @Override
                        public void mouseMoved(MouseEvent e) {
                               ContactUs("ContactUs_2.png");
                        }
                });
                 lblAboutMe.addMouseMotionListener(new MouseAdapter()
                {
                         @Override
                        public void mouseMoved(MouseEvent e) {
                               AboutMe("AboutMe_2.png");
                        }
                });
                  lblHelpApp.addMouseMotionListener(new MouseAdapter()
                {
                         @Override
                        public void mouseMoved(MouseEvent e) {
                               HelpApp("help_2.png");
                        }
                });
                    lblFB.addMouseMotionListener(new MouseAdapter()
                {
                         @Override
                        public void mouseMoved(MouseEvent e) {
                               FB("fb_2.png");
                        }
                });
                
                //set when move mose on any Answer it will change Cursor to Hand 
                lblAnswer1.addMouseMotionListener(new MouseAdapter()
                {
                         @Override
                        public void mouseMoved(MouseEvent e) {
                                lblAnswer1.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                });
               lblAnswer2.addMouseMotionListener(new MouseAdapter()
                {
                        @Override
                        public void mouseMoved(MouseEvent e) {
                                lblAnswer2.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                });
                lblAnswer3.addMouseMotionListener(new MouseAdapter()
                {
                        @Override
                        public void mouseMoved(MouseEvent e) {
                                lblAnswer3.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                });
                 lblAnswer4.addMouseMotionListener(new MouseAdapter()
                {
                        @Override
                        public void mouseMoved(MouseEvent e) {
                                lblAnswer4.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                });
                 lblPic50.addMouseMotionListener(new MouseAdapter()
                {
                        @Override
                        public void mouseMoved(MouseEvent e) {
                                lblPic50.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                });
                 lblPicEveryOne.addMouseMotionListener(new MouseAdapter()
                {
                        @Override
                        public void mouseMoved(MouseEvent e) {
                                lblPicEveryOne.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                });
                 lblPicPhone.addMouseMotionListener(new MouseAdapter()
                {
                        @Override
                        public void mouseMoved(MouseEvent e) {
                                lblPicPhone.setCursor(new Cursor(Cursor.HAND_CURSOR));
                        }
                });
        setVisible(true); 
   };   
    //show setTextOn_Question_AND_Answer, Answer and Balance on the Form
        public static void Next_Play(String q,String c1,String c2,String c3,String  c4)
        {
                Balance();
                lblQuest.setText(q);
                lblBackground.add(lblQuest);
                lblAnswer1.setText(c1);
                lblAnswer2.setText(c2);
                lblAnswer3.setText(c3);
                lblAnswer4.setText(c4);
        }
        //when start first
        public static void Start(){
                Index_Question=0;
                balance="0";
              count=31;
                Random_Object_Question(); 
                Random_Location_Answer(Get_Rand_Object[Index_Question]);
                Next_Play(obj[Get_Rand_Object[Index_Question]].Quest,setText_Answer[0],setText_Answer[1],setText_Answer[2],setText_Answer[3]);
                
        }
        public static void main(String[] args) {
                new Millionaire();
        }
        //Random Object for setTextOn_Question_AND_Answer 
        public static void Random_Object_Question()
        {
            int n=0;
            for(;n<14;n++){      
                Get_Rand_Object[n]=Rand_Object.nextInt(99);
                if(n>=1)
                {
                        for(int i=0;i<n;i++)
                        {
                                if(Get_Rand_Object[i]==Get_Rand_Object[n])
                                {
                                        n--;
                                        break;
                                }
                        }
                }
            }
        } 
        //set location for answer
        public static void Random_Location_Answer(int object)
        {
                int n1=0;
                int[] Ran_Ans=new int[4];
                for(;n1<4;n1++){      
                        Ran_Ans[n1]=Rand_Object.nextInt(4);
                        if(n1>=1)
                        {
                                for(int i=0;i<n1;i++)
                                {
                                        if(Ran_Ans[i]==Ran_Ans[n1])
                                        {
                                                n1--;
                                                break;
                                        }
                                }
                        }
                }
                for(int i=0;i<4;i++)
                {
                        if(Ran_Ans[i]==0)
                        {
                                setText_Answer[i]=obj[object].Choice1;
                        }  
                        else if(Ran_Ans[i]==1)
                        {
                                setText_Answer[i]=obj[object].Choice2;
                        }   
                        else if(Ran_Ans[i]==2)
                        {
                                setText_Answer[i]=obj[object].Choice3;
                        }
                        else if(Ran_Ans[i]==3)
                        {
                                setText_Answer[i]=obj[object].Answer;
                        }   
                }  
        }

        //Random to cut 2 answer when click Help50:50
        public static void Help_50_50(int object)
        {
                int n=0;
                int[] Ran_Fif=new int[2];
                for(;n<2;n++)
                {      
                        Ran_Fif[n]=Rand_Object.nextInt(4);
                        for(int i=0;i<n;i++)
                        {
                                if((Ran_Fif[i]==Ran_Fif[n])||(obj[object].Choice1==lblAnswer1.getText())||(obj[object].Choice2==lblAnswer2.getText())||(obj[object].Choice3==lblAnswer3.getText())||(obj[object].Answer==lblAnswer4.getText()))
                                {
                                        n--;
                                        break;  
                                }
                        }
                 }
                 for(n=0;n<2;n++)
                {                
                        if(Ran_Fif[n]==0)
                        {
                                lblAnswer1.setText(null);
                        }
                        else if(Ran_Fif[n]==1)
                        {
                        lblAnswer2.setText(null);
                        }
                        else if(Ran_Fif[n]==2)
                        {
                                lblAnswer3.setText(null);
                        }
                        else if(Ran_Fif[n]==3)
                        {
                                lblAnswer4.setText(null);
                        }
                }
        }
        void Check_Balance(){
                if(Index_Question==0){
                        balance="100";
                }
                else if(Index_Question==1){
                        balance="200";
                }
                else if(Index_Question==1){
                        balance="300";
                }
                else if(Index_Question==2){
                        balance="500";
                }
                else if(Index_Question==3){
                        balance="1 000";
                }
                else if(Index_Question==4){
                        balance="2 000";
                }
                else if(Index_Question==5){
                        balance="3 000";
                }
                else if(Index_Question==6){
                        balance="5 000";
                }
                else if(Index_Question==7){
                        balance="10 000";
                }
                else if(Index_Question==8){
                        balance="12 000";
                }
                 else if(Index_Question==9){
                        balance="10 000";
                }
                 else if(Index_Question==10){
                        balance="12 000";
                }
                 else if(Index_Question==11){
                        balance="14 000";
                }
                 else if(Index_Question==12){
                        balance="20 000";
                }
                else if(Index_Question==13){
                        balance="25 000";
                }
        }
        //Next level when you click correct answer
        void Next_Level(){
                lblTime.setText(null);
                 lblTime.setVisible(false);
                Check_Balance();
                Index_Question++;
                Random_Location_Answer(Get_Rand_Object[Index_Question]);
                Next_Play(obj[Get_Rand_Object[Index_Question]].Quest,setText_Answer[0],setText_Answer[1],setText_Answer[2],setText_Answer[3]);
                count=31;
        }
        //when you click wrong answer
        void Try_Again(){
               lblTime.setText(null);
               lblTime.setVisible(false);
                int ch = JOptionPane.NO_OPTION;
                ch = JOptionPane.showConfirmDialog(this,   "Your get "+balance+" $\nDo you want to play again?\n\tThank you...!",    "Try again",   JOptionPane.YES_NO_OPTION);
                if(ch==JOptionPane.YES_OPTION){
                        Start();
                        lblPic50_2.setVisible(false);                lblPic50.setVisible(true);
                        lblPicEveryOne_2.setVisible(false);     lblPicEveryOne.setVisible(true);
                        lblPicPhone_2.setVisible(false);          lblPicPhone.setVisible(true);
                         count=31;
                }
                else{
                        System.exit(0);
                }
                
        }
        
        

        //event for mouse click when choose the answer
       public void mouseClicked(MouseEvent me)  
       {
                if(Index_Question<14)
                {
                        if(me.getSource()==lblAnswer1)
                        {           
                                if(lblAnswer1.getText()==obj[Get_Rand_Object[Index_Question]].Answer)
                                {
                                        Next_Level();
                                }
                                else{
                                        Try_Again();
                                }
                        }
                        else if(me.getSource()==lblAnswer2)
                        {
                                if(lblAnswer2.getText()==obj[Get_Rand_Object[Index_Question]].Answer)
                                { 
                                        Next_Level();
                                }
                                else{
                                        Try_Again();
                                }
                        }
                        else if(me.getSource()==lblAnswer3)
                        {
                                if(lblAnswer3.getText()==obj[Get_Rand_Object[Index_Question]].Answer)
                                {
                                        Next_Level();
                                }
                                else{
                                        Try_Again();
                                }
                        }
                        else if(me.getSource()==lblAnswer4)
                        {
                                if(lblAnswer4.getText()==obj[Get_Rand_Object[Index_Question]].Answer)
                                { 
                                        Next_Level();
                                }
                                else{
                                        Try_Again();
                                }
                        }
                        else if(me.getSource()==lblPic50)
                        {
                                Help50__After_Click("50_2.png");
                                Help_50_50(Index_Question);
                        }
                        else if(me.getSource()==lblPicEveryOne)
                        {
                            JOptionPane.showMessageDialog(null,   "The most answer of the choice is :\n( "+obj[Get_Rand_Object[Index_Question]].Answer+"  )");
                                HelpEveryOne_After_Click("everyone_2.png");
                                lblPicEveryOne.setVisible(false);
                        }
                        else if(me.getSource()==lblPicPhone)
                        {
                            Phone_Time_Loading();
                           // JOptionPane.showMessageDialog(null,   "Please call to anyone");
                                HelpPhone_After_Click("phone_2.png");
                                lblPicPhone.setVisible(false);
                                
                        }
                        else if(me.getSource()==lblMinimize)
                        {
                            this.setState(JFrame.ICONIFIED);
                                
                        }
                        else if(me.getSource()==lblClose)
                        {
                           System.exit(0);
                                
                        }
                        else if(me.getSource()==lblAbout)
                        {
                                     noti.About();
                        }
                        else if(me.getSource()==lblPlay){
                            lblPlay.setVisible(false);
                               Background_Playing();
                               Start();
                                On_Off(true);       
                                lblPic50_2.setVisible(false);
                                lblPicEveryOne_2.setVisible(false);
                                lblPicPhone_2.setVisible(false);
                                lblHelpApp.setVisible(false);
                                lblContactUs.setVisible(false);
                                lblAboutMe.setVisible(false);
                                lblFB.setVisible(false);
                                lblDate.setVisible(false);
                        }
                        else if(me.getSource()==lblPause){
                            lblPlay.setVisible(true);
                               Background_Home();
                                On_Off(false);     
                                lblTime.setVisible(false);
                                lblPic50_2.setVisible(false);
                                lblPicEveryOne_2.setVisible(false);
                                lblPicPhone_2.setVisible(false);
                                lblHelpApp.setVisible(true);
                                lblContactUs.setVisible(true);
                                lblAboutMe.setVisible(true);
                                lblFB.setVisible(true);
                                 lblDate.setVisible(true);
                                
                        }
                         else if(me.getSource()==lblFB)
                        {
                            try {
                                String url="www.facebook.com";//open facebook with your default browser
                                java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                            } catch (IOException ex) {
                                Logger.getLogger(Millionaire.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        else if(me.getSource()==lblContactUs)
                        {
                                noti.ContactUs();
                        }
                        else if(me.getSource()==lblAboutMe)
                        {
                                noti.AboutMe();
                        }
                        else if(me.getSource()==lblHelpApp)
                        {
                                noti.Help();
                        }
                }
                else{ 
                        JOptionPane.showMessageDialog(null, "Congratulation\nYou get"+balance+" $");
                        System.exit(0);
                }
        }
       
       public void Phone_Time_Loading(){
            count=31;
             lblTime.setVisible(true);
        Font f=new Font("Khmer OS Moul Light",Font.PLAIN,28);
          t=new Timer(1000, new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
         count--;
            if(count<10){
            lblTime.setFont(f);
            lblTime.setForeground(Color.RED);
            lblTime.setText("00:0"+count);
           if(count==-1){
               t.stop();
                 lblTime.setText(null); 
           }
            }
            else{
                lblTime.setFont(f);
                lblTime.setForeground(Color.WHITE);
                 lblTime.setText("00:"+count); 
            }
             lblTime.setBounds(460,50,100,30);
             lblBackground.add(lblTime);
              }
          });
        
             t.start();
    }
       
                        static  JLabel lblQuest=new JLabel(); 
    static JLabel lblAnswer1=new JLabel();              static JLabel lblAnswer2=new JLabel();     
    static JLabel lblAnswer3=new JLabel();              static JLabel lblAnswer4=new JLabel();    
    
   static JLabel lblPic50=new JLabel();             static JLabel lblPic50_2=new JLabel();             static ImageIcon img50=new ImageIcon();
   static JLabel lblPicEveryOne=new JLabel();  static JLabel lblPicEveryOne_2=new JLabel();   static ImageIcon imgEveryOne=new ImageIcon();
   static JLabel lblPicPhone=new JLabel();       static JLabel lblPicPhone_2=new JLabel();         static ImageIcon imgPhone=new ImageIcon();
    
   static JLabel lblBackground=new JLabel();            
        
    static JLabel lblBalance=new JLabel();        ImageIcon imgBalance=new ImageIcon();
         
    static JLabel lblMinimize=new JLabel(); static JLabel lblClose=new JLabel();
    static JLabel lblAbout=new JLabel();       static JLabel lblHelp=new JLabel();
    JLabel lblPlay=new JLabel();JLabel lblPause=new JLabel();
    JLabel lblTime=new JLabel();
    JLabel lblContactUs =new JLabel();
    JLabel lblHelpApp=new JLabel();
    JLabel lblAboutMe=new JLabel();
    JLabel lblFB=new JLabel();
    
    
    JLabel lblDate=new JLabel();
    
    static PicturePath p=new PicturePath();
    setTextOn_Question_AND_Answer QA=new setTextOn_Question_AND_Answer();
    Notification noti=new Notification();
    static int x=0, y=0;
    @Override
    public void mousePressed(MouseEvent e) {  
         x=e.getX();
       y=e.getY();
    }
    @Override
    public void mouseReleased(MouseEvent me) {    }
    @Override
    public void mouseEntered(MouseEvent me) {    }
    @Override
    public void mouseExited(MouseEvent me) {
        //when mouse exit from label
        Close("exit1.png");
        Minimize("min1.png");
         About("about1.png");
         Pause("pause_1.png");
        Play("Play1.png");
        ContactUs("ContactUs_1.png");
        AboutMe("AboutMe_1.png");
        HelpApp("help_1.png");
         FB("fb_1.png");
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        setLocation(e.getXOnScreen()-x,e.getYOnScreen()-y);
    }
    @Override
    public void mouseMoved(MouseEvent e) {    }
 
}
