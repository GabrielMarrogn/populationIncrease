import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int anos;
        int cidade1 = 0;
        int cidade2 = 0;

        for (int i = 0; i < a; i++) {
            anos = 0;
            String x = br.readLine();
            String[] arr = x.split(" ");
            cidade1 = Integer.parseInt(arr[0]);
            cidade2 = Integer.parseInt(arr[1]);
            double g1 = Double.parseDouble(arr[2]);
            double g2 = Double.parseDouble(arr[3]);

            while (cidade2 >= cidade1) {
                cidade1 += (cidade1 * g1) / 100;
                cidade2 += (cidade2 * g2) / 100;;
                anos++;
                if (anos > 100) {
        			break;
        		}
            }
            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            }else{
                System.out.println(anos +" anos.");
            }
        }
        br.close();
    }
}
