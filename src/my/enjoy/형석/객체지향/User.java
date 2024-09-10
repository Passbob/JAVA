package my.enjoy.형석.객체지향;

public class User {
    Phone phone = new Phone();

    public void setActivity(int activity) {
        phone.setActivity(activity);
    }

    public void pushButton(){
        phone.button();
    }

    public boolean clearPatton(){
        boolean isPass = phone.isPatton();
        return isPass;
    }

    public void clickApp(){

        phone.playApp();
    }

    public void closeApp(){
        phone.closeApp();
    }


}
