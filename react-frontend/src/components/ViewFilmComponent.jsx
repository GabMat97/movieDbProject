import React, { Component } from 'react';
import FilmService from '../services/FilmService'

class ViewFilmComponent extends React.Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            employee: {}

        }
    }

    componentDidMount() {
        FilmService.getFilmById(this.state.id).then(res => {
           this.setState({employee: res.data});
        })
    }

    render() {
        return(
            <div>
                <div>
                    <div className = "card col-md-6 offset-md-3">
                        <h3 className = "text-center"> View Film Details </h3>
                        <div className = "card-body">
                            <div className="row">
                                <label>Title</label>
                                <div> { this.state.film.title } </div>
                            </div>
                            <div className="row">
                                <label>Description</label>
                                <div> { this.state.film.description } </div>
                            </div>
                            <div className="row">
                                 <label>Release Year</label>
                                 <div> { this.state.film.releaseYear } </div>
                            </div>
                            <div className="row">
                                  <label>LanguageId</label>
                                  <div> { this.state.film.languageId } </div>
                            </div>
                            <div className="row">
                                   <label>Duration</label>
                                   <div> { this.state.film.duration } </div>
                            </div>
                            <div className="row">
                                    <label>Rating</label>
                                    <div> { this.state.film.rating } </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}

export default ViewFilmComponent