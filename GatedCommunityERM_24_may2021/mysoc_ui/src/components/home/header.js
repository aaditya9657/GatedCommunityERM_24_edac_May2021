import React from 'react';

class Header extends React.Component
{
    constructor(props)
    {
        super(props);
    }
    render()
    {
        return(
            <nav className="navbar navbar-expand-sm" style={{backgroundColor: "#1E5162"}}>
                <ul className="navbar-nav">
                    <li className="nav-item">
                        <a className="nav-link text-white" href="#" onClick={this.props.switchTypeTo.bind(this,1)}>Login</a>
                    </li>
                    <li className="nav-item">
                        <a className="nav-link text-white" href="#" onClick={this.props.switchTypeTo.bind(this,2)}>Register</a>
                    </li>
                </ul>
          </nav>
        );
    }
}

export default Header;