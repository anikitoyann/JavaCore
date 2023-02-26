package chapter12.chaper1;

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("net");
                break;
            case YES:
                System.out.println("da");
                break;
            case MAYBE:
                System.out.println("Boзмoжнo");
                break;
            case LATER:
                System.out.println("Пoзднee");
                break;
            case SOON:
                System.out.println("Bcкope");
                break;
            case NEVER:
                System.out.println("Hикoгдa");
                break;
        }

    }
    public static void main(String args[]){
        Qusetion q=new Qusetion();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}

