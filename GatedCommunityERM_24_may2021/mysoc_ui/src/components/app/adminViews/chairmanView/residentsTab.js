import React from 'react';
import R from './residentsC';
import Axios from 'axios';

class ResidentsTab extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state ={houses: []};
        this.getUsers();
    }

    getUsers = () =>{
        Axios.post("http://localhost:8081/society/getSocietyResidents",
            {
                id: this.props.c_s.id
            }).then((Response) => {
                this.setState({houses: Response.data});
            })
    }

    render()
    {
        var dis = [];

        for (const iterator of this.state.houses) 
        {
            // console.log(iterator);
            for (const iterator1 of iterator.users) 
            {
                // console.log(iterator1);
                dis.push(<R object={iterator1} flat_no={iterator.wing +"-"+iterator.flat_no} getUsers={this.getUsers}></R>);
            }     
        }
        return (
            // <div className="container">
            <div className="row">
            <h1 className="col-sm-12">Residents</h1>
            <div className="col-sm-12 container-fluid">
                <div className="row flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}}>
                {dis.map((value) => { return value})}
                </div>
            </div>
             
                </div>
        //  </div>
        );

            
    }
}
export default ResidentsTab;