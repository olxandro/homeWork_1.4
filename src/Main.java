import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        // task_1
        int i = 10;
        while (i > 0) {
            System.out.print(i + " ");
            i--;
        }
        System.out.print("\n");
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }

        // task_2
        System.out.print("\n");
        int reportDay = 5;
        while (reportDay <= 31) {
            System.out.println("Сегодня пятница, " + reportDay +"-е число. Необходимо подготовить отчет.");
            reportDay += 7;
        }

        System.out.print("\n");
        for (int friday = 5; friday < 32; friday+=7) {
            System.out.println("Сегодня пятница, " + friday +"-е число. Необходимо подготовить отчет.");
        }

        // task_3
        System.out.print("\n");
        GregorianCalendar calendar = new GregorianCalendar();
        int nowYear = calendar.get(Calendar.YEAR);
        int startYear = nowYear - 200;
        int endYear = nowYear + 100;
        for (int j = 0; j < endYear; j+=79) {
            if (j > startYear) {
                System.out.println(j);
            }
            
        }
    }
}