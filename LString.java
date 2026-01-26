public class LString {
    public static void main(String[] args) {
        String name = "Ayush Zadgaonkar";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("a");
        int last = name.lastIndexOf("a");
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(last);

        //isEmpty
        //toLowerCase()
        //toUpperCase()
        //trim()
        //replace("a","y")

        String replace = name.replace("a","u");
        System.out.println(replace);

    }
}
