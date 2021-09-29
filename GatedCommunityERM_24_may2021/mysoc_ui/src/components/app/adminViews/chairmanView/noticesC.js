import React from 'react';
import Axios from 'axios';

class Notices extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        return(
            <div className="row border border-dark" style={{margin:"10px",height:"35px", borderRadius:"10px", backgroundColor:"#FBECDC"}} onClick={this.props.switchView.bind(this,"noticesInfo",this.props.object)}>
            <div className="col-sm-9">
                <table>
                    <tbody>
                        <tr>
                            <th className="col-sm-2">Subject :</th>
                            <td>{this.props.object.subject}</td>
                        </tr>
                    </tbody>
                </table>
            </div>

            <div className="col-sm-3">
                <table>
                    <tbody>
                        <tr>
                            <th className="col-sm-5">Dated :</th>
                            <td>{this.props.object.date_of_issue}</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        );
    }
}
export default Notices;