package callback;

import javax.swing.*;

public class SomeClass {

    String replyTo;

    interface Callback {
        void callingBack(String message);
    }

    private Callback callback;

    public void registerCallback(Callback callback) {
        this.callback = callback;
    }

    void doSomething() {
        int reply = JOptionPane.showConfirmDialog(null,"Вы программист?", "Опрос", JOptionPane.YES_NO_OPTION);

        switch (reply) {
            case JOptionPane.NO_OPTION:
                replyTo = "Net";
                break;
            case JOptionPane.YES_OPTION:
                replyTo = "Da";
                break;
        }

        callback.callingBack(replyTo);
    }
}


