import java.util.*;

class prog1_16 {
    public static void main(String args[]) {
        // Question 1
        char[] charArray = { 'B', 'M', 'S', 'C', 'E' };
        String str1 = new String(charArray);
        String str2 = new String("bmsce");
        String str3 = new String(str2);

        // Question 2
        String str4 = "some";
        System.out.println("String length: " + str4.length() + "\n" + "Concatenated string: " + str4.concat(str2));

        // Question 3
        int intValue = 55;
        String strValue = Integer.toString(intValue);
        System.out.println("Converting Integer to string: " + intValue + " -> " + strValue);

        // Question 4
        char[] resultArray = new char[20];
        String sampleStr = new String("Welcome to BMSCE College");
        sampleStr.getChars(10, 16, resultArray, 0);

        // Question 5
        byte[] byteArray = str4.getBytes();
        for (int i = 0; i < 4; i++) {
            System.out.print(byteArray[i] + " ");
        }

        // Question 6
        System.out.println("BMSCE equals BMSCE: " + str1.equals("BMSCE"));
        System.out.println("BMSCE equals some: " + str1.equals(str4));
        System.out.println("BMSCE equalsIC Bmsce: " + str1.equalsIgnoreCase(str2));

        // Question 7
        System.out.println(sampleStr.regionMatches(11, "BMSCE College", 0, 11));

        // Question 8
        System.out.println(sampleStr.startsWith("Welcome"));

        // Question 9
        System.out.println(sampleStr.endsWith("College"));

        // Question 10
        String str5 = new String("BMSCE");
        System.out.println("Reference equal b/w str1 and str5 (==): " + (str1 == str5));
        System.out.println("Value equal b/w str1 and str5 (equals()): " + str1.equals(str5));

        // Question 11
        String[] strArray = { "van", "watch", "ball", "cat", "xmas", "yatch", " zee", "apple", "ice", "jug",
                "kite", "lift", "man", "net", "orange", "dog", "ent", "free", "gun", "hen", "parrot", "queen", "ring",
                "star", "tree", "umbrella" };
        Arrays.sort(strArray);
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }

        // Question 12
        String[] numArray = {"1", "4", "3", "2", "5"};
        Arrays.sort(numArray);
        System.out.println("\n");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
        
        System.err.println("\n");

        // Question 13
        String original = "This is a test. This is, too.";
        String replaced = new String("");
        int beginIndex = 0;
        int indexOfIs = original.indexOf("is");
        while (indexOfIs != -1) {
            replaced += original.substring(beginIndex, indexOfIs);
            System.out.println(replaced);
            replaced += "was";
            System.out.println(replaced);
            beginIndex = indexOfIs + 2;
            indexOfIs = original.indexOf("is", indexOfIs + 2);
            if (indexOfIs == -1) replaced += original.substring(beginIndex);
        }

        System.out.println("Original string: " + original);
        System.out.println("Replaced string: " + replaced);

        // Question 14
        System.out.println("Concatenation example: hello + world = " + "hello".concat("world")); 

        // Question 15
        System.out.println("Replacing ll with mm gives us: " + "College".replace("ll", "mm"));

        // Question 16
        System.out.println("Trimming example: " + "   Hello World    ".trim());

        // Question 17
        StringBuffer expression = new StringBuffer("Something");
        expression.setLength(10);
        char[] buffer = new char[4];
        expression.getChars(0, 4, buffer, 0);
        String bufferString = new String(buffer);
        System.out.println("Length: " + expression.length());
        System.out.println(expression.charAt(0) + " " + bufferString + " " + expression.reverse() + " " + expression.substring(0, 3));
        expression.reverse();
        expression.append('c');
        expression.insert(0, 'K');
        expression.replace(0, 1, "L");
        System.out.println(expression);
        expression.deleteCharAt(0);
        expression.delete(0, 4);
        System.out.println(expression);
    }
}
