﻿$(document).ready(function () {
    
    $("#centers").change(function () {
        var center = $("#centers option:selected").val();
        getSports(center);
    })
  
    $(".available-fields").click(function () {
        //TODO Aquí deberías obtner el día y la hora, para luego pasárselo a la función que compruebe la disponibilidad;
       

        var idsportprov = $("#sports option:selected").val();
        var idscprov = $("#centers option:selected").val();
        
        var date = $(".booking-date").val();
        var time = $(".booking-time").val();

        var timeAr = time.split('-');
        var newTime = timeAr[0];

        var dateAr = date.split('-');
        var newDate = dateAr[2] + '-' + dateAr[1] + '-' + dateAr[0];
        
        var fecha = newDate + " " + newTime;

        checkAvailability(idsportprov, idscprov, fecha);
       
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

function checkAvailability(idsportprov, idscprov, fecha) {
    var port = location.port; //Obtenemos el puerto
    var uri = "http://localhost:" + port + "/api/SportCenter/getFields"; //Dirección del servicio REST
    //TODO-Aquí es donde tienes que hacer la petición GET al servicio REST como hago yo en el método getSports(center)
    $.ajax({
        url: uri,
        type: 'GET',
        data: {
            id_sport: idsportprov,
            id_sc: idscprov,
            fecha: fecha
        },
        dataType: 'json',
        success: function (data) {
            var fields = data;
            addFields(fields);

        },
        statusCode: {
            404: function () {
                alert('Failed');
            }
        }
    });
}

function addFields(fields) {
    //TODO-Aquí tienes que añadir al select de campos disponibles los campos disponibles tras la consumición del servicio
    for (var i = 0; i < fields.length; i++) {
        var field = '<li><div>' + fields[i].nameField + '</div></li>';
        $('#showfields').append(field);
    }
}