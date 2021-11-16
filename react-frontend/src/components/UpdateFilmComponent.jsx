import React, { Component } from 'react';
import FilmService from '../services/FilmService';

class UpdateFilmComponent extends React.Component{
    constructor(props) {
            super(props)

            this.state = {
                id: this.props.match.params.id,
                title: '',
                description: '',
                release_year: '',
                language_id: '',
                duration: '',
                rating: ''
            }

            this.changeTitleHandler = this.changeTitleHandler.bind(this);
            this.changeDescriptionHandler = this.changeDescriptionHandler.bind(this);
            this.changeReleaseYearHandler = this.changeReleaseYearHandler.bind(this);
            this.changeLanguageIdHandler = this.changeLanguageIdHandler.bind(this);
            this.changeDurationHandler = this.changeDurationHandler.bind(this);
            this.changeRatingHandler = this.changeRatingHandler.bind(this);
            this.updateFilm = this.updateFilm.bind(this);
        }

        componentDidMount() {
            FilmService.getFilmById(this.state.id).then( (res) => {
                let film = res.data;
                this.setState({
                    title: film.title,
                    description: film.description,
                    release_year: film.release_year,
                    language_id: film.language_id,
                    duration: film.duration,
                    rating: film.rating
                });
            });
        }

        updateFilm = (e) => {
            e.preventDefault();
            let film = {
            title: this.state.title,
            description: this.state.description,
            release_year: this.state.release_year,
            language: this.state.language,
            duration: this.state.duration,
            rating: this.state.rating}
            FilmService.updateFilm(film.this.state.id).then( res => {
                this.props.history.push('/employees');
            });
        }

        changeTitleHandler(event) {
            this.setState({title: event.target.value});
        }

        changeDescriptionHandler(event) {
            this.setState({description: event.target.value});
        }

        changeReleaseYearHandler(event) {
            this.setState({release_year: event.target.value});
        }

        changeLanguageIdHandler(event) {
            this.setState({language_id: event.target.value});
        }

        changeDurationHandler(event) {
            this.setState({duration: event.target.value});
        }

        changeRatingHandler(event) {
            this.setState({rating: event.target.value});
        }

        cancel() {
            this.props.history.push('/all')
        }

        render() {
            return(
                <div>
                    <div className= "container">
                        <div className="row">
                            <div className = "card col-md-6 offset-md=3 offset-md-3">
                                <h3 className = "text-center">Update Film</h3>
                                <div className = "card-body">

                                    <form>
                                        <div className = "form-group">
                                            <label>Title</label>
                                            <input placeholder="Title" name="title" className="form-control"
                                                value={this.state.title} onChange={this.changeTitleHandler}/>
                                        </div>
                                        <div className = "form-group">
                                             <label>Description</label>
                                             <input placeholder="Description" name="description" className="form-control"
                                                 value={this.state.description} onChange={this.changeDescriptionHandler}/>
                                        </div>
                                        <div className = "form-group">
                                             <label>Release Year</label>
                                             <input placeholder="Release year" name="release_year" className="form-control"
                                                 value={this.state.release_year} onChange={this.changeReleaseYearHandler}/>
                                        </div>
                                        <div className = "form-group">
                                             <label>Language ID(1 for english, 2 for anything else)</label>
                                             <input placeholder="LanguageID" name="language_id" className="form-control"
                                                 value={this.state.language_id} onChange={this.changeLanguageIdHandler}/>
                                        </div>
                                        <div className = "form-group">
                                              <label>Duration</label>
                                              <input placeholder="Duration" name="duration" className="form-control"
                                                  value={this.state.duration} onChange={this.changeDurationHandler}/>
                                        </div>
                                        <div className = "form-group">
                                             <label>Rating</label>
                                             <input placeholder="Rating" name="rating" className="form-control"
                                                  value={this.state.rating} onChange={this.changeRatingHandler}/>
                                        </div>

                                        <button className="btn btn-success" onClick={this.updateFilm}>Save</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            )
        }
    }

export default UpdateFilmComponent