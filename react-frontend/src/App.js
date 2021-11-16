import React, {Fragment} from 'react'
import './App.css';
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom';
import ListFilmComponent from './components/ListFilmComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import CreateFilmComponent from './components/CreateFilmComponent';
import ViewFilmComponent from './components/ViewFilmComponent';
import UpdateFilmComponent from './components/UpdateFilmComponent';


function App() {
  return (
    <div>
     <Router>
        <Fragment>
        <div className="container">
            <HeaderComponent />
                <div className="container">
                    <Routes>
                        <Route path="/" exact element = {<ListFilmComponent/>}></Route>
                        <Route path="/all" element = {<ListFilmComponent/>}></Route>
                        <Route path="/add-film" element = {<CreateFilmComponent/>}></Route>
                        <Route path="/update-film/:id" element = {<UpdateFilmComponent/>}></Route>
                        <Route path="view-employee/:id" element = {<ViewFilmComponent/>}></Route>
                    </Routes>
                </div>
            <FooterComponent />
        </div>
        </Fragment>
     </Router>
    </div>
  );
}

export default App;
