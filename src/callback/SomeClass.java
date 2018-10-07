package callback;

import javax.swing.*;

public class SomeClass {

    interface Callback {
        void callingBack();
    }

    Callback callback;

    public void registerCallback(Callback callback) {
        this.callback = callback;
    }

    void doSomething() {
        JOptionPane.showMessageDialog(null,"Выполняется работа");


        callback.callingBack();
    }
}


