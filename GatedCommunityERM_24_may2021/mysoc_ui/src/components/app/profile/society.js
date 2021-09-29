import axios from 'axios';
import React from 'react';
class Society extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={
            a_s:[],s_s:[],s_h:[],status:"null"
        }
        this.getSociety();
    }

    getSociety =() =>{
        axios.get("http://localhost:8081/society/getSocieties").then((Response) =>
        {
           console.log(Response.data); 
           this.setState({a_s:Response.data},()=>{
               loop:
            for (const iterator of this.state.a_s) 
            {
                for (const iterator1 of iterator.houses) {
                    this.setState({s_s:iterator,s_h:iterator1},()=>{
                        this.setState({status:"done"})
                        
                    });
                    break loop;
                }
               
            }
           });
            
        }
        )
    }
    addHouse =() =>{
        axios.post("http://localhost:8081/user/addHouse",{
            uid:this.props.u_id,
            sid:this.state.s_s.id,
            hid:this.state.s_h.id
        }).then((Response) =>
        {
            console.log(Response.data);
        })
    }
    changeHouse =(event) =>{
        for (const iterator of this.state.s_s.houses) {
            if(event.target.value==iterator.id)
            {
                this.setState({s_h:iterator},()=>{
                    console.log(this.state.s_h.name);
                })
            }
        }
    }

    changeSociety =(event) =>{
        for (const iterator of this.state.a_s) {
            if(event.target.value==iterator.id)
            {
                this.setState({s_s:iterator},()=>{
                    console.log(this.state.s_s.name);
                })
            }
        }

    }

    render()
    {
        if(this.state.status=="done")
        {
            var dis_s=[];
            for (const iterator of this.state.a_s)
            {
                dis_s.push(<option value={iterator.id}>{iterator.name}</option>)
            }
            var dis_h=[];
            for (const iterator of this.state.s_s.houses)
            {
                dis_h.push(<option value={iterator.id}>{iterator.wing+"-"+iterator.flat_no}</option>)
            }
            return(
                <div>
                    <label><b>Select Society</b></label>&nbsp;
                    <select name="society" id="society" onChange={this.changeSociety.bind(this)}>
                    {dis_s.map((value) =>{return value})}
                    </select>&nbsp;&nbsp;
                    <label><b>Select House</b></label>&nbsp;
                    <select name="house" id="house" onChange={this.changeHouse.bind(this)}>
                        {dis_h.map((value) =>{return value})}
                    </select>&nbsp;
                    <button className="btn btn-success" onClick={this.addHouse}>Add</button>
                </div>
            );
        }
        else
        {
            return(
                <></>
            );
        }
    }
   
}
export default Society;