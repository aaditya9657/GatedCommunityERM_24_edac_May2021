import React from 'react';
import CT from './chattab';
import RT from './residentstab';
import Conv from './conversation';
class CommunicationBody extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        //  console.log(this.props.menu1);
        switch(this.props.menu1)
        {
            case "chat":
                return(
                    <div>
                        <CT u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s} switchMenu={this.props.switchMenu}/>
                    </div>
                    );
            case "residents":
                return(
                    <div>
                        <RT u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s} switchMenu={this.props.switchMenu}/>
                    </div>
                    );
            case "conversation":
                return(
                    <div>
                        <Conv with={this.props.view_object} u={this.props.u}/>
                    </div>
                );
            default:
                return(
                    <div>
                        <CT u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}/>
                    </div>
                    );
        }
     }
}
export default CommunicationBody;