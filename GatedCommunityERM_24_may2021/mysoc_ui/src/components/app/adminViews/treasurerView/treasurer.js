import axios from 'axios';
import React from 'react';
import Maintenance from './maintenance';

class Treasurer extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {houses:[]};
        this.getData();
    }

    getData = () =>{
        axios.post("http://localhost:8081/society/getSocietyResidents", 
        {
            id: this.props.c_s.id
        }).then((Response) => {
            console.log(Response.data);
            this.setState({houses: Response.data});
        })
    }

    render()
    {
        var dis = [];

        for (const iterator of this.state.houses) 
        {
            dis.push(
                <Maintenance c_h={iterator} getData={this.getData}/>
            );
        }
        return (
        <>
            {dis.map((value) => {return value})}
        </>)
    }
}
export default Treasurer;