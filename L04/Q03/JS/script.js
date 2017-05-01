 var peso = document.querySelector('#peso');
 var altura = document.querySelector('#altura');
 var situacao = document.querySelector('#situacao');

 var imc = function(altura,peso) {
	return peso/(altura *  altura);
 }

 document.onkeyup = function(){

 	var result = imc(altura.value, peso.value);
 	document.querySelector('#imc').value =  result;
 	
 	if(result < 17){
		situacao.textContent = "Muto abaixo do peso!";

	}else if(result > 17 && result <= 18.49){
		situacao.textContent = "Abaixo do peso!";

	}else if(result > 18.49 && result <= 24.99){
		situacao.textContent = "Peso normal!";

	}else if(result > 24.99 && result <= 29.99){
		situacao.textContent = "Acima do peso!";

	}else if(result > 29.99 && result <= 34.99){
		situacao.textContent = "Obesidade I";

	}else if(result > 34.99 && result <= 39.99){
		situacao.textContent = "Obesidade II (severa)";

	}else if(result > 40){
		situacao.textContent = "Acima de 40	Obesidade III (mórbida)";
	} 	
	
 } // final function()
