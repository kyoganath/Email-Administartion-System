package EmailAdministrationApplication;

public class EmailApp {
   public static void main(String[] args) {
         Email em1 = new Email("Yoganath", "Kuruva");
         em1.setAlternateEmail("kuruvayoganath08@gmail.com");
      //    System.out.println(em1.getAlternateEmail());
            System.out.println(em1.showInfo());
         
         // Uncomment the following lines to test other functionalities
         // em1.setDepartment("Sales");
         // em1.setMailBoxCapacity(500);
         // em1.setAlternateEmail("
   } 
}
