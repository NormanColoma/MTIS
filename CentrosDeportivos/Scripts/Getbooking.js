$(document).ready(function () {

    $("#center").change(function () {
        var center = $("#center option:selected").val();
        getBookings(center);
    })


})

function getBookings(center) {
    
    var port = location.port; //Obtenemos el puerto
    var uri = "http://localhost:8081/getbookings?id="+ center; //Dirección para acceder a MULE
    $.getJSON(uri) //Hacemos petición GET al servicio
        .done(function (data) {
            alert("hola");
            var bookings = data;  //Obtenemos los datos
            addBookings(bookings)   //Llamamos a la función para que haga lo que proceda

        })
        .fail(function (jqXHR, textStatus, err) {  //Si hay error mostramos un mensaje

        });
}

function addBookings(bookings) {
   
    //for (var i = 0; i < sports.length; i++) {
        var content = '<div>'+bookings+'</div>';  //Creamos el li
        $(".showbookings").append(content); //Añadimos el li a la lista (ul)
    //}
}