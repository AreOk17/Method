import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int clientOS = 1;
        int productionYear = 2015;
        printInfoAboutDevice(clientOS, productionYear);

    }
public static String getOSbyType (int type) {
        if (type == 1) {
            return "Android";
        } else {
            return "iOS";

        }
}
    private static String getTypeofVersion(int productionYear) {
        int currentYear = LocalDate.now().getYear();
        if (productionYear == currentYear) {
            return "обычную ";
        } else {
            return "lite ";


        }
    }

    private static void printInfoAboutDevice(int type, int productionYear) {
        String os = getOSbyType(type);
        String typeofVersion = getTypeofVersion(productionYear);
        System.out.println("Установите " + typeofVersion + " версию приложения для " + os);

    }
}