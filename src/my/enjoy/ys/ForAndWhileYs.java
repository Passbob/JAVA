package my.enjoy.영석;

public class ForAndWhileYs {

    public static void main(String[] args) {
        my.enjoy.영석.ForAndWhileYs gugu = new my.enjoy.영석.ForAndWhileYs();
        gugu.Gugu();
    }

    public void Gugu(){

        for(int i=2; i<10; i++){
            for (int j = 1; j<10; j++){
                if(j>=4){
                    break;
                }
                int result = i*j;

                if(result%2 != 0){
                System.out.println(i + " * " + j + "=" + result);
                }
            }
        }
    }
}
