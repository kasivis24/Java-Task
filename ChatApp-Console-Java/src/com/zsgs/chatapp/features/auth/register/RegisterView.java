package com.zsgs.chatapp.features.auth.register;

import com.zsgs.chatapp.data.dto.RegisterInfo;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterView {

    private final RegisterModel registerModel;

    private final Scanner scanner = new Scanner(System.in);

    private final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public RegisterView() {
        registerModel = new RegisterModel(this);
    }


    public void onRegistrationSuccess(RegisterInfo info) {
        System.out.println("Registration Successfull!");
        init();
    }


    public void proceedRegistration() {
        System.out.println("Please provide the following info for registration");
        RegisterInfo info = new RegisterInfo();
        info.setMail(getMail());
        info.setPassword(getPassword());
    }


    private String getMail() {
        String mail = "";
        System.out.println("Enter mail");
        do {
            mail = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(mail);
            if (!matcher.matches())
                System.out.println("Please enter the valid mail\n\nEnter valid mail:");
            else break;
        } while (true);
        return mail;
    }

    private String getPassword() {
        String password = "";
        System.out.println("Enter password");
        do {
            password = scanner.nextLine();
            if (password.length() < 8 || password.length() > 32)
                System.out.println("Password should not be empty and length min 8 and max 32\n\nEnter valid password:");
            else break;
        } while (true);
        System.out.println("Confirm password");
        do {
            String confirmPassword = scanner.nextLine();
            if (!password.equals(confirmPassword))
                System.out.println("Password did not match. \n\nEnter confirm password again");
            else break;
        } while (true);
        return password;
    }

}
