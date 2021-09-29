import React from 'react';
import ND from './noticesdetails';
class Notices extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis = [];

        for (const iterator of this.props.c_h.notices) 
        {
             //console.log(iterator);
                dis.push(<ND object={iterator}></ND>);
        }
        // console.log(dis);
        return(
            <div className="row">
                {dis.map((value) => { return value})}       
            </div>
        );
    }
}
export default Notices;