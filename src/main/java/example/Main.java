package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int os = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (os != 4) {
            System.out.println("Select operative system for build");
            System.out.println("\n 1. Windows \n 2. Mac \n 3. Linux \n 4. Exit");
            os = Integer.parseInt(br.readLine());
            System.out.println("Select style for build");
            System.out.println("\n 1. Vintage \n 2. Modern \n 3. Classic");
            int style = Integer.parseInt(br.readLine());
            new Application()
                    .withStyle(style)
                    .andOs(os)
                    .build();
        }
        System.err.println("<<< === FINISH PROCESS === >>>");

    }
}