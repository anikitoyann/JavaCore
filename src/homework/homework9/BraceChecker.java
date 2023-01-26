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

                case '[':
                case '(':
                case '{':
                    myStack.push(c);
                    break;

                case '}':
                    char end = (char) myStack.pop();
                    if (end != '{') {
                        System.out.println("Error: Opened" + end + " but Closed" + c + " at" + " " + i);
                    }
                    break;

                case ')':
                    end = (char) myStack.pop();
                    if (end != '(') {
                        System.out.print("Error: Opened" + end + " but Closed" + c + "at" + " " + i);
                    }
                    break;

                case ']':
                    end = (char) myStack.pop();
                    if (end != '[') {
                        System.out.print("Error: Opened" + end + " but closed" + c + "at " + i);
                    }
                    break;
            }

        }
    }
}