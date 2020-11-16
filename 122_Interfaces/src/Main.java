public class Main {

    public static void main(String[] args) {

        ITelephone myPhone = new DeskPhone(202215112);
        myPhone.powerOn();
        myPhone.callPhone(112);
        myPhone.answer();

        myPhone = new MobilePhone(303609564);
        myPhone.powerOn();


    }
}
