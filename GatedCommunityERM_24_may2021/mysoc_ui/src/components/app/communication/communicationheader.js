import React from 'react';

class CommunicationsHeader extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    
    render()
    {
        return(             
                 <nav className=" navbar navbar-expand-sm container-fluid" style={{marginTop:"10px", backgroundColor:"darksalmon"}}>
                    <ul className="navbar-nav  col-sm-12">
                        <li className="nav-item col-sm-6">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "chat", null)}>Chat</a>
                        </li>
                        <li className="nav-item col-sm-6">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "residents", null)}>Residents</a>
                        </li>
                    </ul> 
                </nav>
        );
    }
}

export default CommunicationsHeader;