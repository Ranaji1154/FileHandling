import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;



public class Frame extends JFrame implements KeyListener {
    JPanel mainPanel;
    JPanel subPanel1;
    JPanel subPanel2;
   
    JTextArea text_a;
    JTextArea note_a;
    JButton button;
    File file;
    
    Frame(){
        file= new File(".Main.txt");
        
        text_a = new JTextArea(1,15);
        button = new JButton("bhej do");

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new GridLayout(2, 1));
        TitledBorder main_t= new TitledBorder("Main Panel");
        main_t.setTitleJustification(TitledBorder.LEFT);
        main_t.setTitlePosition(TitledBorder.CENTER);
        mainPanel.setSize(400, 400);
        mainPanel.setBorder(main_t);
        
      
       
        // // mainPanel.addFocusListener((FocusListener) this.main_a);
        // mainPanel.addKeyListener(this);
        // mainPanel.setFocusable(true);
        // mainPanel.requestFocusInWindow();



        subPanel1 = new JPanel();
        subPanel1.setLayout(new GridBagLayout());
        TitledBorder sub_t1 = new TitledBorder("Sub Panel 1");  
        sub_t1.setTitleJustification(TitledBorder.LEFT);
        sub_t1.setTitlePosition(TitledBorder.TOP);
        subPanel1.setBorder(sub_t1);
        subPanel1.setBounds(0, 50, 200, 200);

        text_a.setFocusable(true);
        text_a.addKeyListener((this));
    
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        subPanel1.add(button, gbc);
        
        gbc.gridx++;
        subPanel1.add(text_a, gbc);
        // subPanel1.add(new JScrollPane(text_a), gbc);
        gbc.gridx++;
        subPanel1.add(button);

        




        subPanel2 = new JPanel();
        subPanel2.setLayout(new GridBagLayout());
        TitledBorder sub_t2 = new TitledBorder("Sub Panel 2");
        sub_t2.setTitleJustification(TitledBorder.LEFT);
        sub_t2.setTitlePosition(TitledBorder.TOP);
        subPanel2.setBorder(sub_t2);

        note_a = new JTextArea(5, 20);

        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.gridx = 0;
        gbc2.gridy = 0;
        gbc2.fill = GridBagConstraints.BOTH;
        gbc2.weightx = 1.0;
        gbc2.weighty = 1.0;
        note_a.setFocusable(false);
        note_a.setEditable(false);
        subPanel2.add(new JScrollPane(note_a), gbc2);








        mainPanel.add(subPanel1);
        mainPanel.add(subPanel2);
      
        add((mainPanel));

        button.addActionListener(e ->{
            String note = text_a.getText().trim();
            if(!note.isEmpty()){
                write(note);
                note_a.append(note +"\n");
                text_a.setText("");
                text_a.setFocusable(true);
                text_a.addKeyListener((this));
                
            }
        });
        setTitle("My Frame");
        setSize(500, 500);
        addKeyListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }



    public static void main (String[] args) throws Exception {
        Frame f = new Frame();
        f.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        // System.out.println("Key Typed at:"+e.getKeyChar());
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if(e.getKeyCode()==KeyEvent.VK_SHIFT){
            String note = text_a.getText().trim();
            
            if(!note.isEmpty()){
                write(note);
                note_a.append(note +"\n");
                text_a.setText("");
                text_a.setFocusable(true);
                text_a.addKeyListener((this));  
            }
        }
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
        // System.out.println("Key Released at:"+e.getKeyChar());
    }
    public void write(String note){
        try {
            FileWriter fw = new FileWriter(file, true); // true for append mode
            fw.write(note + "\n");
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        

    
}
