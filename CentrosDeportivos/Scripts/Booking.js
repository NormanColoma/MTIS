$(document).ready(function () {
    $("#centers").change(function () {
        var center = $("#centers option:selected").val();
        getSports(center);
    })
})

function getSports(center) {
    var port = location.port; //Obtenemos el puerto
    var uri = "http://localhost:" + port + "/api/SportCenter/"+center; //Dirección del servicio REST
    $.getJSON(uri) //Hacemos petición GET al servicio
        .done(function (data) {
            var sports = data;  //Obtenemos los datos
            addSports(sports)   //Llamamos a la función para que haga lo que proceda
                                      
        })
        .fail(function (jqXHR, textStatus, err) {  //Si hay error mostramos un mensaje
                               
        });
}

function addSports(sports) {
    for (var i = 0; i < sports.length; i++) {
        var sport = '<option value="' + sports[i].idField + '">' + sports[i].nameField + '</option>';  //Creamos el li
        $("#sports").append(sport); //Añadimos el li a la lista (ul)
    }
}