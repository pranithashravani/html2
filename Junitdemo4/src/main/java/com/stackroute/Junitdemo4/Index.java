package com.stackroute.Junitdemo4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Index {
    public List<String> occurences(String regex, String text) {
        String sw = "";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> list = new ArrayList<String>();
        if (matcher.find()) {
            while (matcher.find()) {

                sw = "Found at: " + matcher.start() +
                        " - " + (matcher.end() - 1);
                list.add(sw);
            }

            return list;
        }
        else
            return null;

    }
}
