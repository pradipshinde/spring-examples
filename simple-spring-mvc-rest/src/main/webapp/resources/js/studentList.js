function makeURL(pathname){
	return document.location.protocol + "//" + document.location.host + "/" + document.location.pathname.split("/")[1] + pathname;
}

function serverRequest(url,data,method,type){
	var result="";
	if(data!=null){
		jQuery.ajax({
			type: method,
			url: url ,
		    contentType: "application/json", //this is required for spring 3 - ajax to work (at least for me)
		    data: JSON.stringify(data), //json object or array of json objects
			/* contentType: false,
			processData: true, */   	/* These are used for multipartdata */
			dataType:type,
			async: false,
			success: function(data){
				result=data;
				alert("Response = "+result);
				
			},
			error:function (error){
				result=error.responseText;
			}    
		});
	}
	
	return result;
}

$(function(){
	
	var students = serverRequest(makeURL("/api/students"), {}, "GET", "JSON");
	
	alert("Get list of student Record");
	
	$lstStudents = $("#lstStudents");
	
	$.each(students, function(index, student){
		var $tr = $("<tr>")
			.append(
				$("<td>")
					.text(student.studentId)
			)
			.append(
				$("<td>")
					.text(student.studentName)
			);
		$lstStudents.append($tr);
	});
	
	$("#btAdd").click( function(){
		alert("add new Student into the list");
		/* var data = $("#frmstudent").serialize(); */
		var data = {studentId:$("#txtid").val(), studentName:$("#txtname").val()};
		/*alert($("#frmstudent").serializeArray().toString());*/
		serverRequest(makeURL("/api/students"), data, "POST", "text");
		alert("Reload Data");
		location.reload();
	});
	$("#btDelete").click(function(){
		var id = $("#txtid").val();
		serverRequest(makeURL("/api/students/"+ id), "", "DELETE", "json");
		location.reload();
	});
	$("#btUpdate").click(function(){
		var id = $("#txtid").val();
		var data = {studentId:$("#txtid").val(), studentName:$("#txtname").val(), date: '12/12/1989'};
		serverRequest(makeURL("/api/students/" + id), data, "put", "text");
		location.reload();
	});
	$("#btSearch").click(function(){
		var id = $("#txtid").val();
		var response = serverRequest(makeURL("/api/students/"+ id), "", "GET", "json");
		if(response!=null && response!=""){
			$("#txtname").val(response.studentName);
		}else{
			$("#txtname").val("");
		}
	});
});
