import React from 'react';
import LSD from './localservicesdetails';
class LocalServicesType extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        //console.log(this.props.object);

        var dis = [];

        for (const iterator of this.props.object.local_services) 
        {
             //console.log(iterator);
                dis.push(<LSD object={iterator} switchViewTo={this.props.switchViewTo}></LSD>);
        }
        return(
            <div className="row">
               <h1 className="col-sm-12">{this.props.object.category}</h1>
               <div className="col-sm-12 container-fluid">
                   <div className="row flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}}>
                   {dis.map((value) => { return value})}
                   </div>
               </div>
                
            </div>
        );
    }
}
export default LocalServicesType;