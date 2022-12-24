package TPMODULE3_ANPABELT;
public  class Restaurant implements Runnable {
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run() {
        while (true){
            makeFood();
            try {
                Thread.sleep(100000);

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        
    }

    public void setWaitingForPickup(boolean waitingForPickup){
        this.waitingForPickup = waitingForPickup;
    }
    public static int getFoodNumber(){
        return foodNumber;
    }

    public void makeFood (){
        synchronized (Restaurant.lock){
            if (this.waitingForPickup){
                try{
                System.out.println("Restaurant: Waiting for the Waiter to deliver the food");
                Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            waitingForPickup = true;
            System.out.println("Restaurant:  Making Food Number " + foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the waiter to get the food\n");
        }
    }
    public static Object getLock(){
        return lock;
    }

}
