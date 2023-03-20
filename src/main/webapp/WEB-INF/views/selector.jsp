<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf" %>


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
                        <h2>Vaccines Selector</h2>
                    </div>
                </div>
            </div>
        </section>

        <section class="py-2">
            <div class="container-fluid py-2">
                <div class="row text-center justify-content-center">
                    <div class="col-12 col-md-10 col-lg-8">
                    <div class="row">
                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <div class="card shadow h-100 py-2">
                            <div class="card-body">
                                <div class="row no-gutters h-75">
                                    <div class="col mr-2">
                                        <h2 class="h4">Select Obligatory</h2>
                                        <p class="text-left">Select only obligatory vaccinations and unselect all additional ones.</p>
                                    </div>
                                </div>
                                <div class="row">

                                        <a href="${pageContext.request.contextPath}/about" class="btn btn-secondary btn-block">
                                            <span class="text">Select</span>
                                        </a>

                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <div class="card shadow h-100 py-2">
                            <div class="card-body">
                                <div class="row no-gutters h-75">
                                    <div class="col mr-2">
                                        <h2 class="h4">Select All</h2>
                                        <p class="text-left">Select all recommended vaccinations.</p>
                                    </div>
                                </div>
                                <div class="row">
                                    <a href="${pageContext.request.contextPath}/about" class="btn btn-secondary btn-block">
                                        <span class="text">Select</span>
                                    </a>

                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 mb-5 mb-lg-0">
                        <div class="card shadow h-100 py-2">
                            <div class="card-body">
                                <div class="row no-gutters h-75">
                                    <div class="col mr-2">
                                        <h2 class="h4">5in1 / single </h2>
                                        <p class="text-left">Switch between 5 in 1 and single vaccines.</p>
                                    </div>
                                </div>
                                <div class="row">
                                    <a href="${pageContext.request.contextPath}/about" class="btn btn-secondary btn-block">
                                        <span class="text">Select</span>
                                    </a>

                                </div>
                            </div>
                        </div>
                    </div>
                    </div>
                    </div>
                </div>
            </div>
        </section>





        <section class="py-2">
            <div class="container-fluid py-2">
                <div class="row justify-content-center">
                    <div class="col-12 col-md-10 col-lg-8">
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                <table class="table table-hover table-bordered table-responsive-md">
                                    <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Disease</th>
                                        <th scope="col" class="text-center">Info</th>
                                        <th scope="col" class="text-center"><input type="checkbox" disabled checked>
                                        </th>
                                        <th scope="col">Vaccine</th>
                                        <th scope="col" class="text-center">Info</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <th scope="row">1</th>
                                        <td>Disease 1</td>
                                        <td class="text-center">
                                            <a class="nav-link p-0" href="${pageContext.request.contextPath}/about">
                                                <i class="fas fa-info-circle"></i>
                                            </a>
                                        </td>
                                        <td class="text-center"><input type="checkbox"></td>
                                        <td class="py-0 align-middle">
                                            <div class="my-auto">


                                            <c:if test="${true}">
                                                <select class="custom-select">
                                                    <option>Vaccine A for disease 1</option>
                                                    <option>Vaccine B for disease 1</option>
                                                </select>
                                            </c:if>
                                            </div>
                                        </td>
                                        <td class="text-center">
                                            <a class="nav-link p-0" href="${pageContext.request.contextPath}/about">
                                                <i class="fas fa-info-circle"></i>
                                            </a>
                                        </td>


                                    </tr>
                                    <tr>
                                        <th scope="row">2</th>
                                        <td>Disease 2</td>
                                        <td class="text-center">
                                            <a class="nav-link p-0" href="${pageContext.request.contextPath}/about">
                                                <i class="fas fa-info-circle"></i>
                                            </a>
                                        </td>
                                        <td class="text-center"><input type="checkbox"></td>
                                        <td>
                                            <c:if test="${false}">
                                                <select class="custom-select">
                                                    <option>Vaccine A for disease 3</option>
                                                    <option>Vaccine B for disease 3</option>
                                                </select>
                                            </c:if>
                                        </td>
                                        <td class="text-center">
                                            <a class="nav-link p-0" href="${pageContext.request.contextPath}/about">
                                                <i class="fas fa-info-circle"></i>
                                            </a>
                                        </td>
                                    </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <section class="py-2">
            <div class="container-fluid py-2">
                <div class="row justify-content-center">
                    <div class="col-12 col-md-10 col-lg-8">
                        <div class="card shadow mb-4">
                            <div class="card-header py-3">
                                <button type="button" class="btn btn-primary btn-block">
                                    <i class="fas fa-download"></i>  Add custom vaccine
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
