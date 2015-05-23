$(document).ready(function () {
    $("#centers").change(function () {
        var center = $("#centers option:selected").val();
        getSports(center);
    })

    $(".available-fields").click(function () {
        //TODO Aquí deberías obtner el día y la hora, para luego pasárselo a la función que compruebe la disponibilidad;
    })
})

function getSports(center) {
    var port = location.port; //Obtenemos el puerto
    var uri = "http://localhost:" + port + "/api/SportCenter/getSports/"+center; //Dirección del servicio REST
    $.getJSON(uri) //Hacemos petición GET al servicio
        .done(function (data) {
            var sports = data;  //Obtenemos los datos
            addSports(sports)   //Llamamos a la función para que haga lo que proceda
                                      
        })
        .fail(function (jqXHR, textStatus, err) {  //Si hay error mostramos un mensaje
                               
        });
}

function addSports(sports) {
    emptySportList();
    for (var i = 0; i < sports.length; i++) {
        var sport = '<option value="' + sports[i].idField + '">' + sports[i].nameField + '</option>';  //Creamos el li
        $("#sports").append(sport); //Añadimos el li a la lista (ul)
    }
}

function emptySportList() {  //Vaciamos la lista, y añadimos la opción por defecto
    $("#sports").empty();
    var default_option = '<option>Selecciona el deporte</option>';
    $("#sports").append(default_option);
}

function checkAvailability(date) {
    //TODO-Aquí es donde tienes que hacer la petición GET al servicio REST como hago yo en el método getSports(center)
}

function addFields(fields) {
    //TODO-Aquí tienes que añadir al select de campos disponibles los campos disponibles tras la consumición del servicio
}