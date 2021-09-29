import React from "react";
import PP from '../../../profile1.png';
class LocalServicesGate extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={type:" ",profilepic:"../../../profile.png"}

        if(this.props.profilepic)
        {
            this.setState({profilepic:this.props.profilepic})
        }

        if(this.props.type)
        {
            this.setState({type:this.props.type})
        }
    }
    render()
    {
        // console.log(this.props.object);
        return(
            <div className="card" style={{height:"350px",borderRadius:"10px",boxShadow:"0 7px 7px 7px #C7C3B5",margin:"20px",backgroundColor:"darksalmon"}}>
            <h5 className="text-center">{this.props.object.types}</h5> 
                <img className="img-thumbnail" src={PP} alt="image"></img>
                <p style={{textAlign:"center"}}><b>{this.props.object.name.fname + " " + this.props.object.name.lname}</b></p>
            </div>
           

        );
    }


}
export default LocalServicesGate;