import React from 'react';
import Header from './header';
import Body from './body';
import Axios from 'axios';

class App extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={
            menu: "home",
            h:[],
            s:[],
            c_h:[],
            c_s:[],
            status:"null"
        }
        this.getData();
        
    }

    setHouseTo = (what) =>{
        console.log("house changed");
        loop1:
        for (const iterator of this.state.s) {
            for (const iterator1 of iterator.houses) {
                if(iterator1.id==what.id)
                {
                    this.setState({c_h: what, c_s: iterator});
                    break loop1;
                }
            }     
            // console.log(iterator) ;     
        }
    }

    getData = () =>{
        Axios.post("http://localhost:8081/user/getUserSocieties", 
            {
                id: this.props.u.id
            }).then((Response) => {
                    console.log(Response.data);
                    var soc = Response.data;
                    Axios.post("http://localhost:8081/user/getUserHouses", 
                    {
                        id: this.props.u.id
                    }).then((Response) => {
                            console.log(Response.data);
                            this.setState({h: Response.data, s: soc}, 
                            () => {
                                this.setState({status: "finished"});
                                for (const iterator of this.state.h) {
                                    this.setHouseTo(iterator);
                                }
                            });
                    });
                });
    }
    switchMenu = (menuitem) =>{
        this.setState({menu: "home"}, () => {this.setState({menu: menuitem})});
    }
    

    render()
    {
        // console.log(this.state.status);
        if(this.state.status=="finished")
        {
            return(
                <div>
                    <Header switchMenu={this.switchMenu} u={this.props.u} h={this.state.h} 
                    s={this.state.s} c_h={this.state.c_h} c_s={this.state.c_s} 
                    setHouseTo={this.setHouseTo}/>
                    <Body menu={this.state.menu} u={this.props.u} h={this.state.h} 
                    s={this.state.s} c_h={this.state.c_h} c_s={this.state.c_s}/>
                </div>
            )
        }
        else
        {
            return(
                <div>loading...........</div>
            )
        }
        
    }
}
export default App;