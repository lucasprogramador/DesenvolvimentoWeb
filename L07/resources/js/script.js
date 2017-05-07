///// add action script /////

$("#formulario").submit((event)=>{

	var data = $("#formulario").serialize();

	$.post("adicionar", data, (response)=>{
		$("#tabela").html(response);
	});
	event.preventDefault();	

});

///// alt action script /////
$("#confirmacao-button-alterar").click((event)=>{
	perguntarAlterar();
});

function perguntarAlterar() {
	if (confirm('Tem certeza que quer alterar esta tarefa ?')){

		$("#form-alterar").submit((event)=>{

			var data = $("#form-alterar").serialize();
			
			$.post("alterar", data, (response)=>{
				$("#tabela").html(response);
			});

			event.preventDefault();	
		});
	}
}

///// delete action script /////

$("#confirmacao-button-remover").click((event)=>{
	perguntar();
});

function perguntar() {
	if (confirm('Tem certeza que quer excluir esta tarefa ?')){

		$("#form-delete").submit((e)=>{
			var data = $("#form-delete").serialize();

			$.post("remover", data, (response)=>{
				$("#tabela").html(response);
			});

			event.preventDefault();	
		});
	}
}

///// button movement /////

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