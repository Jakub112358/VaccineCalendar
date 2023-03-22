<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf" %>
<c:set var="child" value="${child}"/>


<body id="page-top">
<%@include file="dynamic/navigationMain.jspf" %>
${id}
<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <section class="py-5">
            <div class="container pt-3  text-center">
                <div class="row">
                    <div class="col-lg-8 mx-auto">
                        <h2>Welcome to Vaccine Manager</h2>
                    </div>
                </div>
            </div>
        </section>
        <section class="py-3 border-bottom" id="features">
            <div class="container px-5 my-5">
                <div class="row">


                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <div class="card shadow h-100 py-2">
                            <div class="card-body">
                                <div class="row no-gutters h-75">
                                    <div class="col mr-2">
                                    <h2 class="h4">About Project</h2>
                                    <p>Read more about project, used technologies, authors etc.</p>
                                    </div>
                                    <div class="col-auto">
                                        <i class="fas fa-info fa-2x text-gray-300"></i>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-auto">
                                        <a href="${pageContext.request.contextPath}/about" class="btn btn-secondary btn-icon-split">
                                            <span class="text">About</span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>


                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <div class="card shadow h-100 py-2">
                            <div class="card-body">
                                <div class="row no-gutters h-75">
                                    <div class="col mr-2">
                                        <h2 class="h4">New Calendar</h2>
                                        <p>Create new vaccine calendar from scratches.</p>
                                    </div>
                                    <div class="col-auto">
                                        <i class="fas fa-plus fa-2x text-gray-300"></i>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-auto">
                                        <a href="${pageContext.request.contextPath}/new" class="btn btn-secondary btn-icon-split">
                                            <span class="text">New Calendar</span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>


                    <div class="col-lg-4">
                        <div class="card shadow h-100 py-2">
                            <div class="card-body">
                                <div class="row no-gutters h-75">
                                    <div class="col mr-2">
                                        <h2 class="h4">Load Calendar</h2>
                                        <p>Load calendar from file.</p>
                                    </div>
                                    <div class="col-auto">
                                        <i class="fas fa-download fa-2x text-gray-300"></i>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-auto">
                                        <a href="${pageContext.request.contextPath}/load" class="btn btn-secondary btn-icon-split">
                                            <span class="text">Load Calendar</span>
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>


                </div>
            </div>
        </section>

        <%@include file="dynamic/board.jspf" %>
        <%@include file="dynamic/javaScript.jspf" %>
</body>
</html>
