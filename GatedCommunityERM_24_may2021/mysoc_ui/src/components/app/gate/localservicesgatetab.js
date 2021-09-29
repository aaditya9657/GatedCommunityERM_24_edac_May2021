import React from "react";
import LSG from './localservicesgate';
import Axios from 'axios';

class LocalServicesGateTab extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis = [];
        // console.log(this.state.objects);
        for (const iterator of this.props.c_h.local_services) 
        {
            //  console.log(iterator);
             dis.push(<LSG object={iterator}></LSG>);
        }

        return(
            <div className="row">
               <h1 className="col-sm-12" style={{marginLeft:"20px",marginTop:"20px"}}>Local Services</h1>
                <div className="col-sm-12 container-fluid">
                    <div className="row flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}} >
                        {dis.map((value) => { return value})}
                </div>
            </div>
            </div>

        );
    }


}
export default LocalServicesGateTab;