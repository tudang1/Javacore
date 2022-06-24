public class Library {
    private int id;
    private String name;
    private String author;
    private int year;
    private int value;

    public Library() {
    }

    public Library(int id, String name, String author, int year, int value) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
