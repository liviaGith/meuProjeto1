package metodos;


import org.openqa.selenium.JavascriptExecutor;


import static testes.Junit.driver;

public class Metodos {
     public void scroll(int n1 , int n2){
         try {
             JavascriptExecutor js = (JavascriptExecutor) driver;
             js.executeScript("window.ScrollBy(" + n1 + n2 + ")");
         }catch (Exception e){
             e.getCause();
             System.err.println("o comando não pode ser executado ");
         }
     }






}
