package com.codewithmosh.mediator;

import java.util.logging.SocketHandler;

public class SignUpDialogBox {
    private CheckBox contract = new CheckBox();
    private TextBox userName = new TextBox();
    private TextBox password = new TextBox();
    private Button save = new Button();

    public SignUpDialogBox() {
        contract.registerEventHandler(this::execConditionChange);
        userName.registerEventHandler(this::execConditionChange);
        password.registerEventHandler(this::execConditionChange);
    }

    public void simulateUserInteraction(){
        userName.setContent("daniel");
        password.setContent("123");
        printStatus();

        contract.setChecked(true);
        printStatus();
    }

    void execConditionChange(){
        boolean isChecked = contract.isChecked();
        String userStr = userName.getContent();
        boolean user = (userStr == null || userStr.isEmpty());
        String passStr = password.getContent();
        boolean pass = (passStr == null || passStr.isEmpty());

        save.setEnabled(isChecked && !user && !pass);
    }

    void printStatus(){
        System.out.println("Checking sign up form ...");
        System.out.println("Username: "+ userName.getContent());
        System.out.println("Password: "+ password.getContent());
        System.out.println("Contract: "+ (contract.isChecked()?"Checked":"Unchecked"));
        System.out.println("Button: " + (save.isEnabled()?"Enabled":"Disabled"));
    }

}
