$(document).ready(function(){
	$('#elemento').css({"position":"relative"});
	$('html').mousemove(function (e) {
		$('#elemento').css({
			top: e.clientY,
			left: e.clientX
		});// final CSS
	});// final mousemove
});// final ready

