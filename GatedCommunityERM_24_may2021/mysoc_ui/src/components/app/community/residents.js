import React from 'react';
import Axios from 'axios';

class Residents extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        console.log(this.props.object);
        return(
            <div className="col-sm-3 card" style={{height:"120px",borderRadius:"10px",boxShadow:"0 7px 7px 7px #C7C3B5",margin:"20px",backgroundColor:"lightsalmon"}}>
            <table style={{margin:"20px"}}>
                <tbody>
                    <tr>
                        <th>Name :</th>
                        <td>{this.props.object.name.fname+" "+this.props.object.name.lname}</td>
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
        );
    }

    
}
export default Residents;