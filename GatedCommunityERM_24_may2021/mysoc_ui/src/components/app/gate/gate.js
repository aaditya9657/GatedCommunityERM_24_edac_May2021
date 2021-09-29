import React from 'react';
import LSGT from './localservicesgatetab';
import VGT from './visitorsgatetab';
import NGT from './notifygatetab';
import PAET from './preapproveentriestab';
class Gate extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        return(
            <div>
                <VGT u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                <LSGT u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></LSGT>
                <NGT u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                <PAET u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></PAET>
            </div>
        );
    }
}
export default Gate;