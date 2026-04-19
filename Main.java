
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.OutputStreamWriter;
// import javax.swing.JFrame;


// public class Main extends JFrame {

//     // JPanel mainPanel;
//     // Frame(){
//     //     mianPanel = new JPanel();
//     //     mainPanel.setLayout(new VerticalLayout());
//     //     TitledBorder main_t= new TitledBorder("Main Panel");
//     //     main_t.setTitleJustification(TitledBorder.CENTER);
//     //     main_t.setTitlePosition(TitledBorder.TOP);

//     //     mainPanel.setBorder(main_t);



//     //     add(mainPanel);

//     //     setTitle("My Frame");
//     //     setSize(400, 400);
//     //     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     //     setVisible(true);


//     // }

//     public static void main(String[] args) throws Exception {

//         // try {
//         // InputStreamReader isr = new InputStreamReader(System.in);
//         // int a = isr.read();
//         // while (isr.ready()) {
//         // System.out.print((char) a);
//         // a = isr.read();
//         // }
//         // isr.close();
//         // System.out.println( );
//         // } catch (Exception e) {
//         // e.printStackTrace();
//         // }

//         // FILE READER

//         // try {
//         // FileReader fr = new FileReader(".Main.txt");
//         // fr.read();
//         // while (fr.ready()) {
//         // System.out.print((char) fr.read());
//         // }
//         // fr.close();

//         // }catch (Exception e) {
//         // e.printStackTrace();
//         // }

//         // BUFFERED READER

//         // try {
//         // BufferedReader br = new BufferedReader(new FileReader(".Main.txt"));
//         // String line = br.readLine();
//         // while (line != null) {
//         // System.out.println(line);
//         // line = br.readLine();
//         // }
//         // } catch (Exception e) {
//         // e.printStackTrace();
//         // }
        
//         try {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String line = br.readLine();
//         while (line != null) {
//         System.out.println(line);
//         line = br.readLine();
//         }
//         } catch (Exception e) {
//         e.printStackTrace();
//         }

//         // writer
//         // OUTPUTSTREAM WRITER
//         // try {
//         //     OutputStreamWriter osw = new OutputStreamWriter(System.out);
//         //     osw.write("Hello World");
//         //     osw.write(87);
//         //     osw.write(111);
//         //     osw.write(108);

//         //     osw.write(100);
            
//         //     char[] arr = { 'H', 'e', 'l', 'l', 'o' };
//         //     osw.flush();
//         //     osw.close();

//         // } catch (Exception e) {
//         //     e.printStackTrace();

//             // try {
//             // FileWriter fw = new FileWriter(".Main.txt");
//             // fw.write("Hello World");
//             // fw.close();

//             // BufferedReader br = new BufferedReader(new FileReader(".Main.txt"));
//             // String line = br.readLine();
//             // while (line != null) {
//             // System.out.println(line);
//             // line = br.readLine();
//             // }
//             // } catch (Exception e) {
//             // e.printStackTrace();
//             // }

//         // }
//     }

// }
