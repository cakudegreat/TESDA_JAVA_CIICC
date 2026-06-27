public class Task8 {
        // Method with variable arguments
        public static int cumulativeSum(int... numbers) {
            int total = 0;
            for (int n : numbers) {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println("Sum up to " + n + " = " + sum);
                total += sum;
            }
            return total;
        }

        public static void main(String[] args) {
            int result = cumulativeSum(4, 5, 10);
            System.out.println("Total cumulative sum = " + result);
        }
    }


