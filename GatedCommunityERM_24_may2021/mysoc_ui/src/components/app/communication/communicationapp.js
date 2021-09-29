import React from 'react';
import CH from './communicationheader';
import CB from './communicationbody';
class CommunicationApp extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={        
            menu1: "chat",
            view_object: []
        }
    }
    switchMenu = (menuitem1, obj) =>{
        this.setState({menu1: menuitem1, view_object: obj}, () => {console.log(this.state.menu1)});
    }
    render()
    {
        return(
            <div className="container-fluid">
                <CH switchMenu={this.switchMenu}></CH>
                <CB menu1={this.state.menu1} u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s} switchMenu={this.switchMenu} 
                    view_object={this.state.view_object}></CB>
            </div>
                

        );
    }
}
export default CommunicationApp;