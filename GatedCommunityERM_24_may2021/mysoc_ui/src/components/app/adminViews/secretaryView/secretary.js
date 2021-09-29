import React from 'react';
import VT from './visitorsTab';
import LST from './localServicesTab';
class Secretary extends React.Component
{
    constructor(props)
    {
        super(props);

    }

    render()
    {
        return(
            <div>
                <VT u={this.props.u} h={this.props.h} 
                        s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></VT>
                        
                 <LST u={this.props.u} h={this.props.h} 
                        s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></LST>       
            </div>
        );
    }
}
export default Secretary;