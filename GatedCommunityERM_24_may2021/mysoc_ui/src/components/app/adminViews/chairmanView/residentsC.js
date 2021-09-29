import axios from 'axios';
import React from 'react';


class Residents extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    deleteUser = () =>{
        console.log("user delete request with id: "+this.props.object.id);
        axios.post("http://localhost:8081/user/deleteUser", {
            id: this.props.object.id
        }).then((Response) =>{
            console.log(Response.data);
            if(Response.data==true)
                this.props.getUsers();
        })
    }

    render()
    {
        return (
            <div className="col-sm-3 card" style={{height:"150px", backgroundColor: "lightsalmon", borderRadius:"10px",boxShadow:"0 7px 7px 7px #C7C3B5",margin:"20px"}}>
            <div>
                    <table>
                        <tbody>
                            <tr>
                                <th>Name :</th>
                                <td>{this.props.object.name.fname+" "+this.props.object.name.lname}</td>
                                <td><button className="text-white" style={{backgroundColor:"red"}} onClick={this.deleteUser}>Delete</button></td>
                            </tr>
                            <tr>
                                <th>Flat No :</th>
                                <td>{this.props.flat_no}</td>
                            </tr>
                            <tr>
                                <th>Number :</th>
                                <td>{this.props.object.mobile_no[0].mob_no}</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                </div>
        );
    }
}
export default Residents;