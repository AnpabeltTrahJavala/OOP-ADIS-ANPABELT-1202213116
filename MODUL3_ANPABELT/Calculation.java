public class Calculation implements Runnable {
    private  double radius;
    private  double side;
    private  double area;
    static double phi = 3.14;
    private static final getSquare luas = new double();



    @Override
    public void run() {
            try {
                Thread.sleep(300000);
                System.out.println("Starting with thread 3");
                System.out.println("Starting with thread 2");
                System.out.println("Starting with thread 1");

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        


    public void setSquare(){
        try{
            if(side<1){
                System.out.println("java.lang.illegalArgumentException");
            }
            double luas = side*side;
        }
         catch (Exception e){
         e.printStackTrace();
         
        }
        
    }
    public void getSquare(){
        return luas;
    }


    public void setCircle(){
        try{
            if(side<1){
                System.out.println("java.lang.illegalArgumentException");
            }
            double luas2 = phi*side*side;
        }
         catch (Exception e){
         e.printStackTrace();
         
        }
        
    }
    public void getCircle(){
        return luas2;
    }



    public void setTrapezoid(double a, double b, double t){
        try{
            if(side<1){
                System.out.println("java.lang.illegalArgumentException");
            }
            double luas2 = (a+b)/2;
        }
         catch (Exception e){
         e.printStackTrace();
         
        }
        
    }
    public void getTrapezoid(){
        return luas3;
    }

        

}
