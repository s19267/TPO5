package zad1;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    private String driverName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost/booksLib?serverTimezone=UTC";
    private String uid = "TPO";
    private String pwd = "TPO";
    private Connection con;
    private Statement statement;
    private static Database database;

    public static Database getInstance(){
        if(database==null)
            database=new Database();
        return database;
    }

    private Database() {
        try {
            Class.forName(driverName);
            con = DriverManager.getConnection(url, uid, pwd);
            statement = con.createStatement();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Book> getBooks() {
        ArrayList books = new ArrayList<Book>();
        try {
            ResultSet set = statement.executeQuery("select * from book");
            while (set.next())
                books.add(new Book(set.getString("title"),
                        set.getString("author"),
                        set.getDate("releaseDate")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }

    public Book searchBook(String title) {
        try {
            ResultSet set = statement.executeQuery("select * from book where title=\"" + title + "\"");
            if (set.next())
                return new Book(set.getString("title"),
                        set.getString("author"),
                        set.getDate("releaseDate"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
