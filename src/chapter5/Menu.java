package chapter5;
public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Cпpaвкa по оператору:");
            System.out.println("    1. if");
            System.out.println("    2.switch");
            System.out.println("    3.While");
            System.out.println("    4.do-while");
            System.out.println("     5.for\n");
            System.out.println("Bыбepитe нужный пункт:");
            choice = (char) System.in.read();
        }
        while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch (выражение) { ");
                System.out.println("case константа:");
                System.out.println("последовательность операторов");
                System.out.println("break;");
                System.out.println("//...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do { ");
                System.out.println("oператор;");
                System.out.println(" } while (условие); ");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.println("for(инициaлизaция; условие; итерация)");
                System.out.println("oператор;");
                break;


        }

    }
}
