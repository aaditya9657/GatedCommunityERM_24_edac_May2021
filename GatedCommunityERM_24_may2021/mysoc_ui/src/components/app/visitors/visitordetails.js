import React from 'react';
import P from '../../../profile1.png';
class VisitorDetails extends React.Component 
{
    constructor(props)
    {
        super(props);
        this.state={typeofvisitor:"Guest",profilepic:"../../../profile1.png"}

        if(this.props.profilepic)
        {
            this.setState({profilepic:this.props.profilepic})
        }

        if(this.props.typeofvisitor)
        {
            this.setState({typeofvisitor:this.props.typeofvisitor})
        }
    }

    render()
    {
        return( 
            <div className="row card" style={{height:"300px",backgroundColor: "lightsalmon", borderRadius:"10px",boxShadow:"0 5px 5px 5px #C7C3B5",margin:"20px"}}>
                 <div className= "col-md-3" >
                    <h3>{this.props.reason}</h3>
                    <img className="img-thumbnail" src={P} alt="Cinque Terre"></img>
                </div>
                <div className="col-sm-6" style={{padding: "35px"}}>
                     <table style={{margin:"2px"}}>
                         <tbody>
                             <tr>
                                <th><h5>Name :</h5></th>
                                <td><b>{this.props.fname+" "+this.props.lname}</b></td>
                             </tr>
                             <tr>
                                <th><h5>Mobile No :</h5></th>
                                <td><b>{this.props.mob_no}</b></td>
                             </tr>
                             <tr>
                                <th><h5>Reason :</h5></th>
                                <td><b>{this.props.reason}</b></td>
                             </tr>
                             <tr>
                                <th><h5>Time Of Entry :</h5></th>
                                <td><b>{this.props.in_time}</b></td>
                             </tr>
                             <tr> 
                                <th><h5>Time Of Exit :</h5></th>
                                <td><b>{this.props.out_time}</b></td>
                             </tr>
                             <tr>
                                <th><h5>Vehicle Type :</h5></th>
                                <td><b>{this.props.vehicle_type}</b></td>
                             </tr>
                             <tr>
                                <th><h5>Registration No :</h5></th>
                                <td><b>{this.props.registration_no}</b></td>
                             </tr>
                             
                         </tbody>
                     </table>
                </div>
                 

                

                 {/* <div className= "col-sm-3">
                     <table>
                         <tbody>
                             <tr>
                                 <th>Vehicle info </th>
                             </tr>
                             
                             <tr>
                                <th>Type :</th>
                                <td>{this.props.vehicle_type}</td>
                             </tr>
                             <tr>
                                <th>Registration No :</th>
                                <td>{this.props.registration_no}</td>
                             </tr>
                         </tbody>
                     </table> */}
                 {/* </div> */}
             </div>
        );
    }
}
export default VisitorDetails;