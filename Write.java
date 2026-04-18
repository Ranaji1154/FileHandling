import java.io.FileWriter;

public class Write {
    public static void main(String[] args) throws Exception {
        // try {
        //     OutputStreamWriter osw = new OutputStreamWriter(System.out);
        //     osw.write("Hello World");
        //     osw.write(97);
        //     osw.write(10);
        //     osw.write('A');
        //     osw.write('\n');
        //     char [] arr ="sFss xdvsef".toCharArray();
        //     osw.write(arr);

        //     // osw.flush();
        //     osw.close();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        try {
            FileWriter fw = new FileWriter(".Main.txt");
            fw.write("Hello World");
            fw.write(97);
            fw.write(10);
            fw.write('A');
            fw.write('\n');
            char [] arr ="sFss xdvsef".toCharArray();
            fw.write(arr);

            // fw.flush();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

