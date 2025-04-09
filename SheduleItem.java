import java.util.*;
public class SheduleItem {
    String teachersName;
    String subjectName;
    String day;
    int numberOfLesson;
    Audience audience; //агрегування

    public SheduleItem(String teachersName, String subjectName, String day, int numberOfLesson, Audience audience) {
        this.teachersName = teachersName;
        this.subjectName = subjectName;
        this.day = day;
        this.numberOfLesson = numberOfLesson;
        this.audience = audience;
    }

    public String getSubjectName() {
        return this.subjectName;
    }

    public String toString() {
        return "This instance of class SheduleItem with " + this.subjectName + " " + this.numberOfLesson + " on " + this.day;
    }

    static final Comparator<SheduleItem> NUMBER_OF_LESSON__COMPARATOR = new Comparator<SheduleItem>() {
        public int compare(SheduleItem e1, SheduleItem e2) {
            return e1.numberOfLesson - e2.numberOfLesson;
        }
    };

    static Map<String, Integer> sortedDays = Map.of(
        "Monday", 1,
        "Tuesday", 2,
        "Wednesday", 3,
        "Thursday", 4,
        "Friday", 5,
        "Saturday", 6
    );

    static final Comparator<SheduleItem> DAYS__COMPARATOR = new Comparator<SheduleItem>() {
        public int compare(SheduleItem e1, SheduleItem e2) {
            if (e1.day != null && e2.day != null) {
                return sortedDays.get(e1.day)-sortedDays.get(e2.day);
            }
            return 0;
        }
    };

    public int getNumberOfLesson() {
        return numberOfLesson;
    }
}