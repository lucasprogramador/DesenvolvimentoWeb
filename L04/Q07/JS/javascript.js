$(document).ready(function() {
	
	$("#texto_pub_1").hide();
	$("#texto_pub_2").hide();
	$("#texto_pub_3").hide();
	$("#texto_pub_4").hide();
	$("#texto_pub_5").hide();
	$("#texto_pub_6").hide();
	$("#parteDois").hide();

	$('#pub1').click(function (e) {
		$("#texto_pub_1").show();
		$(this).hide();
	});

	$('#pub2').click(function (e) {
		$("#texto_pub_2").show();
		$(this).hide();
	});

	$('#pub3').click(function (e) {
		$("#texto_pub_3").show();
		$(this).hide();
	});

	$('#pub4').click(function (e) {
		$("#texto_pub_4").show();
		$(this).hide();
	})

	$('#pub5').click(function (e) {
		$("#texto_pub_5").show();
		$(this).hide();
	})

	$('#pub6').click(function (e) {
		$("#texto_pub_6").show();
		$(this).hide();
	})
	$('#button_parteDois').click(function (e) {
		$("#parteDois").show();
		$(this).hide();
	})
});

