import React, { Component } from 'react'
import FilmService from '../services/FilmService'

class ListFilmComponent extends React.Component {
    constructor(props) {
        super(props)

        this.state = {
            films: []

        }
        this.addFilm = this.addFilm.bind(this);
        this.editFilm = this.editFilm.bind(this);
        this.deleteFilm = this.deleteFilm.bind(this);
    }

    addFilm() {
        this.props.history.push('/create-film');
    }

    viewFilm(id) {
        this.props.history.push(`/view-employee/${id}`);
    }

    editFilm(id) {
        this.props.history.push(`/update-employee/${id}`);
    }

    deleteFilm(id) {
         FilmService.deleteFilm(id).then( res => {
            this.setState({employees: this.state.films.filter(film => film.id !== id)});
         });
    }

    componentDidMount() {
        FilmService.getFilms().then((res) => {
            this.setState({ films: res.data});
        });
    }



    render() {
        return(
            <div>
                <h2 className="text-center">Films List</h2>
                <div className="row">
                <button className="btn btn-primary" onClick={this.addFilm}> Add Employee </button>
                </div>
                <div className="row">
                    <table className="table table-striped table-bordered">
                        <thead>
                            <tr>
                                <th>Title</th>
                                <th>Description</th>
                                <th>Release Year</th>
                                <th>Language Id</th>
                                <th>Duration</th>
                                <th>Rating</th>
                                <th>Actions</th>
                            </tr>
                        </thead>

                        <tbody>
                            {
                                this.state.films.map(
                                   film =>
                                    <tr key = {film.id}>
                                         <td> { film.title } </td>
                                         <td> { film.description } </td>
                                         <td> { film.releaseYear } </td>
                                         <td> { film.languageId } </td>
                                         <td> { film.duration } </td>
                                         <td> { film.rating } </td>
                                         <td>
                                            <button onClick = { () => this.editFilm(film.id)} className="btn btn-info">Update</button>
                                            <button style = {{marginLeft: "10px"}} onClick = { () => this.deleteFilm(film.id)} className="btn btn-danger">Delete</button>
                                            <button style = {{marginLeft: "10px"}} onClick = { () => this.viewFilm(film.id)} className="btn btn-info">View</button>
                                         </td>
                                    </tr>
                                )
                            }
                        </tbody>
                    </table>
                 </div>
            </div>
        )
    }
}

export default ListFilmComponent