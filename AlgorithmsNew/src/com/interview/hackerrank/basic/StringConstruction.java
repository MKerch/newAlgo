package com.interview.hackerrank.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringConstruction {

    //Todo
    public static void main(String[] args) {
//        System.out.println(stringConstruction("scfg"));
//        System.out.println(stringConstruction("bccb"));
        System.out.println(stringConstruction("gbcebabbfffcdgfeeaadecaeecabbabbgcafeabgecfeffcbafgdegdacefcadabbfdcgcebegbfgeeebfegfacdagbbgeagaaceefcaedceacceebdgebeecedcbdbeebecgcfcgdaaaegfbcbfffccffabbceafaagdedadbfcaedaffbaggebfedegfabefafefgdbafedbggabccaedabfgfgggbcfgeggdcdfeebaedaaccefgegbffaaggdcbbbfdbgaaffbbgcfafccdgcaabccbfbgbabegddagcgfbcdfdaccegbabfedbbdaddebddgegedgaabebfeeggddagaeececcafdgddceddcbdagaecceacgfabgccecgecgcefaafcaedfccdeeceffefadeffefggaeggbbfgcacgfaeefbfbccggcbcgeagcaacdcbegcdaacdgbebdaabddeagafbfagfebfefffcbcgefbcfeggafccabfagegccefe"));
    }

    public static int stringConstruction(String s) {
        List<String> set = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(String.valueOf(s.charAt(i)))) {
                set.add(String.valueOf(s.charAt(i)));
                count++;
                break;
            } else {
                set.add(String.valueOf(s.charAt(i)));
                count++;
            }
        }
        return count;
    }

}
