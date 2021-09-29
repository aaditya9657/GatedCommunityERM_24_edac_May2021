import React from 'react';
import NG from './notifygate';
class NotifyGateTab extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        return(

            <div className="row">
            <h1 className="col-sm-12">Notify Gate</h1>
            <div className="row flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}}>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
                <NG></NG>
            </div>
            </div>
        );
    }
}
export default NotifyGateTab;