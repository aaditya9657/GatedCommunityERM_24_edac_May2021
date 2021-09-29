import React from 'react';
import Axios from 'axios';

class Committee extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        // console.log(this.props.object);
        // console.log(this.props.object.user.mobile_no[0].mob_no);
        return(
                <div className="col-sm-3 card" style={{height:"120px",borderRadius:"10px",boxShadow:"0 7px 7px 7px #C7C3B5",margin:"20px",backgroundColor:"darksalmon"}}>
                    <table style={{margin:"20px"}}>
                        <tbody>
                            <tr>
                                <th>Designation:</th>
                                <td>{this.props.object.designation}</td>
                            </tr>
                            <tr>
                                <th>Name:</th>
                                <td>{this.props.object.user.name.fname+" "+this.props.object.user.name.lname}</td>
                            </tr>
                            <tr>
                                <td> </td>
                            </tr>
                            <tr>
                                <th>Number</th>
                                <td>{this.props.object.user.mobile_no[0].mob_no}</td>
                            </tr>
                        </tbody>
                    </table>

                </div>
        );
    }

    
}
export default Committee;