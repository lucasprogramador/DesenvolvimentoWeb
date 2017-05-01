
$(document).ready(function() {
	console.log('DOM esta lido!');

	$(document).keyup(function(e){
		
		var imc = $('#peso').val()/($('#altura').val() * $('#altura').val());
		$('#imc').val(imc);

		var result = $('#imc').val();
		$('#situacao').css('text-align' , 'center');

		if(result < 17){
			 $('#situacao').text("Muto abaixo do peso!");

		}else if(result <= 18.49){
			 $('#situacao').text("Abaixo do peso!");

		}else if(result <= 24.99){
			 $('#situacao').text("Peso normal!");

		}else if(result <= 29.99){
			 $('#situacao').text("Acima do peso!");

		}else if(result <= 34.99){
			 $('#situacao').text("Obesidade I");

		}else if(result <= 39.99){
			$('#situacao').text("Obesidade II (severa)");

		}else if(result > 40){
			$('#situacao').text("Acima de 40	Obesidade III (mórbida)");

		}// final if else
	}); // final function
}); // final function

