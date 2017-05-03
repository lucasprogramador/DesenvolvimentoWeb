$(function(e) {
	console.log("O DOM is Ready");
	
	$("#formulario").submit(function(event) {
		
		var data1 = $("#formulario").serialize();
	
		$.ajax({
			url: "enderecoServlet",
			data: data1,
			type: "POST",
			success: function(responseText) {
				$("#resultado").text(responseText);	
			}
			
		});
		
		event.preventDefault();	
		
	});// final submit
	
});
