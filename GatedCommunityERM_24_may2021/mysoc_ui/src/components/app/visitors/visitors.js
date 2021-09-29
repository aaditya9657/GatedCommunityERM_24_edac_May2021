import React from 'react';
import VD from './visitordetails';

class Visitors extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis=[];
        for (const iterator of this.props.c_h.visitors) 
        {
            //  console.log(iterator);
                dis.push(<VD fname={iterator.name.fname} mname={iterator.name.mname} lname={iterator.name.lname} mob_no={iterator.mob_no} reason={iterator.reason} in_time={iterator.in_time} out_time={iterator.out_time} vehicle_type={iterator.Vehicletype} registration_no={iterator.registration_no} ></VD>);
        }
        return(
            <div className="container">
                 {dis.map((value) => { return value})}
            </div>
        );
    }
}
export default Visitors;