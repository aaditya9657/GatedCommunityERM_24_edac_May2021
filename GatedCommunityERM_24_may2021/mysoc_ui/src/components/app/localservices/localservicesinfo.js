import React from 'react';
import Axios from 'axios';


class LocalServicesInfo extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    
    render()
    {
        
       //console.log(this.props.object);
        var dis = [];

        for (const iterator of this.props.c_s.houses) {
            for (const iterator1 of iterator.local_services) {
                if(iterator1.id == this.props.object.id)
                {
                    dis.push(
                        <tr>
                            <td>{iterator.wing+" -"+iterator.flat_no}</td>
                        </tr>
                    );
                }
            }
        }
        return(   
                   
            <div className= "col card" style={{height:"200px",width:"400px",backgroundColor: "mediumaquamarine", borderRadius:"10px",boxShadow:"0 5px 5px 5px #C7C3B5",margin:"50px"}}>
                     <table style={{margin:"20px"}}>
                         <tbody>
                             <tr>
                                <th>Name :</th>
                                <td>{this.props.object.name.fname+" "+this.props.object.name.lname}</td>
                             </tr>
                             <tr>
                                <th>Mobile No :</th>
                                <td>{this.props.object.mobiles[0].mob_no}</td>
                             </tr>
                             <tr>
                                <th>EmailId :</th>
                                <td>{this.props.object.emails[0].email}</td>
                             </tr>
                             <tr>
                                <th>Type :</th>
                                <td>{this.props.object.types}</td>
                             </tr> 
                                <tr>
                                    <th>Visiting Houses :</th>
                                    <td>{dis.map((value) => { return value})}</td>
                                </tr>                         
                         </tbody>
                     </table>
                     </div>  
                
        );
    }
}
export default LocalServicesInfo;