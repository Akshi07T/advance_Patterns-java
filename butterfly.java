public class butterfly {
    public static void main(String[] args){
        int n=4;

        for(int i=1; i<=n; i++){
            //star1
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
