public class BinaryTriangle {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {

            int num;

            // decide starting value
            if (i % 2 == 0) {
                num = 0;
            } else {
                num = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");

                // toggle between 0 and 1
                if (num == 0) {
                    num = 1;
                } else {
                    num = 0;
                }
            }

            System.out.println();
        }
    }
}

