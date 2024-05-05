public class main {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(500);
                    System.out.println(SharedObject.getInstance());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        });
        t.start();
        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    //Thread.sleep(500);
                    System.out.println(SharedObject.getInstance());
                    Thread.sleep(700);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        });
        t2.start();


    }
}
