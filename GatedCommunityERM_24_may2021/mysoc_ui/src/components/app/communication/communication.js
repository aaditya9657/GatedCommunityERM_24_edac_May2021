import React from 'react';
import CA from './communicationapp';

class Communication extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    
    
    render()
    {
        return(
            <div>
               <CA u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
            </div>
                

        );
    }
}
export default Communication;