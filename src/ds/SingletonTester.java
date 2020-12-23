
public class SingletonTester {
	 public static void main(String[] args) {
	       /* //Instance 1
	        SingletonClass instance1 = SingletonClass.getInstance();

	        //Instance 2
	        SingletonClass instance2 = SingletonClass.getInstance();

	        //now lets check the hash key.
	        System.out.println("Instance 1 hash:" + instance1.hashCode());
	        System.out.println("Instance 2 hash:" + instance2.hashCode()); */ 
	   
		 //Instance 1
		 //Create the 1st instance
	        SingletonClass instance1 = SingletonClass.getInstance();
	        
	        //Create 2nd instance using Java Reflection API.
	        SingletonClass instance2 = null;
	        try {
	            Class<SingletonClass> clazz = SingletonClass.class;
	            Constructor<SingletonClass> cons = clazz.getDeclaredConstructor();
	            cons.setAccessible(true);
	            instance2 = cons.newInstance();
	        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException | InstantiationException e) {
	            e.printStackTrace();
	        }
	 
	 }

}



 class SingletonClass {

    private static volatile SingletonClass sSoleInstance;

    private SingletonClass(){}  //private constructor.

    public static SingletonClass getInstance(){
        if (sSoleInstance == null){ //if there is no instance available... create new one
          
        	sSoleInstance = new SingletonClass();
          
           }

        return sSoleInstance;
    }
}