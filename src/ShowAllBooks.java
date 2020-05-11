import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/showAllBooks")
public class ShowAllBooks extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer=response.getWriter();
        writer.write("<button type=\"button\" onclick=\"location.href='index.jsp'\">wstecz</button>");
        writer.write("<h1>Wszystkie książki:<h1>");
        for (Book book : Database.getInstance().getBooks()) {
            writer.write("<p>"+book.toString()+"<p>");
        }
    }
}
