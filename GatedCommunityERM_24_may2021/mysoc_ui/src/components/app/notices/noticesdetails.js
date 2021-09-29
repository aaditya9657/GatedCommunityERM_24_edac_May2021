import React from 'react';

class NoticesDetails extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        return(
            // <div className="row border border-dark">
            //     <div className="col-sm-10">
            //         <table>
            //             <tbody>
            //                 <tr>
            //                     <th className="col-sm-1">Subject :</th>
            //                     <td>{this.props.object.subject}</td>
            //                 </tr>
            //                 <tr>
            //                     <th className="col-sm-1">Body :</th> 
            //                     <td><p>{this.props.object.content}</p></td>
            //                 </tr>
            //             </tbody>
            //         </table>
            //     </div>

            //     <div className="col-sm-2">
            //         <table>
            //             <tbody>
            //                 <tr>
            //                     <th>Dated :</th>
            //                     <td>{this.props.object.date_of_issue}</td>
            //                 </tr>
            //             </tbody>
            //         </table>
            //     </div>
            // </div>

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
                <div class="card-footer" style={{backgroundColor:"#FBECDC"}}>
                    <span style={{fontSize:"20px", fontWeight:"bold"}}>
                        Date:
                    </span>&nbsp;
                    <span>
                        {this.props.object.date_of_issue}
                    </span>
                </div>
            </div>
        </div>
        );
    }
}
export default NoticesDetails;