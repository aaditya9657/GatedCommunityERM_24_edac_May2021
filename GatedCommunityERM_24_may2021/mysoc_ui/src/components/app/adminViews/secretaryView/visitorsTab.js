import React from 'react';
import V from './visitorsS';

class VisitorsTab extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        var dis=[];
        for (const iterator of this.props.c_s.houses) {
            for (const iterator1 of iterator.visitors) {
                
                    dis.push(
                      
                        <V fname={iterator1.name.fname}lname={iterator1.name.lname} 
                            mob_no={iterator1.mob_no} reason={iterator1.reason} in_time={iterator1.in_time} 
                            out_time={iterator1.out_time} vehicle_type={iterator1.Vehicletype} registration_no={iterator1.registration_no} 
                            wing={iterator.wing} flat_no={iterator.flat_no}></V>
                    ); 
            }
        
        }

        return(
            <div className="row">
            <h1 className="col-sm-12">Visitors</h1>
            <div className="col-sm-12 container-fluid">
                <div className="row flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}}>
                {dis.map((value) => { return value})}
                </div>
            </div>
             
         </div>
        );
    }
}
export default VisitorsTab;