package com.ifeanyi.AmazonBooksApi.util;

import lombok.RequiredArgsConstructor;

import java.util.regex.Pattern;

@RequiredArgsConstructor
public class Util {

    public static boolean isEmailValid(String email) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);

        if (email == null)
            return false;
        return pattern.matcher(email).matches();

    }

    public static final String APIKEY_NAME_HEADER = "API_KEY";

}
