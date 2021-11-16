import axios from 'axios';

const FILM_API_BASE_URL = "http://3.15.18.162:8080/movies/all";

class FilmService {

    getFilms() {
        return axios.get(FILM_API_BASE_URL)
        .then(function (response) {
         console.log(response.data);
         return response.data;
                })
    }
    createFilm(film) {
        return axios.post((FILM_API_BASE_URL), film);
    }
    getFilmById(filmId) {
        return axios.get(FILM_API_BASE_URL + '/' + filmId);
    }
    updateFilm(film, filmId) {
        return axios.put(FILM_API_BASE_URL + '/' + filmId, film);
    }
    deleteFilm(film, filmId) {
        return axios.delete(FILM_API_BASE_URL +'/' + filmId)
    }
}

export default new FilmService()