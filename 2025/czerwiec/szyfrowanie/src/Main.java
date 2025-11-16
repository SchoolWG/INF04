public class Main {
    public static void main(String[] args) {
        szyfrCezara ss = new szyfrCezara();

        ss.szyfruj("z", 10);
        System.out.println(ss.szyfruj("ala", 3));
    }
}