public class TestExeception {
    public static void main(String[] args) {
        try {
            throw new ExeceptionB("Exception B");
        } catch (ExeceptionA a) {
            a.printStackTrace();
        }

        try {
            throw new ExeceptionC("Exception C");
        } catch (ExeceptionA a) {
            a.printStackTrace();
        }
    }
}
