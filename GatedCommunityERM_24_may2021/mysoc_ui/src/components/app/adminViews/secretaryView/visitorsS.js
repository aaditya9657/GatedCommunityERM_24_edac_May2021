import React from 'react';

class Visitors extends React.Component 
{
    constructor(props)
    {
        super(props);
        
    }

    render()
    {
        return(
            <div className="col-sm-3 card" style={{margin:"10px",backgroundColor:"#C79FA7", borderRadius:"20px"}}>
                 <div>
                     <table>
                         <tbody>
                             <tr>
                                <th>Name :</th>
                                <td>{this.props.fname+" "+this.props.lname}</td>
                             </tr>
                             <tr>
                                <th>Mobile No :</th>
                                <td>{this.props.mob_no}</td>
                             </tr>
                             <tr>
                                <th>Reason :</th>
                                <td>{this.props.reason}</td>
                             </tr>
                             <tr>
                                <th>Time Of Entry :</th>
                                <td>{this.props.in_time}</td>
                             </tr>
                             <tr> 
                                <th>Time Of Exit :</th>
                                <td>{this.props.out_time}</td>
                             </tr>
                             <tr> 
                                <th>Wing :</th>
                                <td>{this.props.wing}</td>
                             </tr>
                             <tr> 
                                <th>Flat No :</th>
                                <td>{this.props.flat_no}</td>
                             </tr>
                             <tr>
                                <th>Vehicle Type :</th>
                                <td>{this.props.vehicle_type}</td>
                             </tr>
                             <tr>
                                <th>Registration No :</th>
                                <td>{this.props.registration_no}</td>
                             </tr>
                             
                         </tbody>
                     </table>
                </div>
            </div>
        );
    }
}
export default Visitors;