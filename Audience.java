public class Audience {
    public int numberOfSeats, numberOfCabinet, audienceArea;
    private String typeOfLesson = "practice"; //механізм інкапсуляції
    public static int numberOfBuilding = 18; //пункт 3, створення статичного поля даних
    public static int count = 0;

    public Audience(int numberOfSeats, int audienceArea) {
        this.numberOfSeats = numberOfSeats;
        this.audienceArea = audienceArea;
        count++;
    }
    public Audience(int numberOfSeats, int audienceArea, int numberOfCabinet) {
        this.numberOfSeats = numberOfSeats;
        this.audienceArea = audienceArea;
        this.numberOfCabinet = numberOfCabinet;
        count++;
    }

    public String bookAnAudience(String teachersName, String subjectName, int numberOfStudents) {
        if (this.numberOfSeats >= numberOfStudents) {
            return "An audience for " + numberOfStudents + " students has been reserved for you.";
        }
        else if (this.numberOfSeats < numberOfStudents) {
            var seatsLeft = numberOfStudents - this.numberOfSeats;
            return "Oops... " + seatsLeft + " students will not have enough seats. You can't reserve this audience.";
        }
        return null;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public String bookAnAudience(String teachersName, String subjectName) {
        return bookAnAudience(teachersName, subjectName, 120);
    }

    //механізм інкапсуляції даних
    public String getTypeOfLesson() {
        return this.typeOfLesson;
    }
    public void setTypeOfLesson(String type) {
        this.typeOfLesson = type;
    }

    //пункт 4, створення static method
    public static String getCountOfAudiences() {
        return "There are " + count + " audiences in " + numberOfBuilding + " corpus";
    }

    public int getNumberOfCabinet() {
        return numberOfCabinet;
    }

    public String toString() {
        return "This instance of class Audience is " + this.numberOfCabinet;
    }
}