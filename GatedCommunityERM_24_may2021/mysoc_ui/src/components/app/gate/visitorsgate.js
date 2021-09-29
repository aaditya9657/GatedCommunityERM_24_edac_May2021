import React from "react";
class VisitorsGate extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        // console.log(this.props.object);
        return(
            
            <div className="col-sm-3">
                 <div className= "col-sm-3">
                     <h4>{this.props.reason}</h4>
                     
                </div>
           

                 <div className="card" style={{height:"200px",borderRadius:"10px",boxShadow:"0 7px 7px 7px #C7C3B5",margin:"20px",backgroundColor:"lightsalmon"}}>
                     <table style={{margin:"20px"}}>
                     <tbody>
                             <tr>
                                <th>Name :</th>
                                <td>{this.props.object.name.fname+" "+this.props.object.name.lname}</td>
                             </tr>
                             <tr>
                                <th>Mobile No :</th>
                                <td>{this.props.object.mob_no}</td>
                             </tr>
                             <tr>
                                <th>Reason :</th>
                                <td>{this.props.object.reason}</td>
                             </tr>
                             <tr>
                                <th>Time Of Entry :</th>
                                <td>{this.props.object.in_time}</td>
                             </tr>
                             <tr> 
                                <th>Time Of Exit :</th>
                                <td>{this.props.object.out_time}</td>
                             </tr>
                         </tbody>
                     </table>
                </div>
            </div>
            
        );
    }
}
export default VisitorsGate;