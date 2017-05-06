
$(()=>{

	$("#formulario").submit((event)=>{
		var data = $("#formulario").serialize();

		$.post("adicionar", data, (response)=>{
			$("#tabela").html(response);
		});
		event.preventDefault();	

	});



});

$(()=>{
	$("#adicionar").hide();
	$("#alterar").hide();
	$("#deletar").hide();
});

$("#adicionar-button").click(()=>{
	$("#adicionar").toggle();
	
	$("#alterar").hide();
	$("#deletar").hide();    
});

$("#alterar-button").click(()=>{
	$("#alterar").toggle();

	$("#adicionar").hide();
	$("#deletar").hide();    
});


$("#deletar-button").click(()=>{
	$("#deletar").toggle();

	$("#adicionar").hide();
	$("#alterar").hide();
});

