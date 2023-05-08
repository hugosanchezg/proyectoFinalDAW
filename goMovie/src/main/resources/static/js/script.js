
    //NAVBAR
    const body = document.querySelector("body"),
          nav = document.querySelector("nav"),
          modeToggle = document.querySelector(".dark-light"),
          searchToggle = document.querySelector(".searchToggle"),
          sidebarOpen = document.querySelector(".sidebarOpen"),
          siderbarClose = document.querySelector(".siderbarClose");

    //search box
    searchToggle.addEventListener("click" , () =>{
    searchToggle.classList.toggle("active");
    });

    //sidebar
    sidebarOpen.addEventListener("click" , () =>{
        nav.classList.add("active");
    });

    body.addEventListener("click" , e =>{
        let clickedElm = e.target;

        if(!clickedElm.classList.contains("sidebarOpen") && !clickedElm.classList.contains("menu")){
            nav.classList.remove("active");
        }
    });

    //ANIMACIONES CARDS
    const movieCards = document.querySelectorAll('.movie');
    const showCards = document.querySelectorAll('.show');

    function showCardInfo(card) {
        const info = card.querySelector('.overlay');
        info.classList.add('fade-in');
    }

    function hideCardInfo(card) {
        const info = card.querySelector('.overlay');
        info.classList.remove('fade-in');
    }

    movieCards.forEach(card => {
        card.addEventListener('mouseenter', () => {
        showCardInfo(card);
    });

    card.addEventListener('mouseleave', () => {
        hideCardInfo(card);
    });
    });

    showCards.forEach(card => {
        card.addEventListener('mouseenter', () => {
        showCardInfo(card);
    });

    card.addEventListener('mouseleave', () => {
        hideCardInfo(card);
    });
    });


    //SLIDESHOW
    let slideIndex = 1;
    let autoPlayInterval = 5000;
    let isAutoPlaying = true;
    let autoPlayTimer;

    function showSlide(n) {

      const slides = document.querySelectorAll("#slideshow img");
      const currentSlide = slides[n - 1];
      slides.forEach((slide) => (slide.style.opacity = "0"));
      currentSlide.style.opacity = "1";

    }

    function nextSlide(direction) {

        const slides = document.querySelectorAll("#slideshow img");
        slideIndex += direction;

        if (slideIndex > slides.length) {

            slideIndex = 1;

        }

        if (slideIndex < 1) {

            slideIndex = slides.length;

        }

        showSlide(slideIndex);

    }

    function autoSlide() {

        if (isAutoPlaying) {
            nextSlide(1);
            autoPlayTimer = setTimeout(autoSlide, autoPlayInterval);
        }
    }

    autoSlide();

    //TU LISTA
    // Asumiendo que tienes un arreglo llamado "listaDePeliculas" con los datos de cada película
    const movieContainer = document.querySelector('.movie-container');

    function mostrarPeliculas() {
      listaDePeliculas.forEach(pelicula => {
        const movieDiv = document.createElement('div');
        movieDiv.classList.add('movies');
        movieDiv.innerHTML = `
          <img src="${pelicula.poster}" alt="${pelicula.titulo}">
          <h3>${pelicula.titulo}</h3>
          <button class="remove-movie-btn">Eliminar</button>
        `;
        const removeBtn = movieDiv.querySelector('.remove-movie-btn');
        removeBtn.addEventListener('click', () => eliminarPelicula(pelicula.id));
        movieContainer.appendChild(movieDiv);
      });
    }

    function eliminarPelicula(id) {
      // Lógica para eliminar la película de la lista y actualizar la UI
    }

    mostrarPeliculas();


    //SECCIÓN PROXIMAMENTE
    /*
    const upcomingMovies = [
      {
        title: "Spider-Man: No Way Home",
        releaseDate: "17/12/2023",
        image: "https://via.placeholder.com/250x375?text=Spider-Man",
      },
      {
        title: "Avatar 2",
        releaseDate: "21/12/2023",
        image: "https://via.placeholder.com/250x375?text=Avatar+2",
      },
      {
        title: "Jurassic World: Dominion",
        releaseDate: "22/12/2023",
        image: "https://via.placeholder.com/250x375?text=Jurassic+World",
      },
    ];

    const movieList = document.querySelector(".movie-list");

    upcomingMovies.forEach((movie) => {
      const movieCard = document.createElement("div");
      movieCard.classList.add("movie-card");

      const movieImage = document.createElement("img");
      movieImage.src = movie.image;
      movieCard.appendChild(movieImage);

      const movieTitle = document.createElement("h3");
      movieTitle.textContent = movie.title;
      movieCard.appendChild(movieTitle);

      const movieReleaseDate = document.createElement("p");
      movieReleaseDate.textContent = `Estreno: ${movie.releaseDate}`;
      movieCard.appendChild(movieReleaseDate);

      movieList.appendChild(movieCard);
    });*/



