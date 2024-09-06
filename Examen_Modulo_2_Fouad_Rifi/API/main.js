/*
1- Conecta con la API de CHISTES EN ESPAÑOL
https://v2.jokeapi.dev/joke/Any?lang=es&type=single
Modelo del objeto JSON y documentación de la API en:
https://sv443.net/jokeapi/v2/
Son chistes random en español. Muestra al menos uno de los chistes en algún lugar de tu página.

*/

fetch('https://v2.jokeapi.dev/joke/Any?lang=es&blacklistFlags=racist&type=single')
.then(response => response.json())
.then(data => {

    const chiste = data.joke;
    document.getElementById("chisteEspanol").innerHTML = "- Chiste Español: " + chiste;


})
.catch(error => console.error('Error al obtener los chiste:', error));

/*
2- Conecta con la API de CHISTES DE CHUCK NORRIS
https://api.chucknorris.io/jokes/random
Modelo del objeto JSON y documentación de la API en:
https://api.chucknorris.io/
Son chistes random en inglés con Chuck Norris como estrella principal. Muestra al menos uno de los chistes en algún lugar de tu página.

*/

fetch('https://api.chucknorris.io/jokes/random')
.then(response => response.json())
.then(data => {

    const chisteChuck = data.value;
    document.getElementById("chisteChuck").innerHTML = "- Chiste Chuck: " + chisteChuck;
    console.log(chisteChuck);

})
.catch(error => console.error('Error al obtener los chiste:', error));





