public class SharedObject {

    //make it private so cannot be accessed directly.
    static private volatile SharedObject sharedObject=null; //make this variable volatile so that its not refrenced in cache
    private SharedObject(){

    }
    public static SharedObject getInstance() {
            if (sharedObject == null) {
                synchronized (SharedObject.class) {
                    if (sharedObject==null) //double checking
                        sharedObject = new SharedObject();
                }
            }
            return sharedObject;
    }
}
