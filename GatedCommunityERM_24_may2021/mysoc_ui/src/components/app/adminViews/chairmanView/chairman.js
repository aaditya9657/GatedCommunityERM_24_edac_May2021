import React from 'react';
import RT from './residentsTab';
import NT from './noticesTab';

class Chairman extends React.Component
{
    constructor(props)
    {
        super(props);
    }
   
    render()
    {
        console.log();
        return(
          
            <div >
                    <RT u={this.props.u} h={this.props.h} 
                        s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></RT>
           
                    <NT u={this.props.u} h={this.props.h} 
                         s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></NT>
            </div>
        );
    }
}
export default Chairman;