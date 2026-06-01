package TestPad;

public class QuestionBank11 {

    // in TestPad
    void reverseStringUsingStack(){}

    // in TestPad
    void reverseQueue(){}

    // Implement Circular Q using array - https://www.programiz.com/dsa/circular-queue
    void circularQueueUsingArr(){}

    void IntelligentCodeEditor(){
            public int countMinReversals(String s){

            int bracketCount = 0;

            for (char ch : s.toCharArray()) {
                if (ch == '{' || ch == '}') {
                    bracketCount++;
                }
            }

            // odd number of brackets can never balance
            if (bracketCount % 2 != 0) {
                return -1;
            }

            Stack<Character> st = new Stack<>();

            for (char ch : s.toCharArray()) {

                // ignore other chars
                if (ch != '{' && ch != '}') {
                    continue;
                }

                if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
                    st.pop();
                } else {
                    st.push(ch);
                }
            }

            int open = 0;
            int close = 0;

            while (!st.isEmpty()) {

                if (st.pop() == '{') {
                    open++;
                } else {
                    close++;
                }
            }

            return (open + 1) / 2 + (close + 1) / 2;
        }
    }
}
