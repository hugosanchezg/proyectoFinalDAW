INSERT INTO `peliculas` (`id_pelicula`, `foto`, `nombre`, `descripcion`, `duracion`, `precio`, `stock`, `rebaja`, `descatalogado`, `id_genero`) VALUES
(1, '../../../assets/img/1.webp', 'El Padrino', 'La familia Corleone lucha por mantener su poder en Nueva York.','2 horas y 55 minutos', 10.99, 50, 0, 0, 2),
(2, '../../../assets/img/2.jpg', 'Titanic', 'Un joven pobre y una joven rica se enamoran a bordo del Titanic, el barco más grande y lujoso del mundo.', '3 horas y 14 minutos', 8.99, 75, 0, 0, 2),
(3, '../../../assets/img/3.jpg', 'La La Land', 'Una actriz y un músico se enamoran en Los Ángeles mientras persiguen sus sueños.', '2 horas y 8 minutos', 12.99, 25, 0, 0, 3),
(4, '../../../assets/img/4.jpg', 'Forrest Gump', 'La vida de Forrest Gump, un hombre con discapacidad intelectual, y su influencia en la historia de Estados Unidos.', '2 horas y 22 minutos', 9.99, 60, 0, 0, 4),
(5, '../../../assets/img/5.jpeg', 'El Rey León', 'Simba, un joven león, debe enfrentarse a su malvado tío Scar para reclamar su lugar como rey de la selva.', '1 hora y 28 minutos', 7.99, 100, 0, 0, 5),
(6, '../../../assets/img/6.webp', 'Harry Potter y la Piedra Filosofal', 'Harry Potter descubre que es un mago y comienza su educación en Hogwarts, la escuela de magia y hechicería.', '2 horas y 32 minutos', 11.99, 40, 0, 0, 1),
(7, '../../../assets/img/7.jpg', 'El Señor de los Anillos: La Comunidad del Anillo', 'Frodo Bolsón y un grupo de amigos emprenden un peligroso viaje para destruir un anillo mágico que amenaza el mundo.', '2 horas y 58 minutos', 13.99, 30, 0, 0, 1),
(8, '../../../assets/img/8.jpg', 'Star Wars: Episodio IV - Una Nueva Esperanza', 'Un joven granjero llamado Luke Skywalker se une a la lucha contra el Imperio Galáctico con la ayuda de un jedi y un contrabandista.', '2 horas y 5 minutos', 10.99, 50, 0, 0, 6);

INSERT INTO `generos` (`id_genero`, `nombre`) VALUES
(1, 'Fantasia'),
(2, 'Drama'),
(3, 'Romantico'),
(4, 'Comedia'),
(5, 'Infantil'),
(6, 'Accion');