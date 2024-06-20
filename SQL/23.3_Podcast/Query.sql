SELECT usuario.nombre, descargas.fecha, podcast.nombre FROM descargas, podcast, usuario
WHERE usuario.idUsuario = descargas.Usuario_idUsuario AND descargas.Podcast_idPodcast = podcast.idPodcast;