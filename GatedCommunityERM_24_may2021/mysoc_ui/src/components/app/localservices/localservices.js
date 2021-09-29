import React from 'react';
import LST from './localservicestype';
import LSI from './localservicesinfo';

class LocalServices extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={view:"localseriveshome" , view_object:[]};
    }

    switchViewTo = (what,obj) =>{
        this.setState({view:what,view_object:obj});
    }

    render()
    {        
        switch (this.state.view) 
        {
            case "localseriveshome":  
                var dis = [];
                var added = false;
                for (const iterator of this.props.c_s.local_services) 
                {
                    added = false; 
                    for (const iterator1 of dis) {
                        if(iterator1.category == iterator.types)
                        {
                            added = true;
                            iterator1.local_services.push(iterator);
                            break;
                        }
                    }
                    if(added==false)
                    {
                        const obj = new Object();
                        obj.category = iterator.types;
                        obj.local_services = [];
                        obj.local_services.push(iterator);
                        dis.push(obj);
                    }

                    //console.log(iterator);
                }

                var dis1 = [];

                for (const iterator of dis) {
                    dis1.push(<LST object={iterator} switchViewTo={this.switchViewTo}/>);
                    // console.log(iterator);
                }
            
                return(
                    <div className="container-fluid">
                        {dis1.map((value) => { return value})}
                    </div>
                );
                
            case "localservicesinfo":
                return(
                    <div>
                        <LSI object={this.state.view_object} u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                ); 
           
            default:
                var dis = [];
                var added = false;
                for (const iterator of this.props.c_s.local_services) 
                {
                    added = false; 
                    for (const iterator1 of dis) {
                        if(iterator1.category == iterator.types)
                        {
                            added = true;
                            iterator1.local_services.push(iterator);
                            break;
                        }
                    }
                    if(added==false)
                    {
                        const obj = new Object();
                        obj.category = iterator.types;
                        obj.local_services = [];
                        obj.local_services.push(iterator);
                        dis.push(obj);
                    }

                    //console.log(iterator);
                }

                var dis1 = [];

                for (const iterator of dis) {
                    dis1.push(<LST object={iterator} switchViewTo={this.switchViewTo}/>);
                    // console.log(iterator);
                }
            
                return(
                    <div className="container-fluid">
                        {dis1.map((value) => { return value})}
                    </div>
                );
        }
    }
}
export default LocalServices;