public class Pattern {
    public static void main(String[] args) {
        
        int n = 7;


        for (int i = 1; i <= n; i++) {
            int temp = i;
            for (int j = 0; j < i; j++) {
                if (j == 0){
                    System.out.print(i + " ");
                }else {
                    temp += n;
                    System.out.print(temp + " ");
                }
            }
            System.out.println();
        }
    }
}
