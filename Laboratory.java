public class Laboratory extends Audience{
    String specialisation;
    Board board;

    public Laboratory(int numberOfSeats, int audienceArea, int numberOfCabinet, String specialisation) {
        super(numberOfSeats, audienceArea, numberOfCabinet);
        this.specialisation = specialisation;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public String bookAnAudience(String teachersName, String subjectName, int numberOfStudents) {
        super.bookAnAudience(teachersName, subjectName, numberOfStudents);
        return "You booked a " + this.specialisation + " laboratory with a board made of " + board.material;
    }

    class Board{
        String color;
        String material;

        public Board(String color, String material) {
            this.color = color;
            this.material = material;    
        }
    }
}