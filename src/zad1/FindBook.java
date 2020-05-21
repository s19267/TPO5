package zad1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/findBook")
public class FindBook extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        writer.write("<button type=\"button\" onclick=\"location.href='searchBook.jsp'\">wstecz</button>");
        String bookName = request.getParameter("bookName");
        writer.write("<h1>Wyszukiwanie książki:<h1>");
        Book book=Database.getInstance().searchBook(bookName);
        if (book==null)
            writer.write("<p>Brak książki<p>");
        else
            writer.write("<p>" + book+ "<p>");
    }
}
