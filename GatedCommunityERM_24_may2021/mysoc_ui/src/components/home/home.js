import React from 'react';
import Header from './header'; 
import Login from './login';
import Register from './register';
import img from '../../../src/house7.jpg';


class Home extends React.Component
{

    constructor(props)
    {
        super(props);
        this.state={
            type: 1
        }
    }

    switchTypeTo = (which) =>{
        this.setState({type: which});
    }

    render()
    {
        switch (this.state.type) {
            case 1:
                return(
                    <div style={{ backgroundImage: `url(${img})`,backgroundRepeat:"no-repeat", backgroundSize:"cover" }}>
                        <Header switchTypeTo={this.switchTypeTo}/>
                        <Login setUser={this.props.setUser}/>
                    </div>
                );
                
        
            case 2:
                return(
                    <div style={{ backgroundImage: `url(${img})`,backgroundRepeat:"no-repeat", backgroundSize:"cover" }}>
                        <Header switchTypeTo={this.switchTypeTo}/>
                        <Register setUser={this.props.setUser}/>
                     </div>
                );
                
           default: 
                return(
                    <div>
                        <Header switchTypeTo={this.switchTypeTo}/>
                        <Login setUser={this.props.setUser}/>
                    </div>
                );
        }
        
    }
}

export default Home;