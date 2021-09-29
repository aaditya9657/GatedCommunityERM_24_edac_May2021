import Axios from 'axios';
import React from 'react';


class Conversation extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={object: [], status: "null", new_message: ""};
        this.getConversation();
    }

    sendMessage = () =>{
        Axios.post("http://localhost:8081/user/sendMessage", 
        {
            u_id: this.props.u.id,
            to_id: this.props.with.id,
            message: this.state.new_message
        }).then((Response) => {
            this.getConversation();
                //  console.log(Response.data);
                // this.setState({object: Response.data}, () =>{
                    // this.setState({status: "received"})
                    // console.log(this.state.object);
                    
                // });
        });
    }

    getConversation = () =>{
        Axios.post("http://localhost:8081/user/getConversation", 
        {
            u_id: this.props.u.id,
            with_id: this.props.with.id
        }).then((Response) => {
                //  console.log(Response.data);
                this.setState({object: Response.data}, () =>{
                    this.setState({status: "received"})
                    // console.log(this.state.object);
                });
        });
    }


    bindMessage = (event) => {
        this.setState({new_message: event.target.value}, () =>{
            // console.log(this.state.new_message)
        });
    }

    render()
    {
        var dis = [];
        if(this.state.status=="received")
        {
            console.log(this.state.object.messages)
            

            for (const iterator of this.state.object.messages) {
                if(iterator.isSent==true)
                {
                    dis.push(<div>
                        {/* <div className></div> */}
                        <div className="col-sm-12" style={{backgroundColor:"#E4C7AB"}}>
                            <p className="text-right">
                            {iterator.message}
                            </p>
                        </div>
                    </div>);
                }
                else
                {
                    dis.push(<div>
                        <div className="col-sm-12" style={{backgroundColor:"#FBECDC"}}>
                        <p className="text-left">
                            {iterator.message}
                            </p>
                        </div>
                    </div>);
                }
                
                // console.log(iterator);
            }
        }
        
        
        return(
        <div className="container-fluid">
            <div className="row">
               <div className="col-sm-12 text-black" style={{backgroundColor:"#FFCBA4"}}> 
                    <p><b>{this.props.with.name.fname + " " + this.props.with.name.lname}</b></p>
               </div>
            </div>
            {dis.map((value) => {return value})}
            <div className="row">
                <div className="col-sm-11">
                    <input  className="form-control" style={{boxShadow: "0 2px 2px 2px #A5D9EB"}} type="text" placeholder="Enter Message" 
                    onChange={this.bindMessage.bind(this)}/>
                </div>
                <div className="col-sm-1">
                    <button className="btn btn-success" onClick={this.sendMessage}>Send</button>
                </div>
            </div>
        </div>
        );
    }
}
export default Conversation;