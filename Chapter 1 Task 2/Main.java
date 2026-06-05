public class Main {
    public static void main(String[] args) {
        byte b = 3;
        short s = 1;
        int i = 1;
        float f = 2.0f;
        char c = 'H';
        boolean bool = true;

        String output = c + "" + b + s + i + "0 World " + (int) f + ".0 " + bool;
        System.out.println(output);

    }
}