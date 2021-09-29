import React from 'react';
import PP from '../../../profile2.png';

class LocalServicesDetails extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={type:" ",profilepic:"../../../profile2.png"}

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
        return(            
                <div className= "col-md-2" onClick={this.props.switchViewTo.bind(this,"localservicesinfo",this.props.object)} style={{height:"260px",backgroundColor: "lightsalmon", borderRadius:"10px",boxShadow:"0 5px 5px 5px #C7C3B5",margin:"20px"}}>                    
                     <img className="img-thumbnail" src={PP} alt="Cinque Terre"></img>          
                     <p style={{textAlign:"center"}}><b>{this.props.object.name.fname +" "+this.props.object.name.lname}</b></p>
                 </div>         

        );
    }


}
export default LocalServicesDetails;