package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet {
public void doPost(HttpServletRequest req, HttpServletResponse res) {
String action = req.getParameter("RequestAction");
String username = req.getParameter("user");
String password = req.getParameter("pass");
if("login".equalsIgnoreCase(action)) {
LoginRepository er = new LoginRepository();
try {
String result_username=er.Login(username,password);
String arr[] = result_username.split(":");
boolean result = Boolean.valueOf(arr[0]);
String display_username = arr[1];
System.out.println(display_username+" out");
RequestDispatcher rd1 = req.getRequestDispatcher("index.jsp");
// boolean result = Boolean.valueOf(er.Login(username, password));
if(result) {
try {
HttpSession session = req.getSession();
session.setAttribute("result", display_username);
// req.setAttribute("result", display_username);
rd1.forward(req, res);
} catch (Exception e) {
}
}
else {
RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
String s = "fail";
req.setAttribute("result", s);
try {
rd.forward(req, res);
} catch (Exception e) {
System.out.println("Error in Login Failed: "+e);
}
}
}
catch(Exception e) {
System.out.println("Error in Controller dopost: "+e);
}
}
}
}

