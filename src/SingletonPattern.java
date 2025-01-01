 class Browser{

    private static Browser browser;
     //Private constructor to prevent/avoid instantion
    private Browser(){

    }
    //Public static method to call this mehtod outside the class with Class name to create object
    public static Browser getInstance(){


        if(browser == null){
            browser = new Browser();
        }
        return browser;
    }

}



public class SingletonPattern {
    public static void main(String[] args) {

        Browser b1 = Browser.getInstance();
        Browser b2 = Browser.getInstance();
        System.out.println(b1);
        System.out.println(b2);
    }
}