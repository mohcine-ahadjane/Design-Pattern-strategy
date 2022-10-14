import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Context context = new Context();
        context.appliquerStrategy();
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.print("Donner le nom de la strategie : ");
            String strategyClassName=scanner.nextLine();
            IStrategy strategy=(IStrategy) Class.forName(strategyClassName).newInstance();
            context.setStrategy(strategy);
            context.appliquerStrategy();
        }

    }
}