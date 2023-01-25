package homework.homework9;


public class BraceChecker {
    private String text;

    public BraceChecker(String text) {

        this.text = text;
    }

    public void check() {
        Stack myStack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {

                case '{':
                case '(':
                case '[':
                    myStack.push(c);
                    break;

                case '}':
                    char end = (char) myStack.pop();
                    if (end != '}') {
                        System.out.print("Error: Opened" + c + " but closed" + end + " at" + " " + i);
                    } else {
                        System.out.println("No Error");
                    }
                    break;

                case ')':
                    end = (char) myStack.pop();
                    if (end != ')') {
                        System.out.print("Error: Opened" + c + " but closed" + end + "at" + " " + i);
                    } else {
                        System.out.println("No Error:");
                    }
                    break;

                case ']':
                    end = (char) myStack.pop();
                    if (end != ']') {
                        System.out.print("Error: Opened" + c + " but closed" + end + " but closed" + end + "at" + " " + i);
                    } else {
                        System.out.println("No Error");
                    }

                    break;
            }

        }
    }
}