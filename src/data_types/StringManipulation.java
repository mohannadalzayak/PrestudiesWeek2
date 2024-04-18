package data_types;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringManipulation {
    public static void main(String[] args) {
    String text ="Everybody said, it can’t be done. Then came one who did not know that and just made it.";
        System.out.println(text);
        for (int i = 0; i < text.length(); i++) {
            char upperCaseLetter = text.charAt(i);
            if (Character.isUpperCase(upperCaseLetter)) {
                System.out.println(upperCaseLetter);
            }

        }
        String firstName ="Mohannad ";
        String lastName ="Alzayak";
        String emptyString = "";
        String x =null;
        // E equal 69 in Ascii tabel and M equal 77 Ascii tabel so 69-77 = -8
        System.out.println("Compare the text with your name"+text.compareTo(firstName));
        //System.out.println(firstName+lastName);
        System.out.println(firstName.concat(lastName));
        System.out.println(text.contains("made") && text.contains("Java"));
        System.out.println(firstName.equals(lastName));
        System.out.println("index of the first occurrence of d :"+text.indexOf("d"));
        System.out.println(emptyString.isEmpty());
        System.out.println(x == null);
        System.out.println(text.length());
        int indexOfSaid = text.indexOf("said");
        System.out.println(text.substring(indexOfSaid,indexOfSaid+4));
        int indexOfMade = text.indexOf("made");
        System.out.println(text.substring(indexOfMade,indexOfMade+4));


    }
}