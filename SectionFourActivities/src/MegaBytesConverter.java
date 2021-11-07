public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes > 0) {
            System.out.println(kiloBytes + " KB = " + Math.round(kiloBytes / 1024) + " MB and " + (kiloBytes - (Math.round(kiloBytes / 1024) * 1024)) + " KB");
        }else {
            System.out.println("Invalid Value");
        }
    }
}
