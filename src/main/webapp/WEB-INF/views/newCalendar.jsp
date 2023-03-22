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
                        <h2>Create new vaccine calendar</h2>
                    </div>
                </div>
            </div>
        </section>
        <section class="py-2">
            <div class="container py-2">
                <form method="post" action='<c:url value="/new"/>'>


                    <div class="row">
                        <div class="col-xl-12 col-md-12">
                            <div class="card shadow mb-4">
                                <div class="card-header py-3">

                                    <div class="form-group row">
                                        <label class="col-4 col-md-2 col-form-label" for="name">Name: </label>
                                        <div class="col-8 col-md-10 my-auto">
                                            <input class="form-control" type="text" placeholder="child's name"
                                                   id="name" name="name">
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label class="col-4 col-md-2 col-form-label" for="birthDate">Birth
                                            date: </label>
                                        <div class="col-8 col-md-10 my-auto">
                                            <input class="form-control" type="date" id="birthDate" name="birthDate">
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <label class="col-4 col-md-2 col-form-label" for="firstVaccDate">First
                                            vaccination
                                            date: </label>
                                        <div class="col-8 col-md-10 my-auto">
                                            <input class="form-control" type="date" id="firstVaccDate" name="firstVaccDate">
                                        </div>
                                    </div>

                                    <div class="form-check">
                                        <input class="form-check-input" type="checkbox" id="agreement" name="agreement">
                                        <label class="form-check-label">
                                            I solemnly swear that I am up to no good.
                                        </label>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <input class="btn btn-success pull-left" type="submit" value="Create" id="createButton">
                </form>
            </div>
        </section>

        <%@include file="dynamic/board.jspf" %>
        <%@include file="dynamic/javaScript.jspf" %>
</body>
</html>