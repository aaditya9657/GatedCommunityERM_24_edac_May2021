import React from 'react';
import NC from './noticesC';
import NI from './noticesInfo';
import Axios from 'axios';

class NoticesTab extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state={view:"notices",view_obj:[], d_start: "", d_exp: "", subject: "", body: "", notices:[]};
        this.getNotices();
    }

    

    getNotices = () =>{
        
        Axios.post("http://localhost:8081/society/getNotices", 
        {
            id: this.props.c_s.id
        }).then((Response) =>{
            console.log(Response.data);
            this.setState({notices: Response.data});
        })
    }

    bindD_start = (event) =>{
        this.setState({d_start: event.target.value}, console.log("d_s" +this.state.d_start));
    }

    bindD_exp = (event) =>{
        this.setState({d_exp: event.target.value}, console.log("d_e" +this.state.d_exp));
    }

    bindSubject = (event) =>{
        this.setState({subject: event.target.value}, console.log(this.state.subject));
    }

    bindBody = (event) =>{
        this.setState({body: event.target.value}, console.log(this.state.body));
    }

    switchView = (what,obj) =>{
        this.setState({view:what,view_obj:obj});
    }

    submitNotice = () =>{
        Axios.post("http://localhost:8081/house/sendNotice", 
        {
            start_date: this.state.d_start,
	        expiry_date: this.state.d_exp, 
	        subject: this.state.subject,
	        content: this.state.body,
	        soc_id: this.props.c_s.id
        }).then((Response) =>{
            console.log(Response)
            this.getNotices();
        })
    }

    render()
    {
        switch(this.state.view)
        {
            case "notices":
                var dis = [];

        // console.log(this.props.c_s);
        for (const iterator of this.state.notices) 
        {
             //console.log(iterator);
                dis.push(<NC object={iterator} switchView={this.switchView}></NC>);
        }
        // console.log(dis);
        var d = new Date();
        var dd = ""+d.getFullYear()+"-0"+d.getMonth()+"-"+d.getDate();
        // console.log(d.getFullYear()+"-"+d.getMonth()+"-"+d.getDate());
        return(
            <div className="row container">
            <h1 className="col-sm-12">Notices </h1>
            <div className="row container-fluid">
                <div className="col flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}}>
                {dis.map((value) => { return value})}
                </div>
            </div>
            <div className="col-sm-12">
                 <label><b>Date of Start</b></label>
                 <input type="date" min={dd} className="col"  style={{backgroundColor:"#CBEACB"}} onChange={this.bindD_start.bind(this)}></input>
                 <label><b>Date of Expiry</b></label>
                 <input type="date" className="col"  style={{backgroundColor:"#CBEACB"}} onChange={this.bindD_exp.bind(this)} onClick={this.bindD_exp.bind(this)}></input>
                 <label><b>Subject</b></label>
                 <input type="text" className="col"  style={{backgroundColor:"#CBEACB"}} onChange={this.bindSubject.bind(this)}></input>
                 <label><b>Body</b></label>
                 <input type="text" className="col"  style={{backgroundColor:"#CBEACB"}} onChange={this.bindBody.bind(this)}></input>
                 <button className="btn btn-success" style={{margin:"10px"}} onClick={this.submitNotice}>Add Notice</button>
             </div>
             
         </div>
        );

        case "noticesInfo":
        return(
            <div>
                <NI object={this.state.view_obj} u={this.props.u} h={this.props.h} 
                    s={this.props.s} c_h={this.props.c_h} c_s={this.props.c_s}></NI>
            </div>
        );

        default :
        var dis = [];

        console.log(this.props.c_s);
        for (const iterator of this.props.c_s.notices) 
        {
             //console.log(iterator);
                dis.push(<NC object={iterator} switchView={this.switchView}></NC>);
        }
        // console.log(dis);
        return(
            <div className="row">
            <h1 className="col-sm-12">Notices </h1>
            <div className="row container-fluid">
                <div className="col flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}}>
                {/* {dis.map((value) => { return value})} */}
                </div>
            </div>
             <div className="col-sm-12">
                 <label>Date of Start</label>
                 <input type="date" className="col"></input>
                 <label>Date of Expiry</label>
                 <input type="date" className="col"></input>
                 <label>Subject</label>
                 <input type="text" className="col"></input>
                 <label>Body</label>
                 <input type="text" className="col"></input>
             </div>
         </div>
        );



        }
        
    }
}
export default NoticesTab;