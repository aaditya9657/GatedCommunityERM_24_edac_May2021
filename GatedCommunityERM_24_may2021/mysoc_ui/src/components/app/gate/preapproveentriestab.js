import React from "react";
import PAE from './preapproveentries';

class PreApproveEntriesTab extends React.Component
{
    constructor(props)
    {
        super(props);
    }

    render()
    {
        return(
            <div className="row">
            <h1 className="col-sm-12">Pre Approved Entries</h1>
             {/* <div className="col-sm-12 container-fluid"></div> */}
            <div className="row border border-dark flex-row flex-sm-nowrap pt-3" style={{overflow: "auto"}}>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
                <PAE></PAE>
            </div>
            </div>
        );
    }
}
export default PreApproveEntriesTab;