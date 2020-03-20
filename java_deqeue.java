    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            HashMap<Integer, Integer> elementCount = new HashMap<Integer,Integer>();
            int n = in.nextInt();
            int m = in.nextInt();

            int max = 0;
            for (int i = 0; i < n; i++) {
                if (i >= m) {
                    int lastElement = deque.removeFirst();
                    if (elementCount.get(lastElement) == 1) {
                        elementCount.remove(lastElement);
                    } else {
                        elementCount.merge(lastElement, -1, Integer::sum);
                    }
                }

                int num = in.nextInt();

                deque.addLast(num);
                elementCount.merge(num, 1, Integer::sum);

                max = Math.max(max, elementCount.size());
                if (max == m) {
                    break;
                }
            }

        System.out.println(max);
        }
    }



