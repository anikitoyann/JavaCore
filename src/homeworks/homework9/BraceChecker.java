package homeworks.homework9;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {

        this.text = text;
    }

    public void check() {
        Stack myStack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char end;
            switch (c) {

                case '[':
                case '(':
                case '{':
                    myStack.push(c);
                    break;
                case '}':
                    end = (char) myStack.pop();
                    if (end == 0) {
                        System.out.println("not opened " + " but closed" + c + " at " + i);
                    } else if (end != '{') {
                        System.out.println("Error: Opened" + end + " but Closed" + c + " at" + " " + i);
                    }
                    System.out.println();
                    break;

                case ')':
                    end = (char) myStack.pop();
                    if (end == 0) {
                        System.out.println("not opened " + "but closed" + c + " at " + i);
                    } else if (end != '(') {
                        System.out.print("Error: Opened" + end + " but Closed" + c + "at" + " " + i);
                    }
                    System.out.println();
                    break;

                case ']':
                    end = (char) myStack.pop();
                    if (end == 0) {
                        System.out.println("not opened " + " but closed" + c + " at " + i);
                    } else if (end != '[') {
                        System.out.print("Error: Opened" + end + " but closed" + c + "at " + i);
                    }
                    System.out.println();

                    break;
            }
        }
        // char end;
        //  while ((end=(char)myStack.pop())!= 0) {
        //     System.err.println("Error:opened " + end + " but not closed");
        while (!myStack.isEmpty()) {
            System.out.println("opened" + (char)myStack.pop() + "but not closed");
        }

    }
}







