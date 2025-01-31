public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);

        String result = sb.toString();
        System.out.println("Concatenated String: " + result);
    }
}
