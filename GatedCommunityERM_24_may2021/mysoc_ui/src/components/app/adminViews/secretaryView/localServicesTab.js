import axios from 'axios';
import React from 'react';
import LS from './localServicesS';
class LocalServicesTab extends React.Component
{
    constructor(props)
    {
        super(props);
        this.state ={ls:[]};
        this.getLocalServices();
    }

    getLocalServices = () =>{
        axios.post("http://localhost:8081/society/getLocalServices", 
        {
            id: this.props.c_s.id
        }).then((Response) => {
            console.log(Response.data);
            this.setState({ls: Response.data});
        })
    }

    addLocalService = () =>{
        axios.post("http://localhost:8081/society/getLocalServices", 
        {
            id: this.props.c_s.id
        }).then((Response) => {
            console.log(Response.data);
            this.setState({ls: Response.data});
        })
    }

    render()
    {
           var dis = [];

    //    for (const iterator1 of this.props.c_s.houses) 
    //        {
            for (const iterator of this.state.ls) 
            {
                dis.push(
                    <LS object={iterator} c_s={this.props.c_s} id={iterator.id} fname={iterator.name.fname} lname={iterator.name.lname} mobiles={iterator.mobiles[0].mob_no}
                    emails={iterator.emails[0].email} types={iterator.types} getLocalServices={this.getLocalServices}></LS>
           
            );

            }
        // }      
        console.log(this.props.c_s);

        return(
            <div className="row">
            <h1 className="col-sm-12">Local Services</h1>
            <div className="col-sm-12 card  container">
                    <table className="table table-striped">
                        <thead>
                            <tr style={{backgroundColor:"#E4D4C8"}}>
                                <th>Name</th>
                                <th>Mobile No</th>
                                <th>EmailId</th>
                                <th>Type</th>
                                <th>Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            {dis.map((value) => { return value})}
                        </tbody>
                    </table>
                
                </div>
            </div>
             
        );
    }
}
export default LocalServicesTab;