package servelt_code;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8080);
        tomcat.getConnector();
        Context context = tomcat.addContext("", System.getProperty("java.io.tmpdir"));

        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");
        
        tomcat.start();
        System.out.println("Server started at: http://localhost:8080/hello");
        tomcat.getServer().await();



        // try{
        //     tomcat.start();
        // }catch(Exception e){
        //     e.printStackTrace();
        // }
    }
}
