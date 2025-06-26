public class TestRendimientoStr {
    public static void main(String[] args) {
        String a = "a", b = "b", c = a;
        StringBuilder sb = new StringBuilder(a);

        long initialTime = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            // c = c.concat(a).concat(b).concat("\n"); // => 3 ms
            // c += a + b + "\n"; // => 16 ms
            sb.append(a).append(b).append("\n");
        }

        long finishTime = System.currentTimeMillis();

        System.out.println(finishTime - initialTime);
        System.out.println(c);
    }
}
