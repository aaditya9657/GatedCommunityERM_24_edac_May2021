import React from 'react';

class Chat extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        // console.log(this.props.object.messages);
        var lst_chat="";
        for (const iterator of this.props.object.messages) 
        {
            lst_chat = iterator;
               
        }
        return(
            <div className="row"  style={{backgroundColor:"papayawhip", margin:"20px",borderRadius:"10px"}} onClick={this.props.switchMenu.bind(this, "conversation", this.props.object.with)} >
                <p className="justify-content-end" style={{padding:"5px",margin:"3px"}}>{this.props.object.with.name.fname + " " + this.props.object.with.name.lname}:</p>&nbsp;
                <p className="float-right" style={{padding:"5px",margin:"3px"}}>{lst_chat.message}</p>
            </div>
        );
    }
}
export default Chat;