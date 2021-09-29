import React from 'react';

class EmergencyContacts extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        // console.log(this.props.object);
        return(
                <div className="col card" style={{height:"120px",borderRadius:"10px",boxShadow:"0 7px 7px 7px #C7C3B5",margin:"20px",backgroundColor:"lightsalmon"}}>
                    <table  style={{margin:"20px",textAlign:"center"}} >
                        <tbody>
                            <tr><th>{this.props.object.name}</th></tr>
                            <tr>{this.props.object.contact_no}</tr>
                        </tbody>
                    </table>

                </div>
        );
    }

    
}
export default EmergencyContacts;