import React from 'react';
import Axios from 'axios';

class Login extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state = {
            email: "",
            mobile: "",
            type: "",
            otp: ""
        }
    }
    verifyUser = () =>{
        if(this.state.type!="")
        {
            Axios.post("http://localhost:8081/login/verify",
            {
                email: this.state.email,
                mobile_no: this.state.mobile,
                type: this.state.type,
                otp: this.state.otp
            }).then((Response) => 
            {
                console.log(Response.data);
                if(Response.data!==null && Response.data!="-1" && Response.data!="0")
                {
                    this.props.setUser(Response.data);
                }
                else
                {
                    console.log("null user");
                }
            });
        }
        else
        {
            console.log("type not specified");
        }
        
    }

    changeEmail = (event) =>{
        this.setState({email: event.target.value});
    }

    changeMobile = (event) =>{
        this.setState({mobile: event.target.value});
    }

    changeOtp = (event) =>{
        this.setState({otp: event.target.value});
    }

    changeType = (t) =>{
        this.setState({type: t}, () => {
            console.log(this.state.type);
        });
    }

    render()
    {
        return (
            
            <div className="container" style={{ width: "500px", borderRadius: "15px", marginTop: "100px",height: "700px", paddingTop: "20px" }}>
                    <div className="row" style={{margin: "20px"}}>
                        <label><b><i>Email</i></b></label>
                        <input type="email" className="form-control border border-dark" placeholder="Enter email" onChange={this.changeEmail.bind(this)}/>
                    </div>
                <div className="row" style={{ margin: "20px" }}>
                        <button type="button" className=" btn btn-primary mt-3" onClick={this.changeType.bind(this,"email")}>Send OTP</button>
                    </div>
                    <div className="row" style={{margin: "20px"}}>
                        <label><b><i>Mobile</i></b></label>
                        <input type="text" maxLength="10" className="form-control border border-dark" placeholder="Enter mobile" onChange={this.changeMobile.bind(this)}/>
                    </div>
                    <div className="row" style={{margin: "20px"}}>
                        <button type="button" className="btn  btn-primary mt-3" onClick={this.changeType.bind(this,"mobile")}>Send OTP</button>
                    </div>
                    <div className="row" style={{margin: "20px"}}>
                        <label><b><i>OTP</i></b></label>
                        <input type="text" className="form-control border border-dark" placeholder="Enter OTP" maxLength="6" onChange={this.changeOtp.bind(this)}/>
                    </div>
                    <div className="row" style={{margin: "20px"}}>
                        <button type="button" className="btn btn-success mt-3 " onClick={this.verifyUser}>Login</button>
                    </div>
                </div>
        );
    }
}

export default Login;