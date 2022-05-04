import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Salary extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Employee salary</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + "Employee Details"+ "</h1>");
            out.println("<h3>Name: " + request.getParameter("name")+ "</h3>");
            out.println("<h3>Employee ID: " + request.getParameter("empid")+ "</h3>");
            out.println("<h3>Employee's Basic pay: " + request.getParameter("bpay")+ "</h3>");
            out.println("<h3>Employee HRA: " + request.getParameter("hra")+ "</h3>");
           
            int salary=Integer.parseInt(request.getParameter("bpay"));
            int da=salary/2;
            int hra=Integer.parseInt(request.getParameter("hra"));
            int gross=da+hra+salary;
           
            out.println("<h3>Gross salary: " + gross+ "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}