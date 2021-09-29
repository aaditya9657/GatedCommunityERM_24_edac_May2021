import React from 'react';
import Axios from 'axios';
import P from '../../../profile3.png';
import S from './society';
class Profile extends React.Component
{
    constructor(props)
    {
        super(props);
    }


    render()
    {
        //console.log(this.props.c_h);
        return(
            
            <div className="row">
                 {/* <div className= "col-sm-4">
                     <img className="img-thumbnail" src={P} alt="Cinque Terre"></img>
                 </div>
                <div className= "col-sm-8">
                    <p><b>Name: </b>{this.props.u.name.fname+" "+this.props.u.name.lname}</p>
                    <p><b>Mobile No: </b>{this.props.u.mobile_no[0].mob_no}</p>
                    <p><b> Email Id: </b>{this.props.u.emails[0].email}</p>
                    <p><b>Wing: </b>{this.props.c_h.wing}</p>
                    <p><b>Flat No: </b>{this.props.c_h.flat_no}</p>
                </div> */}

                {/* <div className="col-md-4">

                </div> */}
                <div className="col-md-4" style={{marginLeft:"250px"}}>
                    <div className="card" style={{marginTop:"30px",backgroundColor:"lightgoldenrodyellow"}}>
                        <div className="card-header" style={{backgroundColor:"darksalmon"}}>
                            <span style={{fontWeight:"bold",fontSize:"20px"}}><center>Profile</center></span>
                        </div>
                        <div className="card-body">
                        <center><img className="img-thumbnail" src={P} alt="Cinque Terre"></img></center>
                            <p style={{marginLeft:"110px"}}><b>Name: </b>{this.props.u.name.fname+" "+this.props.u.name.lname}</p>
                            <p style={{marginLeft:"110px"}}><b>Mobile No: </b>{this.props.u.mobile_no[0].mob_no}</p>
                            <p style={{marginLeft:"110px"}}><b> Email Id: </b>{this.props.u.emails[0].email}</p>
                            <p style={{marginLeft:"110px"}}><b>Wing: </b>{this.props.c_h.wing}</p>
                            <p style={{marginLeft:"110px"}}><b>Flat No: </b>{this.props.c_h.flat_no}</p>
                        </div>
                        
                    </div>
                </div>
                <div className="col-md-4" style={{marginTop:"30px"}}>
                    <S u_id={this.props.u.id}></S>
                </div>
            </div>
             
        );
    }
}
export default Profile;