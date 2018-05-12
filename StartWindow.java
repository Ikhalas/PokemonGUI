package pokemonmaster;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class StartWindow extends JFrame {
    
 
    Container c = getContentPane(); 
    JPanel cover = new JPanel();
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    Icon icon;
    JTextArea txArea;
    Random rand = new Random();
    JTextArea stat;
  
    
    public StartWindow (){
        
        super("PokemonGone"); 
        pokemons.add(new Pikachu());
        pokemons.add(new Diglett());
        pokemons.add(new Zubat());
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1700,800);
        cover.setLayout(new BorderLayout());
        setVisible(true);
        
        
    }
    
    
    public void mainWindow(){
        
        JLabel label = new JLabel("",JLabel.CENTER);
        Icon logo =  new ImageIcon(getClass().getResource("Logo.jpg"));
        label.setIcon(logo);
        JButton bt1 = new JButton("START");
        JButton bt2 = new JButton("CREDIT");
        JButton bt3 = new JButton("QUIT");
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        
        cover.add(label,BorderLayout.CENTER);
        cover.add(panel,BorderLayout.SOUTH);
        
        c.add(cover);
        
        bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cover.remove(label);
                cover.remove(panel);
                chooseWindow();
            }
        });
        
         bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cover.remove(label);
                cover.remove(panel);
                //********//
            }
        });
         
          bt3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                
            }
        });
        
        setVisible(true);
   
    }
    
    
    
    
    public void chooseWindow(){
        JLabel label = new JLabel("Choose your Partner",JLabel.CENTER);
        Icon poke1 =  new ImageIcon(getClass().getResource("Pikachu1.jpg"));
        Icon poke11 =  new ImageIcon(getClass().getResource("Pikachu2.jpg"));
        Icon poke2 =  new ImageIcon(getClass().getResource("Diglett1.jpg"));
        Icon poke22 =  new ImageIcon(getClass().getResource("Diglett2.jpg"));
        Icon poke3 =  new ImageIcon(getClass().getResource("Zubat1.jpg"));
        Icon poke33 =  new ImageIcon(getClass().getResource("Zubat2.jpg"));
        
        JButton bt1 = new JButton(poke1);
        bt1.setIcon(poke1);
        bt1.setRolloverIcon(poke11);
        JButton bt2 = new JButton(poke2);
        bt2.setIcon(poke2);
        bt2.setRolloverIcon(poke22);
        JButton bt3 = new JButton(poke3);
        bt3.setIcon(poke3);
        bt3.setRolloverIcon(poke33);
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel bigpanel = new JPanel();
        bigpanel.setLayout(new FlowLayout());
        
        panel1.add(bt1);
        panel2.add(bt2);
        panel3.add(bt3);
        bigpanel.add(panel1);
        bigpanel.add(panel2);
        bigpanel.add(panel3);
        
        bt1.addActionListener(new ActionListener() { //pikachu
            @Override
            public void actionPerformed(ActionEvent e) {
                cover.remove(label);
                cover.remove(bigpanel);
                pokeProfile(0);
                
            }
        });
        
         bt2.addActionListener(new ActionListener() { //diglett
            @Override
            public void actionPerformed(ActionEvent e) {
                cover.remove(label);
                cover.remove(bigpanel);
                pokeProfile(1);
                
            }
        });
         
          bt3.addActionListener(new ActionListener() { //zubat
            @Override
            public void actionPerformed(ActionEvent e) {
                cover.remove(label);
                cover.remove(bigpanel);
                pokeProfile(2);
            }
        });
        
        cover.add(label,BorderLayout.NORTH);
        cover.add(bigpanel,BorderLayout.WEST);
        c.add(cover);
        
        setVisible(true);
        pack();
        
        
    }
    
    
    public void pokeProfile(int i){
        
            JLabel label = new JLabel("New Profile",JLabel.CENTER);
            
            JLabel imglabel = new JLabel("",JLabel.CENTER);
            Icon poke =  new ImageIcon(getClass().getResource("Pika.png"));
            Icon poke1 =  new ImageIcon(getClass().getResource("Dig.png"));
            Icon poke2 =  new ImageIcon(getClass().getResource("Zu.png"));
            
            if(i==0)imglabel.setIcon(poke);
            if(i==1) imglabel.setIcon(poke1);
            if(i==2) imglabel.setIcon(poke2);
            
            JLabel name = new JLabel("NAME : ");
            JTextField name1 = new JTextField(10);

            JButton bt = new JButton("Gone!!");
            
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            
            panel.add(name);
            panel.add(name1);
            panel.add(bt);
            
            bt.addActionListener(new ActionListener() { //zubat
            @Override
            public void actionPerformed(ActionEvent e) {
                cover.remove(label);
                cover.remove(imglabel);
                cover.remove(panel);
                if(i==0){
                    pokemons.get(0).setName(name1.getText());
                    gameWindow(0,poke);
                }
                if(i==1){
                    pokemons.get(1).setName(name1.getText());
                    gameWindow(1,poke1);
                }
                if(i==2){
                    pokemons.get(2).setName(name1.getText());
                    gameWindow(2,poke2);
                }
                
            
        
            }
        });
            
            cover.add(label,BorderLayout.NORTH);
            cover.add(imglabel,BorderLayout.CENTER);
            cover.add(panel,BorderLayout.SOUTH);
            c.add(cover);
            setVisible(true);
            
            
                    
                       
        
    }
    
    public void gameWindow(int i,Icon icon){
        
        this.icon = icon;
        
        JButton bt1 = new JButton("EAT");
       
        JButton bt3 = new JButton("FIGHT!!");
        JPanel btpanel = new JPanel();
        btpanel.setLayout(new FlowLayout());
        btpanel.add(bt1);
      
        btpanel.add(bt3);
        
        
        txArea = new JTextArea(10,30);
       
                
                
        JLabel img = new JLabel();
        img.setIcon(icon);
        
        JTextArea name = new JTextArea(1,15);
        JPanel panel = new JPanel();
        panel.add(name);
        
        JPanel txpanel = new JPanel();
        txpanel.setLayout(new BoxLayout(txpanel,BoxLayout.Y_AXIS));
        txpanel.add(img);
        txpanel.add(panel);
        
        JPanel cover2 = new JPanel();
        cover2.setLayout(new FlowLayout());
        
      
         txArea.setText(print(pokemons,i));
         name.setText("NICKNAME :"+pokemons.get(i).getName());
       
         bt1.addActionListener(new ActionListener() { //eat
            @Override
            public void actionPerformed(ActionEvent e) {
                Eat(i);
            }
        });
         
         
         bt3.addActionListener(new ActionListener() { //fight
            @Override
            public void actionPerformed(ActionEvent e) {
                cover.remove(btpanel);
                cover.remove(cover2);
            
                fightWindow(i,icon);
            }
        });
         
 
        cover2.add(txArea);
        cover2.add(txpanel);
        cover.add(btpanel,BorderLayout.NORTH);
        cover.add(cover2,BorderLayout.CENTER);
        c.add(cover);
        
        
        setVisible(true);
        
     
    }
    
    
    public void fightWindow(int i,Icon icon){
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        
        stat = new JTextArea(1,20);
        
        Icon Mpoke =  new ImageIcon(getClass().getResource("Mpoke.png"));
        JLabel Mpoke1=new JLabel(Mpoke);
        
        Icon vs =  new ImageIcon(getClass().getResource("vs.png"));
        JLabel vs1 = new JLabel(vs);
        
        JLabel img = new JLabel();
        img.setIcon(icon);
        
        JButton bt1 = new JButton("ATTACK");
        JButton bt2 = new JButton("BACK");
        
        panel1.add(img);
        panel1.add(vs1);
        panel1.add(Mpoke1);
        
        
        panel2.add(stat);
        panel2.add(bt1);
        panel2.add(bt2);
        
        
         bt1.addActionListener(new ActionListener() { //atk
            @Override
            public void actionPerformed(ActionEvent e) {
                Attack (i);
                if(pokemons.get(i).health == 0){
                  cover.remove(panel1);
                  cover.remove(panel2);
                  deadWindow();
                }
            }
        });
         
         bt2.addActionListener(new ActionListener() { //atk
            @Override
            public void actionPerformed(ActionEvent e) {
                cover.remove(panel1);
                cover.remove(panel2);
                gameWindow(i,icon);
               
            }
        });
        
        
        cover.add(panel1,BorderLayout.NORTH);
        cover.add(panel2,BorderLayout.SOUTH);
        
        c.add(cover);
        
        setVisible(true);
        
        
        
        
        
    }
    
    public void Attack (int index){
        int random = rand.nextInt(2);
        
        if(random == 0){
            stat.setText("YOU WIN !!");
        } 
        if(random == 1){
            stat.setText("YOU LOSE !! Your Pokemon is injured. ");
            pokemons.get(index).reducedHealth(rand.nextInt(30));
   
        }
    }
    

    
    public void Eat(int index){
        Foods berry = new Foods(1);
        pokemons.get(index).eat(berry);
        txArea.setText(print(pokemons,index));
        
    }
    

    public String print(ArrayList<Pokemon> pokemons,int index){
        String hp = " ======== Pokemon ======== \n"+"  Health: "+pokemons.get(index).getHealth()+"/"+pokemons.get(index).maxHealth;
        String weight = "\n  Weight: "+pokemons.get(index).getWeight()+"/100.0";        
        return hp+weight;
    }
    
    public void deadWindow(){
        JLabel text = new JLabel(" Your Pokemon dies TT");
        
        cover.add(text,BorderLayout.CENTER);
        c.add(cover);
        
        chooseWindow();
        setVisible(true);
    }
    
    
}
        
        