import React from 'react';
import C from './chat';
import Axios from 'axios';


class ChatTab extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={objects:[]};
        this.getUserMessages();
    }

    getUserMessages = () =>
    {
        // console.log("getting hlsg");
        
            //  console.log(this.props.h_id);
            Axios.post("http://localhost:8081/user/getMessages", 
            {
                id: this.props.u.id,
                s_id: this.props.c_s.id
            }).then((Response) => {
                    //  console.log(Response.data);
                    this.setState({objects: Response.data});
            });
    }

    render()
    {
        var dis = [];

        for (const iterator of this.state.objects) 
        {
            
            // console.log(iterator);
                dis.push(<C object={iterator} switchMenu={this.props.switchMenu}></C>);
        }

        return(
            <div className="container-fluid">
               {dis.map((value) => { return value})}
            </div>

        );


    }
}
export default ChatTab;