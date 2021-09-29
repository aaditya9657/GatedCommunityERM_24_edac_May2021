import React from 'react';
import Communication from './communication/communication';
import Community from './community/community';
import Gate from './gate/gate';
import Home from './home/home';
import LocalServices from './localservices/localservices';
import Notices from './notices/notices';
import Profile from './profile/profile';
import Visitors from './visitors/visitors'; 
import Maintenance from './maintenance/maintenance';
import Chairman from './adminViews/chairmanView/chairman';
import Secretary from './adminViews/secretaryView/secretary';
import Treasurer from './adminViews/treasurerView/treasurer';

class Body extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        // console.log(this.props.menu);
        // console.log(this.props.c_s);
        switch (this.props.menu) 
        {
            case "communication":  
                return(
                    <div>
                        <Communication u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                );  
            case "community":
                return(
                    <div>
                        <Community u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                ); 
            case "gate":
                return(
                    <div>
                        <Gate u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                ); 
            case "home":
                return(
                    <div>
                        <Home u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                ); 
            case "localservices":
                return(
                    <div>
                        <LocalServices u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                ); 
            case "notices":
                return(
                    <div>
                        <Notices u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                ); 
            case "profile": 
                return(
                    <div>
                        <Profile u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                ); 
            case "visitors":
                return(
                    <div>
                        <Visitors u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                ); 
            case "maintenance":
                    return(
                        <div>
                            <Maintenance u={this.props.u} h={this.props.h} 
                        s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                        </div>
                    ); 
            case "chairmanView":
                    return(
                        <div>
                            <Chairman u={this.props.u} h={this.props.h} 
                        s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                        </div>
                    ); 
            case "secretaryView":
                    return(
                        <div>
                            <Secretary u={this.props.u} h={this.props.h} 
                        s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                        </div>
                    ); 

            case "treasurerView":
                    return(
                        <div>
                            <Treasurer u={this.props.u} h={this.props.h} 
                        s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                        </div>
                    ); 
            default:
                return(
                    <div>
                        <Home u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                ); 
        }
    }
}
export default Body;