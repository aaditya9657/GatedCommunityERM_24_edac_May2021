import React from 'react';
import Home from './home/home';
import App from './app/app';
import Axios from 'axios';

class Main extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={
            u: [],
            status:"loggedout"
        }
    }

    setUser = (who) =>{
        this.setState({u: who, status:"logged"});
    }

    logout = () =>{
        this.setState({u_id: [], status:"loggedout"});
    }

    render()
    {
        if(this.state.status=="logged")
        {
            return(
                <div>
                    <App u={this.state.u} logout={this.logout}/>
                </div>
            ); 
        }
        else
        {
            return(
                <div>
                    <Home setUser={this.setUser}/>
                </div>
            );
        }
    }
}

export default Main;