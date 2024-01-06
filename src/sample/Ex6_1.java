package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6_1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("数字を入力");

        try {
            System.out.println("本日の降水確率を入力して下さい。");
            String line = reader.readLine();
            int i = Integer.parseInt(line);
            System.out.println("本日の降水確率は" + i + "%でよろしいですね?");
            if (i >= 100) {
                System.out.println("本日の降水確率は\"+i+\"%でよろしいですね?");
            } else if (i >= 50) {
                System.out.println("傘を持っていった方がいいでしょう。");
            } else {
                System.out.println("傘は必要ないです。");
            }

        } catch (IOException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println("入力が正しくありません。");
        }
    }
}