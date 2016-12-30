package com.tiy.practice;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by crci1 on 12/28/2016.
 */
public class StringThree {


    public String makeChanges(String base, String remove) {
        StringBuilder stringBuilder = new StringBuilder();
        String secBase = base.toLowerCase();
        String secRemove = remove.toLowerCase();
        StringBuilder stringBuilderLoop = new StringBuilder(secBase);
        String[] holder;

        if (remove.equals(remove.toUpperCase()) ||
                !remove.equals(secRemove)
                || (base.contains(remove.toUpperCase())) && base.contains(remove.toLowerCase())) {
            stringBuilder.append(base);
            while (stringBuilderLoop.toString().contains(secRemove)) {

                int baseNum = stringBuilderLoop.indexOf(secRemove);
                int removeNum = stringBuilderLoop.indexOf(secRemove) + secRemove.length();

                stringBuilder.delete(baseNum, removeNum);
                stringBuilderLoop.delete(baseNum, removeNum);

            }
            if (stringBuilder.toString().contains(" ") && stringBuilder.length() > 3) {
                stringBuilder.deleteCharAt(stringBuilder.indexOf(" "));
            }
        } else {

            if (remove.equals(secRemove)) {
                holder = base.split(remove);

            } else {
                holder = base.split(secRemove);
            }
            for (String s : holder) {


                if (s.equals(" ")) {
                    continue;
                }
                stringBuilder.append(s);
            }
        }

        String finshString = new String(stringBuilder);
        return finshString;
    }

}
