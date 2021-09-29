import React from "react";

class NotifyGate extends React.Component
{
    constructor(props)
    {
        super(props);

    }
    render()
    {
        return(
            <div className="col-sm-2 border border-dark text-center">
                <div>
                    <h4>Fire Alert</h4>
                </div>
                <div>
                    <button>Raise Alarm</button>
                </div>
            </div>
        );
    }
} 
export default NotifyGate;