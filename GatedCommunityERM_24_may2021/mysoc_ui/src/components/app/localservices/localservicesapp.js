import React from 'react';
import LS from './localservices';
 class LocalServicesApp extends React.Component
 {
    constructor(props)
    {
        super(props);
        this.state={
            menu: "localservices"
        }
    }

    switchMenu = (menuitem) =>{
        this.setState({menu: "localservices"}, () => {this.setState({menu: menuitem})});
        // this.setState({menu: menuitem}, () => {console.log(this.state.menu)});
    }
    

     render()
     {
         return(
            <div>
            
            <LS menu={this.state.menu} u_id={this.props.u_id} h_id={this.props.h_id} s_id={this.props.s_id} l_id={this.props.l_id}/>
        </div>

         );
     }
 }
 export default LocalServicesApp;