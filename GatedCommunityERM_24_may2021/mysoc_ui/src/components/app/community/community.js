import React from 'react';
import ECT from './emergencycontactstab';
import CT from './committeetab';
import RT from './residentstab';

class Community extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        // console.log(this.props.c_s);
        return(
            <div>
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
export default Community;