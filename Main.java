//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int sum(int num) {

        if (num == 0) {
            return 0;
        } else {
            return num + sum(num - 1);
        }
    }

    public static void main(String[] args) {
       int num = 3;
       int r = 0;

        for (int i = 0; i <= num; i++){
            r = sum(i);
            System.out.print(r + " + " );
        }

        System.out.println("= " + r);

    }


}