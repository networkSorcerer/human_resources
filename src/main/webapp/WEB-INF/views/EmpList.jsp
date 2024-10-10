<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	var param ={};
	$.ajax({
		url:"/hr/employeeList.do",
		type:"post",
		dataType:"json",
		data : param,
		success : function(response) {
			var list = response.listdata;
			var html="";
			
			list.forEach(function(item){
				html+="<tr>"
				html+="<td>"+item.employee_ID+"</td>";
				html+="<td>"+item.first_NAME+" " + item.last_NAME+"</td>";
				html+="<td>"+item.department_ID+"</td>";
				html+="<td>"+item.job_ID+"</td>";
				html+="</tr>"
			})
			$("#list").append(html);
		}
	})
})
</script>
<body>
<div>
	<h1>ERD</h1>
</div>

<div>
	<div>
		<table class="table table-striped">
			<thead>
				<tr>
					<td>직원ID</td>
					<td>이름</td>
					<td>부서</td>
					<td>직급</td>
				</tr>
			</thead>
			<tbody id="list">
				
			</tbody>
			
		</table>
	</div>
</div>

</body>
</html>