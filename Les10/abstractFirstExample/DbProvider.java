package Les10.abstractFirstExample;

public abstract class DbProvider {
    private String dbHost;
   abstract void connectToDb();
   abstract void disconectFromDb();
   void printDbHost(){
       System.out.println("DBHost is "+dbHost);

   }
}
