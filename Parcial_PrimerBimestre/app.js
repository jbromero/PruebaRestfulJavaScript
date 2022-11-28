//variables
const url = 'https://jsonplaceholder.typicode.com/posts';
const respuesta = document.querySelector("#respuesta");

//evento
document.addEventListener("DOMContentLoaded", llamarAPI);

//funciones
function llamarAPI(){
    fetch(url)
    .then(resp => resp.json())
    .then((data) => mostrarHTML(data))
}

function mostrarHTML(datos){
    datos.forEach(element => {
        const row = document.createElement('tr');
        const tabla = `<td> ${element.title} </td> <td>${element.body}</td>`;
        // const tabla = '<td>'+ element.title + '</td> <td>'+ element.body +'</td>';
        row.innerHTML = tabla;
        respuesta.appendChild(row)
    });
}