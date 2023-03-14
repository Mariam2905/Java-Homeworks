package experiments.airplane;

public class Aircraft {
    private String name;
    private int rows;
    private char seatsRows;

    public Aircraft(String name, int rows, char seatsRows) {
        this.name = name;
        this.rows = rows;
        this.seatsRows = seatsRows;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public char getSeatsRows() {
        return seatsRows;
    }

    public void setSeatsRows(char seatsRows) {
        this.seatsRows = seatsRows;
    }
}
