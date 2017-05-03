$(function(e) {
	console.log("O DOM is Ready");
	
	$("#formulario").submit(function(event) {
		
		var data = $("#formulario").serialize();
	
		$.post("enderecoServlet",data,  function(responseText) {
			$("#resultado").text(responseText);	
		});
		
		event.preventDefault();	
		
	});// final submit
	
});
