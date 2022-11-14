public class Main {

    static String reverseStr(String initialString) {
        String reverseString = "";
        if (initialString == null) return null;
        if (initialString.length() == 1) return initialString;
        int charIndex = initialString.length() - 1;
        do {
            reverseString += initialString.charAt(charIndex--);
        } while (charIndex > -1);
        return reverseString;
    }

    static boolean isPalinrom(String targetString) {
        targetString = targetString.toLowerCase();
        int strLenght = targetString.length();
        if (strLenght < 2) return false;
        if (strLenght == 2) return targetString.charAt(0) == targetString.charAt(1);
        if (strLenght == 3) return targetString.charAt(0) == targetString.charAt(2);
        String startStr, endStr;
        startStr = targetString.substring(0, targetString.length() / 2);
        endStr = strLenght % 2 == 0 ? targetString.substring(targetString.length() / 2)
                : targetString.substring(targetString.length() / 2 + 1);
        return startStr.equals(reverseStr(endStr));
    }

    public static void main(String[] args) {
        String string = "Потоп";
        final String initialStatusMess = String.format("\nСтрока «%s» не является палиндромом.", string);
        String statusMess;
        if (isPalinrom(string)) statusMess = initialStatusMess.replace(" не ", " ");
        else statusMess = initialStatusMess;
        System.out.println(statusMess);
    }
}