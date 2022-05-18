package ru.pigarev.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.pigarev.products.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "productServlet", urlPatterns = "/products")
public class productServlet extends HttpServlet {

    private List<Product> productList; // = new ArrayList<>();

    private static Logger logger = LoggerFactory.getLogger(productServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: productServlet");


        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        out.println("<h1>" + "Список продуктов:" + "</h1>");
        out.println("<br />");
        productList.forEach(product -> out.println("<h2>" + product + "</h2>"));
        out.println("<br />");
        out.println("<br />");
        out.println("<br />");
        out.println("<br />");
        out.println("<h4>" + "Будем рады видеть Вас в нашем интернет-магазине." + "</h4>");
        out.println("</body></html>");

        out.close();
    }

    @Override
    public void init() throws ServletException {
        logger.debug("Init");
        productList = new ArrayList<>();
        productList.add(new Product(1L, "black leather jacket", 3600.00));
        productList.add(new Product(2L, "black leather bandana", 540.00));
        productList.add(new Product(3L, "black jeans", 2200.00));
        productList.add(new Product(4L, "black leather gloves", 1050.00));
        productList.add(new Product(5L, "T-shirt with print \'AC/DC\' ", 700.00));
        productList.add(new Product(6L, "T-shirt with print \'MANOWAR\' ", 700.00));
        productList.add(new Product(7L, "T-shirt with print \'АРИЯ\' ", 700.00));
        productList.add(new Product(8L, "Sunglasses", 600.00));
        productList.add(new Product(9L, "black motorcycle boots", 4300.00));
        productList.add(new Product(10L, "black leather vest", 2300.00));
    }
}
