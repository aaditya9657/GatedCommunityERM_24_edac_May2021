import React from 'react';
import P from '../../../profile1.png';
class Residents extends React.Component
{
    render()
    {
        //console.log(this.props.object);
        return(
            // <div className="row" style={{margin:"10px"}} onClick={this.props.switchMenu.bind(this, "conversation", this.props.object)}> 
            //      <div className= "col-sm-3">
            //          <img className="rounded-circle" src={P} alt="Cinque Terre"></img>
            //      </div>
            //     <div className="col-sm-9">
            //         <p>{this.props.object.name.fname + " " + this.props.object.name.lname + " " + this.props.house_no}</p>
            //     </div>
            // </div>

        <div>
            
            <div className="row justify-content: left" onClick={this.props.switchMenu.bind(this, "conversation", this.props.object)} style={{borderRadius:"10px",backgroundColor: "lightgoldenrodyellow",boxShadow:"0 5px 5px 5px #C7C3B5",margin:"10px"}}>
                <div className= "col-sm-3 card" style={{backgroundColor:"papayawhip"}}>
                    <img className="rounded-circle card-img-top" src={P} alt="Cinque Terre"/>
                </div>
                    <div className="col-sm-9" style={{marginTop:"30px"}}>
                        <p style={{textAlign:"center"}}><b>{this.props.object.name.fname + " " + this.props.object.name.lname + " " + this.props.house_no}</b></p>
                    </div>
                </div>
            </div>
        
            
        

        );


    }
}
export default Residents;