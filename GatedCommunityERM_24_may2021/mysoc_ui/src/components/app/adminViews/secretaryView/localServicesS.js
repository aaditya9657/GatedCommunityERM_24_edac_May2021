import axios from 'axios';
import React from 'react';

class localServicesS extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    
    deleteLocalService = () =>{
        axios.post("http://localhost:8081/society/deleteLocalService", 
        {
            id: this.props.id,
            s_id: this.props.c_s.id
        }).then((Response) =>{
            console.log(Response.data);
            if(Response.data == true)
            {
                this.props.getLocalServices();
            }
        })
    }

    render()
    {
        
    
        return(            
            <tr>
                <td>{this.props.fname+" "+this.props.lname}</td>
                <td>{this.props.mobiles}</td>
                <td>{this.props.emails}</td>
                <td>{this.props.types}</td>
                <td><button className="text-white" style={{backgroundColor:"red"}} onClick={this.deleteLocalService}>Delete</button></td>
            </tr>                       
                    
        );
    }
}
export default localServicesS;