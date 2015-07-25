public class LCDDigits {
    
    public String show(int number) {
        String[] line1 = {" _ ", "   "};
        String[] line2 = {"| |", "  |"};
        String[] line3 = {"|_|", "  |"};

        String digits = String.valueOf(number);
        String resultLine1 = "";
        String resultLine2 = "";
        String resultLine3 = "";

        for (int position = 0; position < digits.length(); position++) {
            int digit = digits.charAt(position) - '0';
            resultLine1 += line1[digit];
            resultLine2 += line2[digit];
            resultLine3 += line3[digit];
        }
        return  resultLine1 + "\n" +
                resultLine2 + "\n" +
                resultLine3 + "\n";

    }
}
