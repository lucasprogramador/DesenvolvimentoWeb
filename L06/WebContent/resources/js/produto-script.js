$("#produtoUm").submit((evento) => {
		
	$.post("loja",  $("#produtoUm").serialize(), (responseText) => {
		alert("Produto Adicionado!");
		$("#resultado").text(responseText);
	});
	
	evento.preventDefault();	
});

$("#produtoDois").submit((evento) => {
	
	$.post("loja",$("#produtoDois").serialize(), (responseText) => {
		alert("Produto Adicionado!");
		$("#resultado").text(responseText);		
	});
	
	evento.preventDefault();
});

$("#produtoTres").submit((evento) => {
	
	$.post("loja", $("#produtoTres").serialize(), (responseText) =>{
		alert("Produto Adicionado!");
		$("#resultado").text(responseText);	
	});
	
	evento.preventDefault();
});
