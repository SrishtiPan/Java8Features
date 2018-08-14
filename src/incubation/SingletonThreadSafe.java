package incubation;

public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;
    
    private SingletonThreadSafe(){}
    
    public static synchronized SingletonThreadSafe getInstance(){
        if(instance == null){
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
    
}