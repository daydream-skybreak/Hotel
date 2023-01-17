import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Services {
    class CheckInOut{
        void checkIn() {
            String temp[] = new String[5];
            String temps, fN, lN;
            /* customer object is here */
            Customer cust = new Customer();

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter First name and Last name in the following format => {<first_name> <last_name>}");
            while (true) {
                temps = scan.nextLine();
                try{
                    temp = temps.split(" ");
                    if (Array.getLength(temp) != 2) throw new Exception("Enter name correctly");
                    cust.setfName(temp[0]);
                    cust.setlName(temp[1]);
                    break;
                }
                catch(Exception e) {
                    System.out.println(e);
                }
            }
            // getting check in and
            System.out.println("Enter check in date in the following format {<day> <month> <year>");
            while (true) {
                temps = scan.nextLine();
                try{
                    temp = temps.split(" ");
                    if (Array.getLength(temp) != 3){
                        throw new NoSuchElementException("you didn't enter any input.\n Please enter  a correct input");
                    }
                    cust.setcInDays(temp);
                    System.out.println("How many days would you be staying with us: ");
                    break;
                }
                catch(NoSuchElementException e){
                    System.out.println(e);
                }
                catch(Exception e) {
                    System.out.println("Enter name correctly");
                }
            }
        }
    }
    class Restaurant{
        private String[] headChef = new String[2];
        private String[] sueChef = new String[2];
        private static  float profit = 0.25f;
        void foods(){}

        public String getHeadChef() {
            return "Name: Head Chef " + this.headChef[0] + " " + this.headChef[1];
        }

        public void setHeadChef(String[] headChef) {
            this.headChef = headChef;
        }

        public String getSueChef() {
            return "Name: Sue Chef" + this.sueChef[0] + " " + this.sueChef[1];
        }

        public void setSueChef(String[] sueChef) {
            this.sueChef = sueChef;
        }

        void restock(String type, int amount){

        }

    }
    class Exotics{
        void useSpa(Customer cust){}
        void useSwimmingPool(Customer cust){}
        void useCinema( Customer cust){}
    }
}
