var preco = document.querySelector('#preco');
var quantidade = document.querySelector('#quantidade');

document.onkeyup = function(){	

	console.log("Entrei na Função");
	
	console.log(preco.value);
	
	console.log(quantidade.value);

	document.getElementById('preco_total').value =  (preco.value * quantidade.value);	
}
