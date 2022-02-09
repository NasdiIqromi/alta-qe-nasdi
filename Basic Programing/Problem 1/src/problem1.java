public class problem1 {
        private static int pangkat(int a,int b){
            int pangkat = (int) Math.pow(a, b);

            return pangkat;
        }

        public static void main(String[] args) {
            System.out.println(pangkat(2, 3));
            System.out.println(pangkat(5, 3));
            System.out.println(pangkat(10, 2));
            System.out.println(pangkat(2, 5));
            System.out.println(pangkat(7, 3));
        }

}
