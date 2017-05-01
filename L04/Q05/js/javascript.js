// alert("Seja Bem Vindo");

window.onload = function() {
	document.onmousemove =  function () {
		
		var eixoY = window.event.clientY;
		var eixoX = window.event.clientX;
		
		var elemento = document.querySelector("#paragrafo")

		elemento.setAttribute("style","position: relative; color: blue;");

		elemento.style.top = (eixoY) +"px";
		elemento.style.left = (eixoX) + "px";

	}; // final onmousemove
}; // final onload