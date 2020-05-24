import org.omg.CORBA.PUBLIC_MEMBER;

class Singleton{
    private Singleton(){};

    private static volatile Singleton sing;

    public  static synchronized  Singleton getSing(){
         if(sing==null){
             synchronized(Singleton.class){
                 if(sing==null)
                     sing=new Singleton();
             }
         }
         return  sing;
    }


}

class wpc{

    public static void main(String[] args) {

    }


}