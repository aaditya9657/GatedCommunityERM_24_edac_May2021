import React from 'react';

class Header extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
       console.log(this.props.s);
        var dis2 = [];
        for (const iterator of this.props.h) 
        {
             console.log(iterator);
            for (const iterator1 of this.props.s) 
            {
                console.log(iterator1);
                for (const iterator2 of iterator1.houses) 
                {
                    if(iterator.id==iterator2.id)
                    {
                        //console.log(iterator);
                        let found=false;
                        for (const iterator3 of dis2) 
                        {
                            if(iterator3.house.id==iterator.id)
                            {
                                found=true;
                            }
                        }
                        if(found==false)
                        {
                            const temp=new Object();
                            temp.house=iterator;
                            temp.soc=iterator1;
                            dis2.push(temp);
                        }
                        //dis.push(<a className="dropdown-item" href="#" onClick={this.props.setHouseTo.bind(this,iterator)}>{iterator.wing + "-" + iterator.flat_no + "("+iterator1.name+")"}</a>);
                    }
                }
            }
           // console.log(iterator)
            
        }
         //console.log(this.props.s);

        var dis1 = [];
            for (const iterator of this.props.c_s.committee) 
        {
            if(iterator.designation =="Chairman" && iterator.id == this.props.u.id) 
            {
                dis1.push(<li className="nav-item">
                <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "chairmanView")}>
                    Chairman View</a>
            </li>)
            }
            else if(iterator.designation == "Secretary" && iterator.id == this.props.u.id)
            {
                dis1.push(<li className="nav-item">
                <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "secretaryView")}>
                    Secretary View</a>
            </li>)
            }
            else if(iterator.designation == "Treasurer" && iterator.id == this.props.u.id)
            {
                dis1.push(<li className="nav-item">
                <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "treasurerView")}>
                Treasurer View</a>
            </li>)
            }

        }
        
        return(             
                 <nav className=" navbar navbar-expand-sm" style={{backgroundColor:"#61C2A2"}}>
                    <ul className="navbar-nav">
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "home")}>Home</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "visitors")}>Visitors</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "localservices")}>Local Services</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "notices")}>Notices</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "communication")}>Communication</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "community")}>Community</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "gate")}>Gate</a>
                        </li>
                        {dis1.map((value) => {return value})}
                    </ul>
                    <ul className="navbar-nav ml-auto">
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "maintenance")}>Maintenance</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link text-white" href="#" onClick={this.props.switchMenu.bind(this, "profile")}>Profile</a>
                        </li>
                        <li className="nav-item dropdown">
                            <a className="nav-link dropdown-toggle text-white" href="#" id="navbardrop" data-toggle="dropdown">
                                House
                            </a>
                            <div className="dropdown-menu"  style={{backgroundColor:"#75E6DA"}}>
                                {dis2.map((value) => {return <a className="dropdown-item" href="#" onClick={this.props.setHouseTo.bind(this,value.house)}>{value.house.wing + "-" + value.house.flat_no + "("+value.soc.name+")"}</a>})}
                            </div>
                        </li>
                    </ul> 
                </nav>
        );
    }
}

export default Header;