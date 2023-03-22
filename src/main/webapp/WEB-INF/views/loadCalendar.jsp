<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf" %>
<c:set var="child" value="${child}"/>


<body id="page-top">
<%@include file="dynamic/navigationMain.jspf" %>
<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <section class="pt-5 pb-2">
            <div class="container text-center">
                <div class="row">
                    <div class="col-lg-8 mx-auto">
                        <h2>Load saved calendar</h2>
                    </div>
                </div>
            </div>
        </section>
        <section class="py-2">
            <div class="container py-2">
                <div class="row">
                    <div class="col-xl-12 col-md-12 mb-12 ">
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                <div class="list-group">
                                    <c:forEach items="${childList}" var="c">
                                        <a class="list-group-item list-group-item-action" href='<c:url value="/selector/${c.id}"/>'>${c.name} (born: ${c.birthDate})</a>
                                    </c:forEach>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section class="py-2">
            <div class="container py-2">
                <div class="row">
                    <div class="col-xl-12 col-md-12">
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                    <button type="button" class="btn btn-primary btn-block">
                                        <i class="fas fa-download"></i>  Load calendar from file
                                    </button>
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