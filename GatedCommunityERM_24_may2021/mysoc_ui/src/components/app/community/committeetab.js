import React from 'react';
import C from './committee';
import Axios from 'axios';
class CommitteeTab extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis = [];
        var dis1=[];
         //console.log(this.props.c_s);
        for (const iterator of this.props.c_s.committee) 
        {
            //console.log(iterator);
                dis.push(<C object={iterator}></C>);
        }
        
        // console.log(dis);

        return(
            <div className="row">
            <h1 className="col-sm-12" style={{marginLeft:"20px",marginTop:"20px"}}>Committee</h1>
            <div className="col-sm-12 container-fluid">
                <div className="row flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}}>
                    {dis.map((value) => { return value})}
                </div>
            </div>
             
         </div>
        );
    }

    
}
export default CommitteeTab;