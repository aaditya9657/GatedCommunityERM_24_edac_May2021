import React from 'react';
import R from './residents';
import Axios from 'axios';
class ResidentsTab extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis = [];

        for (const iterator of this.props.c_s.houses) 
        {
            // console.log(iterator);
            for (const iterator1 of iterator.users) 
            {
                // console.log(iterator1);
                dis.push(<R object={iterator1} flat_no={iterator.wing +"-"+iterator.flat_no}></R>);
            }     
        }
        return(
            <div className="row">
            <h1 className="col-sm-12" style={{marginLeft:"20px",marginTop:"20px"}}>Residents</h1>
            <div className="col-sm-12 container-fluid">
                <div className="row flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}}>
                {dis.map((value) => { return value})}
                </div>
            </div>
             
         </div>
        );
    }

    
}
export default ResidentsTab;