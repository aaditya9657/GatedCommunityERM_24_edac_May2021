import React from 'react';
import EC from './emergencycontacts';
import Axios from 'axios';
class EmergencyContactsTab extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis = [];

        for (const iterator of this.props.c_s.emergency_contacts) 
        {
            // console.log(iterator);
            dis.push(<EC object={iterator}></EC>);
                
        }

        return(
            <div className="row" style={{marginTop:"20px"}}>
            <h1 className="col-sm-12">Emergency Contacts</h1>
            <div className="col-sm-12 container-fluid">
                <div className="row flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}}>
                    {dis.map((value) => { return value})}
                </div>
            </div>
             
         </div>
        );
    }

    
}
export default EmergencyContactsTab;