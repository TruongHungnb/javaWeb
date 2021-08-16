<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<!-- Custom fonts for this template-->

<link
	href="<c:url value='/templates/admin/vendor/fontawesome-free/css/all.min.css'/>"
	rel="stylesheet" type="text/css">

<!-- Page level plugin CSS-->
<link
	href="<c:url value='/templates/admin/vendor/datatables/dataTables.bootstrap4.css'/>"
	rel="stylesheet">

<!-- Custom styles for this template-->

<link href="<c:url value='/templates/admin/css/sb-admin.css'/>"
	rel="stylesheet">
</head>
<body id="page-top">
	<%@ include file="/common/admin/header.jsp"%>
	<dec:body/>

	<!-- Bootstrap core JavaScript-->
	<script
		src="<c:url value='/templates/admin/vendor/jquery/jquery.min.js'></c:url>"></script>
	<script
		src="<c:url value='/templates/admin/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>

	<!-- Core plugin JavaScript-->
	<script
		src="<c:url value='/templates/admin/vendor/jquery-easing/jquery.easing.min.js'/>"></script>

	<!-- Page level plugin JavaScript-->
	<script
		src="<c:url value='/templates/admin/vendor/chart.js/Chart.min.js'/>"></script>
	<script
		src="<c:url value='/templates/admin/vendor/datatables/jquery.dataTables.js'/>"></script>
	<script
		src="<c:url value='/templates/admin/vendor/datatables/dataTables.bootstrap4.js'/>"></script>

	<!-- Custom scripts for all pages-->
	<script
		src="<c:url value='/templates/admin/vendor/chart.js/Chart.min.js'/>"></script>

	<!-- Demo scripts for this page-->
	<script
		src="<c:url value='/templates/admin/js/demo/datatables-demo.js'/>"></script>
	<script
		src="<c:url value='/templates/admin/vendor/datatables/jquery.dataTables.js'/>"></script>

</body>
</html>