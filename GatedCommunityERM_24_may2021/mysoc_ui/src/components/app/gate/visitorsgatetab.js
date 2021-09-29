import React from "react";
import VG from './visitorsgate';
import Axios from 'axios';
class VisitorsGateTab extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis = [];

        for (const iterator of this.props.c_h.visitors) 
        {
            //  console.log(iterator);
             dis.push(<VG object={iterator}></VG>);
        }
        // console.log(dis);
        return(

            <div className="row">
                <h1 className="col-sm-12" style={{marginLeft:"20px",marginTop:"20px"}}>Visitors</h1>
                <div className="col-sm-12 container-fluid">
                    <div className="row flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}} >
                        {dis.map((value) => { return value})}
                    </div>
                </div>
            </div>
        );
    }
}

export default VisitorsGateTab;