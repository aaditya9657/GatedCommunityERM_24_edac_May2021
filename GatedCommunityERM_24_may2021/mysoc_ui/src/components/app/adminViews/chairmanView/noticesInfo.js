import React from 'react';

class NoticesInfo extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        //return(
        //     <div className="row border border-dark" style={{margin:"20px", borderRadius:"20px"}}>
        //     <h1 className="col-sm-12">Notice </h1>
        //     <div className="col-sm-10">
        //         <table>
        //             <tbody>
        //                 <tr>
        //                     <th className="col-sm-1">Subject :</th>
        //                     <td>{this.props.object.subject}</td>
        //                 </tr>
        //                 <tr>
        //                     <th className="col-sm-1">Body :</th>
        //                     <td>{this.props.object.content}</td>
        //                 </tr>
        //             </tbody>
        //         </table>
        //     </div>

        //     <div className="col-sm-2">
        //         <table>
        //             <tbody>
        //                 <tr>
        //                     <th>Date of Issue :</th>
        //                     <td>{this.props.object.date_of_issue}</td>
        //                 </tr>
        //                 <tr>
        //                     <th>Date of Expiry :</th>
        //                     <td>{this.props.object.date_of_expiry}</td>
        //                 </tr>
        //             </tbody>
        //         </table>
        //     </div>
        // </div>
       // );
        return(
       <div className="container">
            <div class="card" style={{margin:"20px"}}>
                <div class="card-header" style={{backgroundColor:"#FBECDC"}}>
                    <span style={{fontSize:"20px", fontWeight:"bold"}}>
                        Subject:
                    </span>&nbsp;
                    <span>
                        {this.props.object.subject}
                    </span>
                </div>
                <div class="card-body">
                    {this.props.object.content}
                </div>
                <div class="card-footer col-sm-12" style={{backgroundColor:"#FBECDC"}}>
                    <span className="col-sm-3" style={{fontSize:"20px", fontWeight:"bold"}}>
                        Date of issue:
                    </span>&nbsp;
                    <span>
                        {this.props.object.date_of_issue}
                       
                    </span>
                    
                    
                    <span className="col-sm-3" style={{fontSize:"20px", fontWeight:"bold"}}>
                        Date of expiry:
                    </span>&nbsp;
                    <span>
                    {this.props.object.date_of_expiry}
                    </span>
                   

                </div>
            </div>
        </div>
        );
    }
}
export default NoticesInfo;