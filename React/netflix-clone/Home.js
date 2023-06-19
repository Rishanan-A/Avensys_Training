import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Card, Carousel } from 'react-bootstrap';
import './Home.css';
import movieTrailer from 'movie-trailer';

function Home() {
  const [topMovies, setTopMovies] = useState([]);
  const [topTvShows, setTopTvShows] = useState([]);
  const [actionMovies, setActionMovies] = useState([]);
  const [recommendedMovies, setRecommendedMovies] = useState([]);
  const [selectedMovie, setSelectedMovie] = useState(null);
  const [selectedMovieTrailer, setSelectedMovieTrailer] = useState('');

  useEffect(() => {
    const fetchTopMovies = async () => {
      const response = await axios.get('https://api.themoviedb.org/3/movie/top_rated?api_key=ee6890bc95341f1a258ac80a3dddc9a2');
      setTopMovies(response.data.results);
    };

    const fetchTopTvShows = async () => {
      const response = await axios.get('https://api.themoviedb.org/3/tv/top_rated?api_key=ee6890bc95341f1a258ac80a3dddc9a2');
      setTopTvShows(response.data.results);
    };

    const fetchActionMovies = async () => {
      const actionMoviesResponse = await axios.get(`https://api.themoviedb.org/3/discover/movie?api_key=ee6890bc95341f1a258ac80a3dddc9a2&with_genres=35`);
      setActionMovies(actionMoviesResponse.data.results);
    };

    const fetchRecommendedMovies = async () => {
      const response = await axios.get('https://api.themoviedb.org/3/movie/popular?api_key=ee6890bc95341f1a258ac80a3dddc9a2');
      setRecommendedMovies(response.data.results);
    };

    fetchRecommendedMovies();
    fetchTopMovies();
    fetchTopTvShows();
    fetchActionMovies();
  }, []);

  const renderMovies = (movies, numberOfMoviesToShow, sectionType) => (
    <div className="scrollable-row">
      {movies.slice(0, numberOfMoviesToShow).map(movie => (
        <div key={movie.id} className="scrollable-item">
          <Card
            className={`card-style bg-midnight-black text-white ${
              (sectionType === 'topMovies' && selectedMovie === movie) ||
              (sectionType === 'topTvShows' && selectedMovie === movie) ||
              (sectionType === 'actionMovies' && selectedMovie === movie)
                ? 'selected-movie'
                : ''
            }`}
            onClick={() => handleMovieClick(movie, sectionType)}
          >
            <Card.Img variant="top" src={`https://image.tmdb.org/t/p/w500${movie.poster_path}`} alt={movie.title} />
            <Card.Body>
              <Card.Title className="card-title">{movie.name || movie.title}</Card.Title>
            </Card.Body>
          </Card>
          {((sectionType === 'topMovies' && selectedMovie === movie) ||
            (sectionType === 'topTvShows' && selectedMovie === movie) ||
            (sectionType === 'actionMovies' && selectedMovie === movie)) && (
            <div className="selected-movie-trailer">
              {selectedMovieTrailer ? (
                <iframe
                  src={`https://www.youtube.com/embed/${selectedMovieTrailer}`}
                  title="Selected Movie Trailer"
                  className="selected-movie-trailer-iframe"
                  allowFullScreen
                />
              ) : (
                <p>No trailer available</p>
              )}
            </div>
          )}
        </div>
      ))}
    </div>
  );

  const handleMovieClick = (movie, sectionType) => {
    if (selectedMovie === movie) {
      setSelectedMovie(null);
      setSelectedMovieTrailer('');
    } else {
      setSelectedMovie(movie);
      const movieTitle = movie.name || movie.title;
      movieTrailer(movieTitle)
        .then(url => {
          const videoId = extractVideoIdFromUrl(url);
          setSelectedMovieTrailer(videoId);
        })
        .catch(error => {
          console.log('Error fetching trailer:', error);
          setSelectedMovieTrailer('');
        });
    }
  };
  

  const extractVideoIdFromUrl = (url) => {
    const urlParams = new URLSearchParams(new URL(url).search);
    return urlParams.get('v') || '';
  };

  return (
    <div className="container-fluid py-5 bg-midnight-black text-white">
      <Carousel className="carousel-container">
        {recommendedMovies.slice(0, 5).map(movie => (
          <Carousel.Item key={movie.id}>
            <img
              className="d-block w-100 carousel-image"
              src={`https://image.tmdb.org/t/p/w500${movie.backdrop_path}`}
              alt={movie.title}
            />
            <Carousel.Caption className="carousel-caption">
              <h3 className="carousel-title">{movie.title}</h3>
              <p className="carousel-description">{movie.overview}</p>
            </Carousel.Caption>
          </Carousel.Item>
        ))}
      </Carousel>

      <h2 className="category-title">Top Movies</h2>
      {renderMovies(topMovies, 50, 'topMovies')}

      <h2 className="category-title">Top TV Shows</h2>
      {renderMovies(topTvShows, 50, 'topTvShows')}

      <h2 className="category-title">Action Movies</h2>
      {renderMovies(actionMovies, 50, 'actionMovies')}
    </div>
  );
}

export default Home;
