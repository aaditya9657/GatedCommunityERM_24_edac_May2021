import React from 'react';
import VGT from '../gate/visitorsgatetab';
import LSGT from '../gate/localservicesgatetab';
import RT from '../community/residentstab';
import ECT from '../community/emergencycontactstab';
import CT from '../community/committeetab';
class Home extends React.Component
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
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></VGT>
                <LSGT u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></LSGT>
                <RT u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></RT>
                <CT u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></CT>
                <ECT u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></ECT>
           </div>
            
        );
    }
}
export default Home;