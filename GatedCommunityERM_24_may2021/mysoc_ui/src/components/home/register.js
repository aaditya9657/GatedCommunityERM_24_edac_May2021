import axios from 'axios';
import React from 'react';


class Register extends React.Component
{

    constructor(props)
    {
        super(props);
        this.state={
            firstname: "",
            middlename: "",
            lastname: "",
            email: "",
            mobile: "",
            mobile_otp: "",
            email_otp: "",
            mobileotpverified: false,
            emailotpverified: false
        };
    }

    onchangefirst_name = (event) =>{
        this.setState({firstname: event.target.value});
    }

    onchangemiddle_name = (event) =>{
        this.setState({middlename: event.target.value});
    }

    onchangelast_name = (event) =>{
        this.setState({lastname: event.target.value});
    }

    onchangeemail = (event) =>{
        this.setState({email: event.target.value}, () => {
            console.log(this.state.email);
        });
    }

    onchangemobile = (event) =>{
        this.setState({mobile: event.target.value});
    }

    changeemailotp = (event) =>{
        this.setState({email_otp: event.target.value});
    }

    changemobileotp = (event) =>{
        this.setState({mobile_otp: event.target.value});
    }

    sendemailotp = () =>{
        console.log("Otp sent to email");
    }

    sendmobileotp = () =>{
        console.log("Otp sent to mobile");
    }

    verifymobileotp = () =>{
        if(this.state.mobile_otp==696969)
        {
            this.setState({mobileotpverified: true}, () => {console.log("mobile otp verified")});
        }
    }

    verifyemailotp = () =>{
        if(this.state.email_otp==696969)
        {
            this.setState({emailotpverified: true}, () => {console.log("email otp verified")});
        }
    }

    verifyRegistration = () => {
        if(this.state.mobileotpverified && this.state.emailotpverified)
        {
            axios.post("http://localhost:8081/registration/userregistration", 
            {
              firstname: this.state.firstname,
              middlename: this.state.middlename,
              lastname: this.state.lastname,
              email: this.state.email,
              mobile: this.state.mobile
            }).then((Response) => {
                console.log(Response.data);
                if(Response.data>0)
                    this.props.setId(Response.data);
            });
        }
        else{
            console.log("otp not verified");
        }
       
    }

    render()
    {
        return(
            <div className="container"style={{width: "500px",borderRadius: "15px", marginTop: "10px", paddingTop: "40px"}}>
                <div className="row" style={{margin: "20px"}}>
                   <label><b>First name</b></label>
                    <input type="text" className="form-control border border-dark" placeholder="Enter First name"  onChange={this.onchangefirst_name.bind(this)}/>
                </div>
                <div className="row" style={{margin: "20px"}}>
                   <label><b>Middle name</b></label>
                    <input type="text" className="form-control border border-dark" placeholder="Enter Middle name"  onChange={this.onchangemiddle_name.bind(this)}/>
                </div>
                <div className="row" style={{margin: "20px"}}>
                   <label><b>Last name</b></label>
                    <input type="text" className="form-control border border-dark" placeholder="Enter Last name"  onChange={this.onchangelast_name.bind(this)}/>
                </div>
                <div className="row" style={{margin: "20px"}}>
                    <label><b>Email</b></label>
                    <input type="email" className="form-control border border-dark" placeholder="Enter email" onChange={this.onchangeemail.bind(this)}/>
                </div>
                <div className="row" style={{margin: "20px"}}>
                    <button type="button" className="btn btn-primary mt-3 " onClick={this.sendemailotp}>Send OTP</button>
                </div>
                <div className="row" style={{margin: "20px"}}>
                        <label><b>Enter OTP</b></label>
                        <input type="text" className="form-control border border-dark" placeholder="Enter OTP" maxLength="6" onChange={this.changeemailotp.bind(this)}/>
                </div>
                <div className="row" style={{margin: "20px"}}>
                    <button type="button" className="btn btn-primary mt-3" onClick={this.verifyemailotp}>Verify</button>
                </div>
                <div className="row" style={{margin: "20px"}}>
                    <label><b>Mobile No</b></label>
                    <input type="number" className="form-control border border-dark" placeholder="Enter mobile no" onChange={this.onchangemobile.bind(this)}/>
                </div>
                <div className="row" style={{margin: "20px"}}>
                    <button type="button" className="btn btn-primary mt-3" onClick={this.sendmobileotp}>Send OTP</button>
                </div>
                <div className="row" style={{margin: "20px"}}>
                        <label><b>Enter OTP</b></label>
                        <input type="text" className="form-control border border-dark" placeholder="Enter OTP" maxLength="6" onChange={this.changemobileotp.bind(this)}/>
                </div>
                <div className="row" style={{margin: "20px"}}>
                    <button type="button" className="btn btn-primary mt-3" onClick={this.verifymobileotp}>Verify</button>
                </div>
                <div className="row" style={{margin: "10px" ,marginLeft:"350px"}}>
                    <button type="button" className="btn btn-success mt-3" onClick={this.verifyRegistration}>Register</button>
                </div>
                
            </div>
        );
    }
}
export default Register;