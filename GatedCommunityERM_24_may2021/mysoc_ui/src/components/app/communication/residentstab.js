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
            for (const iterator1 of iterator.users) 
            {
                if(iterator1.id != this.props.u.id)
                    dis.push(<R object={iterator1} house_no={iterator.wing + "-" + iterator.flat_no} switchMenu={this.props.switchMenu}></R>);
            }                
        }

        return(
            <div className="container">
                {dis.map((value) => { return value})}
            </div>

        );


    }
}
export default ResidentsTab;