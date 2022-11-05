package com.interview;

public class DiscountInString {

    private static final String dollar = "$";
    private static final String emptyString = " ";

    public static void main(String[] args) {
        String sentence = "there are $1 $2 and 5$ candies in the shop";
        int discount = 50;
        System.out.println(discountPrices(sentence, discount));
    }

    public static String discountPrices(String sentence, int discount) {
        StringBuilder result = new StringBuilder();
        String[] ar = sentence.split(emptyString);
        for (int i = 0; i < ar.length; i++) {
            String current = ar[i];
            if (current.startsWith(dollar)) {
                String without$ = current.substring(1);
                try {
                    if (discount == 100) current = "0.00";
                    else {
                        int okInt = Integer.parseInt(without$);
                        current = parce2(okInt, discount);
                    }
                    result.append(dollar).append(current);
                    result.append(emptyString);
                } catch (Exception e) {
                    continue;
                }
                continue;
            }
            result.append(ar[i]);
            result.append(emptyString);
        }
        int i = result.lastIndexOf(emptyString);
        return result.delete(i, result.length()).toString();
    }

//    private static double parce(int okInt, int discount) {
//        double result = (double) (okInt * discount) / 100;
//        DecimalFormat decimalFormat = new DecimalFormat();
//        decimalFormat.setMaximumFractionDigits(2);
//        String format = decimalFormat.format(result);
//
//        return ;
//    }

    private static String parce2(int okInt, int discount) {
        double result = (double) (okInt * discount) / 100;
//        DecimalFormat decimalFormat = new DecimalFormat();
//        decimalFormat.setMaximumFractionDigits(2);
//        String format = decimalFormat.format(result);
        return String.valueOf(result);
    }

}
