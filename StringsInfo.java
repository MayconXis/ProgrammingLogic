package LogicaProgramacao;

public class StringsInfo {
    public static void main(String[] args) {

    String original = "abcde FGHIJ ABC abc DEFG ";
    String s01 = original.toLowerCase(); //convert all characters in the string to lowercase
    String s02 = original.toUpperCase(); //converts all characters in the string to uppercase
    String s03 = original.trim(); //Removes all leading and trailing whitespace from the beginning and end of the string 
    String s04 = original.substring(2); //Creates a new string starting from index 2 untill the end.Remember that the index starts at 0 (the character at index 2 is 'c')
    String s05 = original.substring(2, 9);//Creates a new string from index 2(inclusive) up to index 9(exclusive).(The characters from index 2 to 8 are "cde FGH")
    String s06 = original.replace('a', 'x'); //Replaces all occurrences of the character 'a' with the character 'x'. The replacement is case sensitive
    String s07 = original.replace("abc", "xy");// Replaces all occurrences of the substring "abc" with the substring "xy". The replacement is case sensitive.
    int i = original.indexOf("bc"); //Returns the index of the first occurrence of the substring "bc". The first occurrence is in $\text{"a**bc**de"}$ (index 1).
    int j = original.lastIndexOf("bc"); //Returns the index of the last occurrence of the substring "bc". The last occurrence is in $\text{"ABC a**bc** DEFG"}$ (index 20).
    System.out.println("Original: -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "-");
    System.out.println("toUpperCase: -" + s02 + "-");
    System.out.println("trim: -" + s03 + "-");
    System.out.println("substring(2): -" + s04 + "-");
    System.out.println("substring(2, 9): -" + s05 + "-");
    System.out.println("replace('a', 'x'): -" + s06 + "-");
    System.out.println("replace('abc', 'xy'): -" + s07 + "-");
    System.out.println("Index of 'bc': " + i);
    System.out.println("Last index of 'bc': " + j);
        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        //or 
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
