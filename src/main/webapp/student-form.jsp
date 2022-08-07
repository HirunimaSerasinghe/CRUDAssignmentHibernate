<%--
  Created by IntelliJ IDEA.
  User: hirunima_s
  Date: 8/4/2022
  Time: 4:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>CRUD Application</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>

<header>
    <nav class="navbar navbar-expand-md navbar-dark" style="background-color: #477cff">
        <div>
            <a href="https://www.javaguides.net" class="navbar-brand"> Student
                Management App </a>
        </div>

        <ul class="navbar-nav">
            <li><a href="<%=request.getContextPath()%>/list" class="nav-link">Students</a></li>
        </ul>
    </nav>
</header>

<br>
<div class="container col-md-5">
    <div class="card">
        <div class="card-body">
            <c:if test="${student != null}">
            <form action="update" method="post">
                </c:if>
                <c:if test="${student == null}">
                <form action="insert" method="post">
                    </c:if>

                    <caption>
                        <h2>
                            <c:if test="${student != null}">
                                Edit User
                            </c:if>
                            <c:if test="${student == null}">
                                Add New User
                            </c:if>
                        </h2>
                    </caption>

                    <c:if test="${student != null}">
                        <input type="hidden" name="id" value="<c:out value='${student.id}' />" />
                    </c:if>

                    <fieldset class="form-group">
                        <label>Student Name</label> <input type="text"
                                                           value="<c:out value='${student.name}' />" class="form-control"
                                                           name="name" required="required">
                    </fieldset>

                    <fieldset class="form-group">
                        <label>Student Email</label> <input type="text"
                                                            value="<c:out value='${student.email}' />" class="form-control"
                                                            name="email">
                    </fieldset>

                    <fieldset class="form-group">
                        <label>Student Age</label> <input type="text"
                                                          value="<c:out value='${student.age}' />" class="form-control"
                                                          name="age">
                    </fieldset>

                    <button type="submit" class="btn btn-success">Save</button>
                </form>
        </div>
    </div>
</div>
</body>
</html>
